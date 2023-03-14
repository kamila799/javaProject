package loopsPractice;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
//* do while loop: execute then check condition

        int i =100;
        do{
            System.out.println("hello " + i); // at least one iteration
            i++;
        }while (i <= 3);

        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a number between 1 and 10: ");
            n = s.nextInt();

        }while(n<1 || n>10);
        System.out.println(n + " is between 1 and 10. ");



    }
}
