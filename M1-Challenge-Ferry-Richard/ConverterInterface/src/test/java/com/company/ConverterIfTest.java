package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    private ConverterIf conIf;
    @Before
    public void setUp(){
        conIf = new ConverterIf();
    }

    @Test
    public void shouldReturnAMonthWhenGivenACorrespondingNumber(){
        String expected = "January";
        String actual=conIf.convertMonth(1);
        assertEquals(expected,actual);
        assertEquals("February",conIf.convertMonth(2));
        assertEquals("March",conIf.convertMonth(3));
        assertEquals("April",conIf.convertMonth(4));
        assertEquals("May",conIf.convertMonth(5));
        assertEquals("June",conIf.convertMonth(6));
        assertEquals("July",conIf.convertMonth(7));
        assertEquals("August",conIf.convertMonth(8));
        assertEquals("September",conIf.convertMonth(9));
        assertEquals("October",conIf.convertMonth(10));
        assertEquals("November",conIf.convertMonth(11));
        assertEquals("December",conIf.convertMonth(12));
    }
    @Test
    public void shouldReturnADayWhenGivenACorrespondingNumber(){
        //arrange
        String expected = "Monday";
        //act
        String actual=conIf.convertDay(1);
        //assert
        assertEquals(expected,actual);
        assertEquals("Tuesday",conIf.convertDay(2));
        assertEquals("Wednesday",conIf.convertDay(3));
        assertEquals("Thursday",conIf.convertDay(4));
        assertEquals("Friday",conIf.convertDay(5));
        assertEquals("Saturday",conIf.convertDay(6));
        assertEquals("Sunday",conIf.convertDay(7));
    }
    @Test
    public void shouldReturnErrorMessageWhenGivenANumberOutOfBoundsForADay(){
        //arrange
        String expected = "Error: no corresponding day for this number";
        //act
        String actual = conIf.convertDay(0);
        //assert
        assertEquals(expected,actual);
        assertEquals(expected,conIf.convertDay(-1));
        assertEquals(expected,conIf.convertDay(12));
    }
    @Test
    public void shouldReturnErrorMessageWhenGivenANumberOutOfBoundsForMonth(){
        //arrange
        String expected = "Error: no corresponding month for this number";
        //act
        String actual = conIf.convertMonth(0);
        //assert
        assertEquals(expected,actual);
        assertEquals(expected,conIf.convertMonth(13));
        assertEquals(expected,conIf.convertMonth(-1));
    }
}