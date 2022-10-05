package com.company;

import java.util.Objects;

public class Constable extends BaseClass{
    private String jurisdiction;
    public void arrestAnotherCharacter(BaseClass character){
        System.out.println(this.getName()+": performing an arrest");
        character.setArrested(true);
        System.out.println("your arrested");
    }

    public Constable(String name,String jurisdiction) {
        this.setName(name);
        this.jurisdiction = jurisdiction;
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }
}
