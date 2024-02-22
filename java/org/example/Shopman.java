package org.example;

public class Shopman extends desolate {
    public Shopman(Player player) {
        super(player, "Store");
    }
    public boolean getSquare(){
        System.out.println("Your Current Coin:" + player.getCoin());
        System.out.println("1--->Animals: fight with you and increase the damage you deal to the enemy.");
        System.out.println("2--->Armor: Increases health.");
        System.out.println("3. --Exit--");
        System.out.println("Your choice:");
        int selShop= scan.nextInt();
        int selItemID;
        switch (selShop){
            case 1:
                selItemID= wildMenu();
                buywild(selItemID);
                break;
            case 2:
                selItemID= armorMenu();
                buyArmor(selItemID);

                break;
        }
        return true;
    }
    public int armorMenu(){
        System.out.println("1. Small\t <Price: 9 -  Damage protection: +2");
        System.out.println("2. Middle\t <Price : 15 -  Damage protection: +4");
        System.out.println("3. Bigger\t <Price : 25 -  Damage protection: +8");
        System.out.println("Choose an armor: ");
        int selArmorID = scan.nextInt();
        return selArmorID;

    }
    public void buyArmor(int itemID){
        int avoid = 0, price=0;
        String armorName=null;
        switch (itemID){
            case 1:
                avoid=2;
                armorName="Small armor ";
                price = 9;
                break;
            case 2:
                avoid=4;
                armorName="Middle armor ";
                price = 15;
                break;
            case 3:
                avoid=8;
                armorName="Bigger armor ";
                price = 25;
                break;
            case 4:
                System.out.println("Leaving...");
                break;
            default:
                System.out.println("Invalid transaction!!!");
                break;
        }
        if (price>=0)
            if (player.getCoin()> price) {
               player.getBag().setArmor(avoid);
               player.getBag().setaName(armorName);
               player.setCoin(player.getCoin()-price);
                System.out.println("You bought a " + armorName + "Damage protection: " + player.getBag().getArmor());
            }
            else {
                System.out.println("Insufficient balance");
            }

    }
    public int wildMenu() {
        System.out.println("1---> Angry Dog\t <Price : 10 - Damage : 3");
        System.out.println("2--->Trained Wolf\t <Price : 15 - Damage : 4");
        System.out.println("3--->Pet Dragon\t <Price : 20 - Damage : 6");
        System.out.println("Choose an animal: ");
        int selWildID = scan.nextInt();
        return selWildID;
    }
    public void buywild(int itemID){
      int damage = 0, price=0;
      String wildName=null;
      switch (itemID){
          case 1:
              damage=3;
              wildName="Angry Dog";
              price = 10;
              break;
          case 2:
              damage=4;
              wildName="Trained Wolf";
              price = 15;
              break;
          case 3:
              damage=6;
              wildName="Pet Dragon";
              price = 20;
              break;
          case 4:
              System.out.println("Leaving...");
              break;
          default:
              System.out.println("Invalid transaction!!!");
              break;
      }
     if (price>0)
         if (player.getCoin()> price) {
             player.getBag().setDamage(damage);
             player.getBag().setWildAnimal(wildName);
             player.setCoin(player.getCoin()-price);
             System.out.println(" You bought a/an  " + wildName + " Your previous damage: " + player.getDamage() + " Current damage: " + player.getTotalDamage());
             System.out.println("Current Coin---> " + player.getCoin());
         }
         else {
         System.out.println("!!!Insufficient  Coin!!!");
     }

    }
    }

