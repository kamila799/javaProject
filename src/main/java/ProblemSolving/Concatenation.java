package ProblemSolving;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));



    }
}
