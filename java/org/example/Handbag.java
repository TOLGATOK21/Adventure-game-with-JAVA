package org.example;

public class Handbag {
    private boolean paper1,paper2,paper3;
    private String wildAnimal,aName;
    private int damage,armor;

    Handbag(){
        this.paper1=false;
        this.paper2=false;
        this.paper3=false;
        this.damage=0;
        this.armor=0;
        this.wildAnimal=null;
        this.aName=null;

    }

    public boolean isPaper1() {
        return paper1;
    }

    public void setPaper1(boolean paper1) {
        this.paper1 = paper1;
    }

    public boolean isPaper2() {
        return paper2;
    }

    public void setPaper2(boolean paper2) {
        this.paper2 = paper2;
    }

    public boolean isPaper3() {
        return paper3;
    }

    public void setPaper3(boolean paper3) {
        this.paper3 = paper3;
    }

    public String getWildAnimal() {
        return wildAnimal;
    }

    public void setWildAnimal(String wildAnimal) {
        this.wildAnimal = wildAnimal;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
