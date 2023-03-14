package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 1;

        while (j <= 100) {

            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }

        int k = 1;
        while (k <= 10) {
            System.out.println("Good morning everyone!");
            k++;
        }

        for (int a = 1; a <= 10; a++) {
            System.out.println("Good afternoon!");
        }

        //
        int z = 100;
        while (z >= 1) {
            if (z % 2 != 0) {
            }
            z--;
        }
        //

        int x = 1;
        while (x <= 31) {
            System.out.println(x + " January 2023");
            x++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean isPrime = true;
        int d = 2;

        while (d < number) {
            if (number % d == 0) {
                isPrime = false;
                break;
            }
            d++;
        }
        if (isPrime){
            System.out.println("Number is prime");
        } else{
            System.out.println("number is not prime");
        }









    }
}
