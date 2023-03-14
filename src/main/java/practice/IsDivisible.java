package practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter any number");
        int num1 = user.nextInt();
        String word = user.nextLine();
        System.out.println("Enter second number:");
        int num2 = user.nextInt();


        if(num1%num2 == 0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not Divisible");
        }

        int num = 10;
        String str = "Hello";





    }
}
