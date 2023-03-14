package loops;

import java.util.Scanner;

public class BrakePractice {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int number = user.nextInt();
        System.out.println("Enter any number second time:");
        int num2 = user.nextInt();
        int sum = number + num2;

        for (int a = 0; a <= sum; a++){
            System.out.println(a);
            if (a == 45){
                break;
            }
        }



    }
}
