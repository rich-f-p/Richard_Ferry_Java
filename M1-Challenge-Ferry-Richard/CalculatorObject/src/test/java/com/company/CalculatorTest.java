package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @Test
    public void shouldReturnTheSumOfTwoIntegers(){
        assertEquals(2,cal.add(1,1));
        assertEquals(8,cal.add(3,5));
        assertEquals(0,cal.add(0,0));
        assertEquals(100,cal.add(50,50));
        assertEquals(2,cal.add(5,-3));
    }
    @Test
    public void shouldReturnTheSumOfTwoDoubles(){
        assertEquals(2.8d,cal.add(1.5d,1.3d),0.01d);
        assertEquals(5.7d,cal.add(3.4d,2.3d),0.01d);
        assertEquals(4.0d,cal.add(2.0d,2.0d),0.01d);
        assertEquals(0.7d,cal.add(2.0d,-1.3d),0.01d);
        assertEquals(-2.3d,cal.add(-1.0d,-1.3d),0.01d);
    }
    @Test
    public void shouldReturnTheDifferenceOfTwoIntegers(){
        assertEquals(-29,cal.subtract(23,52));
        assertEquals(-2,cal.subtract(3,5));
        assertEquals(0,cal.subtract(0,0));
        assertEquals(24,cal.subtract(50,26));
        assertEquals(8,cal.subtract(5,-3));
    }
    @Test
    public void shouldReturnTheDifferenceOfTwoDoubles(){
        assertEquals(5d,cal.subtract(5.5d,0.5d),0.01d);
        assertEquals(-2d,cal.subtract(3.0d,5.0d),0.01d);
        assertEquals(0d,cal.subtract(0.0d,0.0d),0.01d);
        assertEquals(24d,cal.subtract(50.0d,26.0d),0.01d);
        assertEquals(8d,cal.subtract(5.0d,-3.0d),0.01d);
    }
    @Test
    public void shouldReturnTheDivisionOfTwoIntegers(){
        assertEquals(2,cal.divide(2,1));
        assertEquals(2,cal.divide(10,5));
        assertEquals(2,cal.divide(5,2));
        assertEquals(2,cal.divide(6,3));
        assertEquals(0,cal.divide(2,0));
        assertEquals(1,cal.divide(8,7));
    }
    @Test
    public void shouldReturnTheDivisionOfTwoDoubles(){
        assertEquals(2.00d,cal.divide(5d,2.5d),0.01d);
        assertEquals(3.86d,cal.divide(8.9d,2.3d),0.01d);
        assertEquals(3.00d,cal.divide(9.3d,3.1d),0.01d);
        assertEquals(4.9,cal.divide(10.8d,2.2d),0.01d);
    }
    @Test
    public void shouldReturnTheMultiplicationOfTwoIntegers(){
        assertEquals(68,cal.multiply(34,2));
        assertEquals(30,cal.multiply(6,5));
        assertEquals(99,cal.multiply(9,11));
        assertEquals(-2,cal.multiply(1,-2));
        assertEquals(0,cal.multiply(0,5));
    }
    @Test
    public void shouldReturnTheMultiplicationOfTwoDoubles(){
        assertEquals(29.48d,cal.multiply(6.7d,4.4d),0.01d);
        assertEquals(55d,cal.multiply(5.5d,10d),0.01d);
        assertEquals(4.84d,cal.multiply(2.2d,2.2d),0.01d);
        assertEquals(48.23d,cal.multiply(9.1d,5.3d),0.01d);
        assertEquals(0.02d,cal.multiply(0.01d,2.0d),0.01d);
    }
}