package loops;

import java.util.Scanner;

public class PrimeNumberPractice {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =user.nextInt();

        boolean isPrime = true;

        for (int a = 2; a < number; a++){
            if (number % a == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number isn't Prime");

        }


    }
}
