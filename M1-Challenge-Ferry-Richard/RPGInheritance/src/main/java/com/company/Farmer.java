package com.company;

public class Farmer extends BaseClass{
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name) {
        this.setName(name);
        this.plowing = false;
        this.harvesting = false;
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setRunning(false);
        this.setArrested(false);
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + this.getName() + '\'' +
                ", strength=" + this.getStrength() +
                ", health=" + this.getHealth() +
                ", stamina=" + this.getStamina() +
                ", speed=" + this.getSpeed() +
                ", attackPower=" + this.getAttackPower() +
                ", running=" + this.isRunning() +
                ", arrested=" + this.isArrested() +
                ", plowing=" + plowing +
                ", harvesting=" + harvesting +

                '}';
    }
}
