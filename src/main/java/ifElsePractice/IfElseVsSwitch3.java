package ifElsePractice;

import java.util.Scanner;

public class IfElseVsSwitch3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("Even");
                break;
//                case 1:
//            System.out.println("Odd");
            default:
                System.out.println("Odd");
        }

    }
}