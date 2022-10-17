package com.company.M2ChallengeFerryRichard.model;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathSolution {
    @NotNull(message = "operand one can not be null or empty")
    private Integer operand1;
    @NotNull(message = "operand two can not be null or empty")
    private Integer operand2;
    private String operation;
    private Integer answer;

    public MathSolution() {
    }

    public MathSolution(Integer operand1, Integer operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = getAnswer(operation);
    }

    public int getAnswer(String operation){
        int returnVal;
        switch (operation){
            case "add": returnVal = operand1+operand2;
                break;
            case "subtract": returnVal = operand1-operand2;
                break;
            case "multiply": returnVal = operand1*operand2;
                break;
            case "divide": returnVal = operand1/operand2;
                break;
            default: returnVal= Integer.parseInt(null);
                break;
        }
        return returnVal;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return Objects.equals(operand1, that.operand1) && Objects.equals(operand2, that.operand2) && Objects.equals(operation, that.operation) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }
}
