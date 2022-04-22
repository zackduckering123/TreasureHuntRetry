package com.company;
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
        int x = repository.getInput("enter your X coordinate between 1 and 10");
        int y = repository.getInput("enter your Y coordinate between 1 and 10");
        for (int i = 0; i < 10; i++) {
        if (board[x][y] == 'T') {
            System.out.println("Congratulations you landed on the treasure");
            p = p + 1;
        } else {
            System.out.println("incorrect");
        }
    }
    return p;
    }
}
