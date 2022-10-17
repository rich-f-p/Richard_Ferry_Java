package com.company.M2ChallengeFerryRichard.controllers;
import com.company.M2ChallengeFerryRichard.model.MathSolution;
import com.company.M2ChallengeFerryRichard.model.Month;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
public class MonthMathController {
    private Month month;
    private Random randomMonth = new Random();

    @RequestMapping(path = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month monthConverter(@PathVariable int monthNumber){
        if(monthNumber>12 || monthNumber<1)
            throw new IllegalArgumentException("value is not within month range, range is 1-12");
        return month = new Month(monthNumber);
    }

    @RequestMapping(path ="/randomMonth" ,method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month randomMonth(){
        return month = new Month(randomMonth.nextInt(12)+1);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addInt(@RequestBody @Valid MathSolution math){
            math.setOperation("add");
            MathSolution newSol = new MathSolution(math.getOperand1(), math.getOperand2(), math.getOperation());
            return newSol;
    }

    @RequestMapping(path = "/subtract",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractInt(@RequestBody @Valid MathSolution math){
        math.setOperation("subtract");
        math.setAnswer(math.getOperand1()-math.getOperand2());
        return math;
    }

    @RequestMapping(path = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplyInt(@RequestBody @Valid MathSolution math){
        math.setOperation("multiply");
        math.setAnswer(math.getOperand1()* math.getOperand2());
        return math;
    }

    @RequestMapping(path = "/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideInt(@RequestBody @Valid MathSolution math){
        math.setOperation("divide");
        math.setAnswer(math.getOperand1()/math.getOperand2());
        return math;
    }

}
