package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertMonth(1));
        System.out.println(converterSwitch.convertDay(1));
        System.out.println("=======");
        System.out.println(converterIf.convertMonth(1));
        System.out.println(converterIf.convertDay(1));
        System.out.println("=======");
        System.out.println(converterSwitch.convertMonth(12));
        System.out.println(converterSwitch.convertDay(7));
        System.out.println("=======");
        System.out.println(converterIf.convertMonth(12));
        System.out.println(converterIf.convertDay(7));
        System.out.println("=======");
    }
}
