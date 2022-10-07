package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior1;
    private Warrior warrior2;

    @Before
    public void setUp() {
        warrior1 = new Warrior("Gabriel");
        warrior2 = new Warrior("Tim");
    }

    @Test
    public void shouldReturnTheValueInitialValueForEachWarriorProperty() {
        assertEquals("Gabriel", warrior1.getName());
        assertEquals(100, warrior1.getShieldStrength());
        assertEquals(75, warrior1.getStrength());
        assertEquals(100, warrior1.getHealth());
        assertEquals(100, warrior1.getStamina());
        assertEquals(50, warrior1.getSpeed());
        assertEquals(10, warrior1.getAttackPower());
        assertEquals(false, warrior1.isRunning());
        assertEquals(false, warrior1.isArrested());
    }

    @Test
    public void shouldReturnTheHealthOfTheCharacterAttackedAfterTheMethodIsCalled() {
        warrior1.attackAnotherCharacter(warrior2);
        assertEquals(90, warrior2.getHealth());
        warrior1.attackAnotherCharacter(warrior2);
        assertEquals(80, warrior2.getHealth());
    }

    @Test
    public void shouldReturnTheStaminaOfTheCharacterAfterCallingAttackAnotherCharacter() {
        warrior1.attackAnotherCharacter(warrior2);
        assertEquals(97, warrior1.getStamina());
        warrior1.attackAnotherCharacter(warrior2);
        assertEquals(94, warrior1.getStamina());
    }

    @Test
    public void shouldReturnIfTheAttackedCharacterIsDefeatedOrNot(){
        String actual = warrior1.attackAnotherCharacter(warrior2);
        String expected = warrior2.getName()+" health remaining: "+warrior2.getHealth();
        assertEquals(expected,actual);
        warrior2.setHealth(10);
        actual = warrior1.attackAnotherCharacter(warrior2);
        expected = "defeated "+warrior2.getName();
        assertEquals(expected,actual);
    }

}