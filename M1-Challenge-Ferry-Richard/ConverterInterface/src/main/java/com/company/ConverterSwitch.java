package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
        String converted;
        switch (monthNumber){
            case 1:converted="January";
                    break;
            case 2:converted="February";
                break;
            case 3:converted="March";
                break;
            case 4:converted="April";
                break;
            case 5:converted="May";
                break;
            case 6:converted="June";
                break;
            case 7:converted="July";
                break;
            case 8:converted="August";
                break;
            case 9:converted="September";
                break;
            case 10:converted="October";
                break;
            case 11:converted="November";
                break;
            case 12:converted="December";
                break;
            default :converted = "The numerical value given doesn't match a month";
                break;
        }
        return converted;
    }

    @Override
    public String convertDay(int dayNumber) {
        String converted;
        switch (dayNumber){
            case 1:converted="Monday";
                break;
            case 2:converted="Tuesday";
                break;
            case 3:converted="Wednesday";
                break;
            case 4:converted="Thursday";
                break;
            case 5:converted="Friday";
                break;
            case 6:converted="Saturday";
                break;
            case 7:converted="Sunday";
                break;
            default: converted = "Error: Not a valid day";
        }
        return converted;
    }
}
