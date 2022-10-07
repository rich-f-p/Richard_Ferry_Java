package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable constable1;
    private Constable constable2;

    @Before
    public void setUp(){
        constable1 = new Constable("max","gate");
        constable2 = new Constable("arlene","tower");
    }

    @Test
    public void shouldReturnTheValueInitialValueForEachConstableProperty() {
        assertEquals("max", constable1.getName());
        assertEquals("gate",constable1.getJurisdiction());
        assertEquals(60, constable1.getStrength());
        assertEquals(100, constable1.getHealth());
        assertEquals(60, constable1.getStamina());
        assertEquals(20, constable1.getSpeed());
        assertEquals(5, constable1.getAttackPower());
        assertEquals(false, constable1.isRunning());
        assertEquals(false, constable1.isArrested());
    }

    @Test
    public void shouldReturnABooleanIndicatingIfArrestAnotherCharacterSetsArrestedToTrue(){
        assertEquals(false,constable2.isArrested());
        constable1.arrestAnotherCharacter(constable2);
        assertEquals(true,constable2.isArrested());
    }

    @Test
    public void shouldReturnTheHealthOfTheCharacterAttackedAfterTheMethodIsCalled() {
        constable1.attackAnotherCharacter(constable2);
        assertEquals(95, constable2.getHealth());
        constable1.attackAnotherCharacter(constable2);
        assertEquals(90, constable2.getHealth());
    }

    @Test
    public void shouldReturnTheStaminaOfTheCharacterAfterCallingAttackAnotherCharacter() {
        constable1.attackAnotherCharacter(constable2);
        assertEquals(57, constable1.getStamina());
        constable1.attackAnotherCharacter(constable2);
        assertEquals(54, constable1.getStamina());
    }

    @Test
    public void shouldReturnIfTheAttackedCharacterIsDefeatedOrNot(){
    String actual = constable1.attackAnotherCharacter(constable2);
    String expected = constable2.getName()+" health remaining: "+constable2.getHealth();
    assertEquals(expected,actual);
    constable2.setHealth(5);
    actual = constable1.attackAnotherCharacter(constable2);
    expected = "defeated "+constable2.getName();
    assertEquals(expected,actual);
    }
}