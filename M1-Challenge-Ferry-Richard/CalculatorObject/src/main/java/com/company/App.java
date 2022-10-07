package com.company;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("1+1= "+cal.add(1,1));
        System.out.println("23-52= "+cal.subtract(23,52));
        System.out.println("34*2= "+cal.multiply(34,2));
        System.out.println("12/3= "+cal.divide(12,3));
        System.out.println("12/7= "+cal.divide(12,7));
        System.out.println("3.4+2.3= "+cal.add(3.4,2.3));
        System.out.println("6.7*4.4= "+cal.multiply(6.7,4.4));
        System.out.println("5.5-0.5= "+cal.subtract(5.5,0.5));
        System.out.println("10.8/2.2= "+cal.divide(10.8,2.2));
    }
}
