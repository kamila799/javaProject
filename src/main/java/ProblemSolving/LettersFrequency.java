package ProblemSolving;

import java.util.Scanner;

public class LettersFrequency {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            int counter = 0;
            for (int k = 0; k < word.length(); k++){
                if (word.charAt(i) == word.charAt(k)){
                    counter++;
                }
            }
            System.out.println(word.charAt(i) + ": " + counter);
        }






        }
    }

