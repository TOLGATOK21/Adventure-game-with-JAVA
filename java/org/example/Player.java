package org.example;

import java.util.Scanner;

public class Player {
    private int damage,healthy,coin,exactHealthy;
    private String playerName, fighterName;
    private Handbag bag;
    Scanner scan= new Scanner(System.in);

    public Player(String playerName) {
        this.playerName = playerName;
        this.bag= new Handbag();
    }
    public void chooseHero(){
        switch (heroMenu()){

            case 1:
                initialPlayer("Fighter 1 ", 4,20,13);
                break;
            case 2:
                initialPlayer("Fighter 2", 7,18,22);
                break;
            case 3:
                initialPlayer("Fighter 3", 9,20,10);
                break;

            }
        System.out.println("Your character: " + getFighterName() + ",Damage:" + getDamage() + ",Health :" + getHealthy() + ",Coin" + getCoin());

    }
    public int heroMenu(){
        System.out.println("Choose a character to fight\n : ");
        System.out.println("Fighter 1 : \tDAMAGE :4 , \tHEALTH : 20 , \tCOİN : 13");
        System.out.println("Fighter 2 : \tDAMAGE :7, \tHEALTH : 18 , \tCOİN : 22");
        System.out.println("Fighter 3 : \tDAMAGE :9, \tHEALTH : 20 , \tCOİN : 10");
        System.out.println("YOUR CHOİCE...");
        int charID= scan.nextInt();
        while (charID<1 || charID>3 ){
            System.out.println("SELECT A VALID CHARACTER");
            charID = scan.nextInt();
        }

        return charID;

    }
    public int getTotalDamage(){
        return this.getDamage()+this.getBag().getDamage();
    }
public void initialPlayer(String fName, int dmg , int healt , int cn){
    setFighterName(fName);
    setDamage(dmg);
    setHealthy(healt);
    setCoin(cn);
    setExactHealthy(healt);


}
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public int getExactHealthy() {
        return exactHealthy;
    }

    public void setExactHealthy(int exactHealthy) {
        this.exactHealthy = exactHealthy;
    }

    public Handbag getBag() {
        return bag;
    }

    public void setBag(Handbag bag) {
        this.bag = bag;
    }
}
