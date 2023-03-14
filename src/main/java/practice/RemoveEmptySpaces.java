package practice;

import java.util.Scanner;

public class RemoveEmptySpaces {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        sentence = sentence.replace(" ","");
        System.out.println(sentence);


    }
}
