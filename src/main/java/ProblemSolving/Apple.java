package ProblemSolving;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = scanner.nextLine();
        System.out.println("Enter the second word");
        String word2 = scanner.nextLine();
//        word1 = word1.toLowerCase();
//        word2 = word2.toLowerCase();
//        System.out.println(word1.toUpperCase().charAt(0) + word1.substring(1) + word2.toUpperCase().charAt(0)
//        + word2.substring(1));

        //Task 2 BANANA apple apple BANANA
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first word");
//        String word1 = scanner.nextLine();
//        System.out.println("Enter the second word");
//        String word2 = scanner.nextLine();
//        System.out.println("Enter the third word");
//        String word3 = scanner.nextLine();
//        System.out.println("Enter the 4th word");
//        String word4 = scanner.nextLine();
//        System.out.println(word1.toUpperCase() + " " + word2.toLowerCase() + " "+ word3.toLowerCase() + " "+
//                word4.toUpperCase() + " " );


//        //Task 3
//        word1 = word1.toUpperCase();
//        word2 = word2.toUpperCase();
//        System.out.println(word1.replace("a", "") + " " + word2.replace("a", "") );


        word1 = word1.toUpperCase();
        word2 =word2.toUpperCase();
        System.out.println(word1.substring(word1.length()-2) + word2.substring(word2.length()-2));
        System.out.println(word1.toUpperCase().charAt(word1.length()-2) + "" + word1.toLowerCase().charAt(word1.length()-1)+
        (word2.toUpperCase().charAt(word2.length()-2) + "" + word2.toLowerCase().charAt(word2.length()-1)));










    }
}
