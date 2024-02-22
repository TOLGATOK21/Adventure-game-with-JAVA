package org.example;

public abstract class desolate extends Square{
    public desolate(Player player, String name) {
        super(player);
        this.name=name;
    }
    public  boolean getSquare(){
        return true;
    }
}
