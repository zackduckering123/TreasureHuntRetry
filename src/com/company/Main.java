package com.company;

import com.company.repository;

public class Main {
    public static char[][] board = new char[10][10];

    public static void main(String[] args) {
        int I = repository.randomNumber(50) + 20;
        for (int i = 0; i < I; i++) {
            setT();
        }
        int p = userInput();
        System.out.println("You landed on the treasure " + p + " times!");

    }

    public static void setT() {
        int x = repository.randomNumber(10);
        int y = repository.randomNumber(10);
        board[x][y] = 'T';
    }

    public static int userInput() {
        int p = 0;
        int f = 0;
        for (int i = 0; i < 10; i++) {
            int x = repository.getInput("Enter your X coordinate between 1 and 10");
            x = x - 1;
            int y = repository.getInput("Enter your Y coordinate between 1 and 10");
            y = y - 1;

            if (board[x][y] == 'T') {
                System.out.println("Congratulations you landed on the treasure");
                p = p + 1;
                board[x][y] = ' ';
                f = 9 - i;
                System.out.println("You have " + f + " turns left");
            } else {
                System.out.println("incorrect");
                f = 9 - i;
                System.out.println("You have " + f + " turns left");
            }
        }
        return p;
    }
}
