package org.academiadecodigo.variachis;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setHand(Hand hand) {
        this.hand = hand;

    }

    public Hand getHand() {
        return hand;

    }

}
