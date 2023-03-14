package loopsPractice;

import java.util.Scanner;

public class WhileLoopSumOfOddIntegersHW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbers: ");
        int number = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int num3 = scanner.nextInt();
        int sum = 0;

        if (number > 0){
            int i = 1;
            while (i <= number && i <= num2 && i <= num3){
                if ( i % 2 == 0) {
                    sum = i;
                }
                i++;
            }
            System.out.println( "Sum of odd integers to " + number + " is " +sum);
        } else {
            System.out.println("number must be positive");
        }





    }
}
