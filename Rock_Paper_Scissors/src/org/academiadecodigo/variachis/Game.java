package org.academiadecodigo.variachis;

public class Game {

    private Player[] players;
    private boolean gameOver = false;

    public Game(Player[] players) {
        this.players = players;

    }

    public void init() {
        for (int i = 0; i < players.length; i++) {
            players[i].setHand(chooseHand());
            System.out.println(players[i].getName() + " chose " + players[i].getHand());
        }
    }

    public void start() {

        while (!gameOver) {
            init();
            checkResult();

        }
    }

    public Hand chooseHand() {

        int handChoice = (int) Math.floor(Math.random()*3);

        Hand hand = Hand.PAPER;

        switch (handChoice) {
            case 0:
                hand = Hand.PAPER;
                break;
            case 1:
                hand = Hand.ROCK;
                break;
            case 2:
                hand = Hand.SCISSORS;
                break;
        }
        return hand;
    }

    public void checkResult() {

        switch(players[0].getHand()) {
            case ROCK:
                if(players[1].getHand().equals(Hand.PAPER)) {
                    System.out.println(players[1].getName() + " wins");
                    gameOver = true;
                    break;
                }

                if(players[1].getHand().equals(Hand.SCISSORS)) {
                    System.out.println(players[0].getName() + " wins");
                    gameOver = true;
                    break;
                }

                System.out.println("It's a tie!");
                break;

            case PAPER:
                if(players[1].getHand().equals(Hand.ROCK)) {
                    System.out.println(players[0].getName() + " wins");
                    gameOver = true;
                    break;
                }

                if (players[1].getHand().equals(Hand.SCISSORS)) {
                    System.out.println(players[1].getName() + " wins");
                    gameOver = true;
                    break;
                }

                System.out.println("It's a tie!");
                break;

            case SCISSORS:
                if(players[1].getHand().equals(Hand.ROCK)) {
                    System.out.println(players[1].getName() + " wins");
                    gameOver = true;
                    break;
                }

                if(players[1].getHand().equals(Hand.PAPER)) {
                    System.out.println(players[0].getName() + " wins");
                    gameOver = true;
                    break;
                }

                System.out.println("It's a tie!");
                break;
        }
    }
}
