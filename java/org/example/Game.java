package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    Player player;
    Square square;
    Scanner scan = new Scanner(System.in);

    public void inception(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You're stuck in a world that's half real, half mythical.\n And there's a map to get you out of here.\n 3 parts of this map are guarded by various guards in separate places.\n Choose a warrior and try to collect 3 pieces of map without dying.");
        System.out.println("Player's name: ");
        String yourName = scan.nextLine();
        player = new Player(yourName);
        player.chooseHero();
        start();
    }
    public void start(){

        while (true) {
            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("Choose a location to go.");
            System.out.println("1--->Go to the hospital to replenish your health level.");
            System.out.println("2--->Junk yard");
            System.out.println("3--->Dark Street");
            System.out.println("4--->Deserted houses");
            System.out.println("5--->Go to the store to buy something.");
            System.out.println("");
            int chooseSquare = scan.nextInt();
            while (chooseSquare < 0 || chooseSquare > 5) {
                System.out.println("Please enter a valid number!!!");
                chooseSquare = scan.nextInt();

            }

            switch (chooseSquare) {
                case 1:
                    square = new MagicalHospital(player);
                    break;
                case 2 :
                    square = new Area1(player);
                    break;
                case 3:
                    square = new Area2(player);
                    break;
                case 4:
                    square = new Area3(player);
                    break;
                    case 5:
                    square= new Shopman(player);
                    break;

            }
            if (square.getClass().getName().equals("MagicalHospital")){
                if (player.getBag().isPaper1() && player.getBag().isPaper2() && player.getBag().isPaper3()){
                    System.out.println("!!!CONGRATULATIONS!!! \n" +
                            "YOU COLLECTED ALL 3 PIECES OF THE MAP.");
                    System.out.println(player.getPlayerName() + " YOU WIN THE GAME\n");

                    break;
                }
            }
            if(!square.getSquare()){
                System.out.println("GAME OVER");
                break;
            }
        }

    }

}
