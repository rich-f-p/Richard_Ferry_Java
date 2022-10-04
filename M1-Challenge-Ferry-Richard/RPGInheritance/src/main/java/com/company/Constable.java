package com.company;

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
}
