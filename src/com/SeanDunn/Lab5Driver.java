package com.SeanDunn;
import java.util.Scanner;

//Created by Sean Dunn,  April 14, 2017

public class Lab5Driver {

    public static int rollCount =0;

    public static void main(String[] args){
        int diceSides = -1;
        char userChar = 'G';
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Dice rolling game");
        do {
            System.out.println("Enter in how many sides your dies have");
            diceSides = scan.nextInt();
            scan.nextLine();
            rollCount++;
            rollDice(diceSides);

            System.out.println("Roll Again? (Y/N)");
            userChar = scan.nextLine().charAt(0);



        }
        while (userChar == 'Y' || userChar == 'y');

    }

    private static void rollDice(int diceSides) {

        System.out.println("Roll " + rollCount);
       System.out.println(getRandomDiceRoll(diceSides));
        System.out.println(getRandomDiceRoll(diceSides));

    }
    private static int getRandomDiceRoll(int diceSides){
        return (int)(Math.random()*diceSides +1);
    }

}
