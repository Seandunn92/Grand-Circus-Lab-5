package com.SeanDunn;

//Created by Sean Dunn,  April 14, 2017

public class Main {
    public static final int ourDiamond = 10;
    public static boolean switchTime = false;


    public static void main(String[] args) {
        // write your code here
        DiamondPrint2(10);
        DiamondPrint1(9);

    }

    //bottom half of diamond
    public static void DiamondPrint1(int count){
        if(count<=0)
            return;
        for (int i=0; i<ourDiamond-count; i++ ){
            System.out.print(' ');
        }

        for (int i=0; i< count; i++){
            System.out.print("* ");
        }
        System.out.println();
        DiamondPrint1(count-1);
    }

    //front half of diamond
    public static void DiamondPrint2(int count){
        if(count<=0)
            return;



        DiamondPrint2(count-1);

        for (int i=0; i<ourDiamond-count; i++ ){
            System.out.print(' ');
        }

        for (int i=0; i< count; i++){
            System.out.print("* ");
        }
        System.out.println();

    }

    public static void printLargerNumFirst(int input){
        if (input <= 0) {
            System.out.println();
            return;

        }


        System.out.print(input + ", ");
        printLargerNumFirst(input -1);
    }

    public static void printSmallerNumFirst(int input){
        if (input <= 0) {
            System.out.println();
            return;
        }
        printSmallerNumFirst(input-1);

        System.out.print(input + ", ");
    }


}
