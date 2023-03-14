package loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = user.nextInt();
        int limit = 40;
        for (int i = 0; i <= number; i++){
            System.out.println(i);
            if (i > 40){
                break; // break means stop and jump out of loop
            }
            System.out.println();
        }
        System.out.println("After loop");






    }
}
