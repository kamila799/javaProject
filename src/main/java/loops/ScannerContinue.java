package loops;

import java.util.Scanner;

public class ScannerContinue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one positive and one negative number");
        int negative = sc.nextInt();
        int positive = sc.nextInt();
        for (int i = negative; i <= positive; i++ ){
            if (i < 0 && i % 2 == 0){
                continue;
            } else if (i > 0 && i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }

    }
}
