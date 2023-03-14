package loopsPractice;

import methods.SayHi;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        System.out.println( );
//        while: check condition then execute

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        while(number < 1 || number >10) {
            System.out.println(number + " is not between 1 and 10. Try again: ");
            number = scanner.nextInt();
        }
                System.out.println(number + " Thanks");







    }
}
