package practice;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = user.nextInt();
        System.out.println("Enter the second number");
        int b = user.nextInt();
        System.out.println("Enter the third number");
        int c = user.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Descending order" + a + "," + b + "," + c); // Descending order
                System.out.println("Ascending order: " + c + "," + b + "," + a);
            }else{
                System.out.println(a + "+" + c + "+" + b);
                System.out.println(c + "," + a + "," + b);

            }
        }




    }
}
