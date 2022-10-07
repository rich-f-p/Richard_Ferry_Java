package com.company;

import java.util.Objects;

public class BaseClass {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;

    public String attackAnotherCharacter(BaseClass character) {
        System.out.println(name + ": is attacking " + character.getName());
        System.out.println(name + ": Attack: " + attackPower);
        stamina -= 3;
        character.setHealth(character.getHealth() - attackPower);
        System.out.println("Stamina remaining: " + stamina);
        if (character.getHealth() <= 0) {
            System.out.println(name + ": defeated " + character.getName());
            return "defeated "+character.getName();
        }
        return character.getName()+" health remaining: "+character.getHealth();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseClass baseClass = (BaseClass) o;
        return strength == baseClass.strength && health == baseClass.health && stamina == baseClass.stamina && speed == baseClass.speed && attackPower == baseClass.attackPower && running == baseClass.running && arrested == baseClass.arrested && Objects.equals(name, baseClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, running, arrested);
    }
}
