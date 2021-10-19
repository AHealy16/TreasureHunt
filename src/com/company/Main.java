package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//        int[] x = new int[10];
//        int[] y = new int[10];
//        System.out.println("Try and guess the x axis of where the treasure is");
//        int guessX =

        String [] [] board = new String [10] [8];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board [i] [j] = "[ ]";
                System.out.print(board [i] [j]);
            }
            System.out.println("");
        }


	// write your code here
    }
}
