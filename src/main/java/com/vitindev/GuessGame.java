package com.vitindev;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private final int GUESS_NUMBER, ATTEMPTS, MAX_NUMBERS;

    public GuessGame() {
        ATTEMPTS = 5;
        MAX_NUMBERS = 50;
        GUESS_NUMBER = new Random().nextInt(MAX_NUMBERS);
    }

    public void init() {

        System.out.println("SELECTED NUMBER " + GUESS_NUMBER);
        System.out.println("Encontre um número sorteado entre 0-" + (MAX_NUMBERS - 1) + ".");

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 1; i <= ATTEMPTS; i++) {

                System.out.println("Tentativa (" + (i) + "/" + ATTEMPTS + "): ");

                int number = scanner.nextInt();

                if (number > GUESS_NUMBER) {
                    System.out.println("O número é menor que o inserido.");
                } else if (number < GUESS_NUMBER) {
                    System.out.println("O número é maior que o inserido.");
                } else {
                    System.out.println("Você acertou o número!");

                    int remaining_attempts = (ATTEMPTS - i);

                    if (remaining_attempts > 0) {
                        System.out.println("Ainda restavam " + remaining_attempts + " tentativas.");
                    } else {
                        System.out.println("Essa era sua última tentativa, que sorte!");
                    }

                    return;
                }

            }

        }

        System.out.println("Suas tentativas acabaram!");
    }

}
