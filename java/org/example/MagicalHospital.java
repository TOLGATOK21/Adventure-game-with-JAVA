package org.example;

public class MagicalHospital extends desolate{
    public MagicalHospital(Player player) {
        super(player, "Hospital");
    }


    public boolean getSquare(){
        player.setHealthy(player.getExactHealthy());
        System.out.println("your health is now full");
        System.out.println("You are in the Hospital now.");
        return true;
    }
}
