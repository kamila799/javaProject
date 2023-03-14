package practice;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String str = scanner.nextLine();
        System.out.println(str.toUpperCase());



    }
}
