package com.company;
import java.util.Scanner;
import java.util.Random;

public class repository {
public static int randomNumber(int x){
    Random random = new Random();
    int T = random.nextInt(x);
    return T;
}public static int getInput(String prompt){
    Scanner input = new Scanner(System.in);
    int Y = input.nextInt();
    return Y;
    }

}

