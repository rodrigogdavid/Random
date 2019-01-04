package org.academiadecodigo.variachis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        Player[] players = new Player[] {
                new Player("Rodrigo"),
                new Player("David")
        };

        String question = "choose a number between 0 and 9: ";

        Scanner scanner = new Scanner(System.in);
        int myNumber;

        while (!game.isGameOver()) {

            for (int i = 0; i < players.length; i++) {

                System.out.println(players[i].getName() + ", " + question);
                myNumber = scanner.nextInt();
                game.checkResult(myNumber);

                if (game.isGameOver()) {
                    System.out.println(players[i].getName() + ", you won!");
                    break;
                }
            }

        }


    }
}
