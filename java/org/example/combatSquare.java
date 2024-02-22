package org.example;
import org.example.Guard;
import org.example.Player;
import org.example.Square;

import java.sql.SQLOutput;

public abstract class combatSquare extends Square {
    private Guard guard;
    private String pieceName;
    combatSquare(Player player, String name, Guard guard,String pieceName) {
        super(player);
        this.guard=guard;
        this.name=name;
        this.pieceName=pieceName;

    }

    @Override
    public boolean getSquare() {
        int guardNumb=guard.GuardNumber();
        System.out.println("You are in this area now--->" + this.getName()  );
        System.out.println("Be careful! The number of guardians in this area is--->  " + guardNumb + "  Name of the guard--->  " + guard.getName() );
        System.out.println("Press F to fight. Press E to escape for now.");
        String selCase = scan.nextLine();
        selCase=selCase.toUpperCase();
        if (selCase.equals("F")){
            if (combat(guardNumb)){
                System.out.println("You cleared all the enemies in the " + this.getName()  );
                if (this.pieceName.equals("Paper1") && player.getBag().isPaper1()==false ){
                    System.out.println( "!!!You take the " + this.pieceName );
                    player.getBag().setPaper1(true);
                } else if (this.pieceName.equals("Paper2") && player.getBag().isPaper2()==false) {
                    System.out.println( "!!!You take the " + this.pieceName );
                    player.getBag().setPaper2(true);
                } else if (this.pieceName.equals("Paper3") && player.getBag().isPaper3()==false) {
                    System.out.println( "!!!You take the " + this.pieceName );
                    player.getBag().setPaper3(true);
                }
                return true;
            }if (player.getHealthy() <= 0){
                System.out.println("You died!!");
                return false;
            }

        }


        return true;
    }

    public boolean combat(int guardNumb) {
         for (int i =0; i< guardNumb; i++){
             int defGuardHealth = guard.getHealth();
             playerStatistic();
             guardStatistics();
             while (player.getHealthy()>0 && guard.getHealth() > 0){
                 System.out.println("Attack (A) or Escape (E)");
                 String selCase = scan.nextLine();
                 selCase= selCase.toUpperCase();
                 if (selCase.equals("A")){
                     System.out.println("You attacked.");
                     guard.setHealth(guard.getHealth()-player.getTotalDamage());
                     afterFight();
                     System.out.println("Your Health---> " + player.getHealthy());
                     System.out.println(guard.getName()+"'s Health--->" + guard.getHealth());
                     if (guard.getHealth()>0){
                     System.out.println("-------------");
                     System.out.println("The guard attacked you!!!");
                     player.setHealthy(player.getHealthy()-(guard.getDamage()-player.getBag().getArmor()));
                     afterFight();}
                 }else {
                     return false;
                 }

             }
             if (guard.getHealth()<=0 && player.getHealthy()>0){
                 System.out.println("You killed the guard.");
                 player.setCoin(player.getCoin()+guard.getLoot());
                 System.out.println("Current Coin: " + player.getCoin());
                 guard.setHealth(defGuardHealth);

             }else {
                 return false;
             }
             System.out.println("--------------");
         }
        return true;
    }
    public void playerStatistic(){
        System.out.println("Player Statistics\n--------------------");
        System.out.println("Health--->" + player.getHealthy());
        System.out.println("Damage--->" + player.getTotalDamage());
        System.out.println("Coin--->" + player.getCoin());
        if (player.getBag().getDamage() > 0){
            System.out.println("Attack animal--->" + player.getBag().getWildAnimal());
        }
        if (player.getBag().getArmor() > 0){
            System.out.println("Armor--->" + player.getBag().getaName());
        }
    }
    public void guardStatistics(){
        System.out.println("--------------------\n" + guard.getName() + "'s values\n" + "--------------------");
        System.out.println("Health--->" + guard.getHealth());
        System.out.println("Damage--->" + guard.getDamage());
        System.out.println("Loot--->" + guard.getLoot());
    }
    public void afterFight(){
        System.out.println("Your health:" + player.getHealthy());
        System.out.println(guard.getName() + "'s Health:" + guard.getHealth());
        System.out.println();
    }
}
