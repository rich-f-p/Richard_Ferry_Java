package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    private Farmer farmer1;
    private Farmer farmer2;

    @Before
    public void setUp(){
        farmer1 =new Farmer("bob");
        farmer2 = new Farmer("jim");
    }

    @Test
    public void shouldReturnTheValueInitialValueForEachFarmerProperty(){
        assertEquals("bob", farmer1.getName());
        assertEquals(false, farmer1.isPlowing());
        assertEquals(false,farmer1.isHarvesting());
        assertEquals(75, farmer1.getStrength());
        assertEquals(100, farmer1.getHealth());
        assertEquals(75, farmer1.getStamina());
        assertEquals(10, farmer1.getSpeed());
        assertEquals(1, farmer1.getAttackPower());
        assertEquals(false, farmer1.isRunning());
        assertEquals(false, farmer1.isArrested());
    }


    @Test
    public void shouldReturnTheHealthOfTheCharacterAttackedAfterTheMethodIsCalled(){
        farmer1.attackAnotherCharacter(farmer2);
        assertEquals(99,farmer2.getHealth());
        farmer1.attackAnotherCharacter(farmer2);
        assertEquals(98,farmer2.getHealth());
    }

    @Test
    public void shouldReturnTheStaminaOfTheCharacterAfterCallingAttackAnotherCharacter(){
        farmer1.attackAnotherCharacter(farmer2);
        assertEquals(72,farmer1.getStamina());
        farmer1.attackAnotherCharacter(farmer2);
        assertEquals(69,farmer1.getStamina());
    }

    @Test
    public void shouldReturnIfTheAttackedCharacterIsDefeatedOrNot(){
        String actual = farmer1.attackAnotherCharacter(farmer2);
        String expected = farmer2.getName()+" health remaining: "+farmer2.getHealth();
        assertEquals(expected,actual);
        farmer2.setHealth(1);
        actual = farmer1.attackAnotherCharacter(farmer2);
        expected = "defeated "+farmer2.getName();
        assertEquals(expected,actual);
    }
}