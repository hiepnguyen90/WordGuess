package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//hiep nguyen

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    //    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random rand = new Random();
//
//        char game[];
//        String[] arr = {"noob", "hacker", "lmfao"};
//        String word = arr[rand.nextInt(arr.length)];
//        int count = word.length();
//        char[] charArr = word.toCharArray();
//        char[] star = word.toCharArray();
//
//        for (int i = 0; i < star.length; i++) {
//            star[i] = '*';
//            System.out.print(star[i]);
//
//        }
//
//        System.out.println("");
//        System.out.println(charArr);
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.printf("\nGuess a letter:");
//            char letter = input.next().charAt(0);
//
//            for (int j = 0; j < charArr.length; j++) {
//                if (letter == star[j]) {
//                    System.out.println("this word already exist");
//                } else {
//                    if (letter == charArr[j]) {
//                        star[j] = letter;
//                        i--;
//                        System.out.printf("Correct Guess!\n");
//                        System.out.print(star);
//                    }
//                }
//            }
//            //} // delete after
////} // delete after
//
//
//            switch (i + 0) {
//                case 1:
//                    System.err.printf("Strike 1\n");
//                    break;
//                case 2:
//                    System.err.printf("Strike 2\n");
//                    break;
//                case 3:
//                    System.err.printf("Strike 3\n");
//                    System.err.printf("You're out!!! The word is Not_Matched\n");
//                    break;
//            }
//
//            System.out.printf("\n");
//            if ((new String(word)).equals(new String(star))) {
//                System.err.printf("Winner Winner, Chicken Dinner!\n");
//                break;
//            }
//
//        }
//    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String[] arr = {"noob", "hacker", "lol"};
        String word = arr[rand.nextInt(3)];
        char[] singleWord = word.toCharArray();
        char[] stars = word.toCharArray();


        for (int i = 0; i < stars.length; i++) {
            stars[i] = '*';
        }
        System.out.print(singleWord);
        System.out.print(stars);


        for (int i = 1; i <= singleWord.length; i++) {
            System.err.printf("\nGuess a letter: ");
            char letter = scan.next().charAt(0);

            for (int j = 0; j < singleWord.length; j++) {
                if (letter == stars[j]) {
                    System.out.println("you did this already");

                } else {
                    if (letter == singleWord[j]) {
                        stars[j] = letter;
                        i--;
                        System.out.println(stars);
                    }
                }
            }
            switch (i + 0) {
                case 1:
                    System.err.println("Strike 1!!");
                    break;
                case 2:
                    System.err.println("Strike 2!!");
                    break;
                case 3:
                    System.err.println("Strike 3!!");
                    break;
                case 4:
                    System.err.println("Strike 4!!");
                case 5:
                    System.err.println("Strike 5!!");
                    break;
            }

            System.out.printf("\n");
                if ((new String(word)).equals(new String(stars))) {
                    System.err.printf("Winner Winner, Chicken Dinner!\n");
                    break;
            }
        }
    }
}







