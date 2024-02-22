package org.example;

import java.util.Random;

public class Guard {
    private String name;
    private int damage,loot,health,maxNumber;

    public Guard(String name, int damage, int loot, int health, int maxNumber) {
        this.name = name;
        this.damage = damage;
        this.loot = loot;
        this.health = health;
        this.maxNumber = maxNumber;
    }
    public int GuardNumber(){
        Random r=new Random();
        return r.nextInt(this.maxNumber)+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}