package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    private ConverterSwitch conSwitch;

    @Before
    public void setUp(){
        conSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnAMonthWhenGivenACorrespondingNumber(){
        String expected = "January";
        String actual=conSwitch.convertMonth(1);
        assertEquals(expected,actual);
        assertEquals("February",conSwitch.convertMonth(2));
        assertEquals("March",conSwitch.convertMonth(3));
        assertEquals("April",conSwitch.convertMonth(4));
        assertEquals("May",conSwitch.convertMonth(5));
        assertEquals("June",conSwitch.convertMonth(6));
        assertEquals("July",conSwitch.convertMonth(7));
        assertEquals("August",conSwitch.convertMonth(8));
        assertEquals("September",conSwitch.convertMonth(9));
        assertEquals("October",conSwitch.convertMonth(10));
        assertEquals("November",conSwitch.convertMonth(11));
        assertEquals("December",conSwitch.convertMonth(12));
    }

    @Test
    public void shouldReturnADayWhenGivenACorrespondingNumber(){
        //arrange
        String expected = "Monday";
        //act
        String actual=conSwitch.convertDay(1);
        //assert
        assertEquals(expected,actual);
        assertEquals("Tuesday",conSwitch.convertDay(2));
        assertEquals("Wednesday",conSwitch.convertDay(3));
        assertEquals("Thursday",conSwitch.convertDay(4));
        assertEquals("Friday",conSwitch.convertDay(5));
        assertEquals("Saturday",conSwitch.convertDay(6));
        assertEquals("Sunday",conSwitch.convertDay(7));
    }

    @Test
    public void shouldReturnErrorMessageWhenGivenANumberOutOfBoundsForADay(){
        //arrange
        String expected = "Error: Not a valid day";
        //act
        String actual = conSwitch.convertDay(0);
        //assert
        assertEquals(expected,actual);
        assertEquals(expected,conSwitch.convertDay(-1));
        assertEquals(expected,conSwitch.convertDay(12));
    }

    @Test
    public void shouldReturnErrorMessageWhenGivenANumberOutOfBoundsForMonth(){
        //arrange
        String expected = "The numerical value given doesn't match a month";
        //act
        String actual = conSwitch.convertMonth(0);
        //assert
        assertEquals(expected,actual);
        assertEquals(expected,conSwitch.convertMonth(13));
        assertEquals(expected,conSwitch.convertMonth(-1));
    }
}