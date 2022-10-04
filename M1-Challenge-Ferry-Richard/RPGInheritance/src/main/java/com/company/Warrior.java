package com.company;

public class Warrior extends BaseClass{
    private int shieldStrength;

    public Warrior(String name) {
        this.setName(name);
        this.shieldStrength = 100;
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setRunning(false);
        this.setArrested(false);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + this.getName() + '\'' +
                ", strength=" + this.getStrength() +
                ", health=" + this.getHealth() +
                ", stamina=" + this.getStamina() +
                ", speed=" + this.getSpeed() +
                ", attackPower=" + this.getAttackPower() +
                ", running=" + this.isRunning() +
                ", arrested=" + this.isArrested() +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
