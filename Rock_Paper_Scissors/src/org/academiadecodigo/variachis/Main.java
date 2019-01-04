package org.academiadecodigo.variachis;

public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[] {
                new Player("Rodrigo"),
                new Player("David")
        };

        Game game = new Game(players);

        game.start();

    }
}
