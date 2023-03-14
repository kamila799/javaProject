package loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int number;
//
//        do{
//            System.out.println("Enter negative number: ");
//            number =scanner.nextInt();
//        }while (number >= 0);
//

        Scanner user = new Scanner (System.in);
        int num;

        do{
            System.out.println("Enter even number: ");
            num = user.nextInt();
        }while(num % 2 != 0);



    }
}
