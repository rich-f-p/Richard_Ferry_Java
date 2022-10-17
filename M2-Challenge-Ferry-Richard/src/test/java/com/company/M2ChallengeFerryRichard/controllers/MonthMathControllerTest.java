package com.company.M2ChallengeFerryRichard.controllers;


import com.company.M2ChallengeFerryRichard.model.MathSolution;
import com.company.M2ChallengeFerryRichard.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthMathController.class)
public class MonthMathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();
    private MathSolution inputMath;
    private MathSolution outputMath;
    private Month month;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldReturnARandomMonth() throws Exception {
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").isNotEmpty())
                .andExpect(jsonPath("$.name").isNotEmpty());
    }

    @Test
    public void shouldReturnAMonthBasedOnTheIntPassedThrough() throws Exception {
        month = new Month(1);
        String monthJson = mapper.writeValueAsString(month);
        mockMvc.perform(get("/month/{monthNumber}",1))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(monthJson));
    }

    @Test
    public void shouldThrowAn422ErrorWhenGivenNumberOutOfRange() throws Exception {
        //below range 1-12
        month = new Month(0);
        String monthJson = mapper.writeValueAsString(month);
        mockMvc.perform(get("/month/{monthNumber}",0))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

        //above range 1-12
        month = new Month(13);
        monthJson = mapper.writeValueAsString(month);
        mockMvc.perform(get("/month/{monthNumber}",0))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnTheSumOfPassedOperands() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(1);
        inputMath.setOperand2(2);
        inputMath.setOperation("add");
        String inputJson = mapper.writeValueAsString(inputMath);

        outputMath = new MathSolution();
        outputMath.setOperand1(1);
        outputMath.setOperand2(2);
        outputMath.setOperation("add");
        outputMath.setAnswer(3);
        String outputJson = mapper.writeValueAsString(outputMath);
        mockMvc.perform(post("/add")
                    .content(inputJson)
                    .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldThrow422ErrorIfOperandsAreNotValidIntegersForAdd() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(null);
        inputMath.setOperand2(2);
        inputMath.setOperation("add");
        String inputJson = mapper.writeValueAsString(inputMath);

        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnTheSubtractedResultOfTheOperands() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(5);
        inputMath.setOperand2(2);
        inputMath.setOperation("subtract");
        String inputJson = mapper.writeValueAsString(inputMath);

        outputMath = new MathSolution();
        outputMath.setOperand1(5);
        outputMath.setOperand2(2);
        outputMath.setOperation("subtract");
        outputMath.setAnswer(3);
        String outputJson = mapper.writeValueAsString(outputMath);
        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldThrowErrorIfOperandsAreNotValidIntegersForSubtract() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(null);
        inputMath.setOperand2(2);
        inputMath.setOperation("subtract");
        String inputJson = mapper.writeValueAsString(inputMath);

        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnTheDividedResultOfTheOperands() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(4);
        inputMath.setOperand2(2);
        inputMath.setOperation("divide");
        String inputJson = mapper.writeValueAsString(inputMath);

        outputMath = new MathSolution();
        outputMath.setOperand1(4);
        outputMath.setOperand2(2);
        outputMath.setOperation("divide");
        outputMath.setAnswer(2);
        String outputJson = mapper.writeValueAsString(outputMath);
        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldThrowErrorIfOperandsAreNotValidIntegersForDivide() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(null);
        inputMath.setOperand2(2);
        inputMath.setOperation("subtract");
        String inputJson = mapper.writeValueAsString(inputMath);

        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnTheMultipliedResultOfTheOperands() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(5);
        inputMath.setOperand2(2);
        inputMath.setOperation("multiply");
        String inputJson = mapper.writeValueAsString(inputMath);

        outputMath = new MathSolution();
        outputMath.setOperand1(5);
        outputMath.setOperand2(2);
        outputMath.setOperation("multiply");
        outputMath.setAnswer(10);
        String outputJson = mapper.writeValueAsString(outputMath);
        mockMvc.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldThrowErrorIfOperandsAreNotValidIntegersForMultiply() throws Exception {
        inputMath = new MathSolution();
        inputMath.setOperand1(null);
        inputMath.setOperand2(2);
        inputMath.setOperation("subtract");
        String inputJson = mapper.writeValueAsString(inputMath);

        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

}