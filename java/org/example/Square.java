package org.example;

import java.util.Scanner;

public abstract class Square {
    public Player player;
    public String name;
    Scanner scan = new Scanner(System.in);

    public Square(Player player) {
        this.player = player;
    }
    public abstract boolean getSquare();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
