package practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = user.nextInt();
        System.out.println("Enter second number: ");
        int num2 = user.nextInt();
        System.out.println("Enter third number: ");
        int num3 = user.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }
        else {
            System.out.println("Wrong number");
        }

    }
}
