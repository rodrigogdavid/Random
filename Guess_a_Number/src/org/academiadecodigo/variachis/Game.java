package org.academiadecodigo.variachis;

public class Game {

    private int computerNumber;
    private int myNumber;
    private boolean gameOver = false;

    public Game() {
        this.computerNumber = (int) Math.floor(Math.random()*10);

    }

    public boolean isGameOver() {
        return gameOver;

    }

    public void checkResult(int myNumber) {

        this.myNumber = myNumber;

        if (this.computerNumber == this.myNumber) {
            System.out.println("Great!");
            gameOver = true;

        } else {
            System.out.println("Looser!");

        }

    }

}
