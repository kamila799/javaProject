package practice;

import java.util.Scanner;

public class EnterToStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string");
        String sentence = scanner.nextLine();
        System.out.println("Enter the second string");
        String str2 = scanner.next();
        if (sentence.equals(str2)){
            System.out.println("EQUAL");
        }
        else {
            System.out.println("Not equal");
        }






    }
}
