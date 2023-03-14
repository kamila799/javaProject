package practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = user.nextLine();

        if (word.toLowerCase().contains("Java ")){
            System.out.println("YES, contains Java");
        }
        else{
            System.out.println("NO, doesn't contain Java");
        }




    }
}
