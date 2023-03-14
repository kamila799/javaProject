package ifElsePractice;

import java.util.Scanner;

public class IfStatement1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if(x > y){
            System.out.println("Max of two numbers: " + x);
        }
         if (y > x){
            System.out.println("Max of two numbers: " + y);
        }
         if (x == y){
             System.out.println("The numbers are equal: ");
         }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
         int number = scanner.nextInt();

         if (number % 2 == 0){
             System.out.println(number + " is even");
         }
         else{
             System.out.println(number + " is odd");
         }



    }
}
