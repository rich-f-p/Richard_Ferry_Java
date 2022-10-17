package com.company.M2ChallengeFerryRichard.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Month {
    @Min(value = 1, message = "input out of range")
    @Max(value = 12,message = "input out of range")
    private int number;
    private String name;

    public Month() {
    }

    public Month(int number) {
        this.number = number;
        this.name = convertMonth(number);
    }

    public String convertMonth(int num){
        String returnVal = null;
        switch (num){
            case 1: returnVal = "January";
                break;
            case 2: returnVal = "February";
                break;
            case 3: returnVal = "March";
                break;
            case 4: returnVal = "April";
                break;
            case 5: returnVal = "May";
                break;
            case 6: returnVal = "June";
                break;
            case 7: returnVal = "July";
                break;
            case 8: returnVal = "August";
                break;
            case 9: returnVal = "September";
                break;
            case 10: returnVal = "October";
                break;
            case 11: returnVal = "November";
                break;
            case 12: returnVal = "December";
                break;
            default:
                break;
        }
        return returnVal;
    }

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return number == month.number && Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
