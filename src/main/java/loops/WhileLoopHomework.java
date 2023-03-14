package loops;

import java.util.Scanner;

public class WhileLoopHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with three digits");
        int i = scanner.nextInt();
        String string = scanner.nextLine();
        int length;

        do {
            length = string.length()-1;
            if (i == 3 && length >=0) {
                System.out.println(string + i);
                continue;
            }else if (i != 3 && length >= 0){
                System.out.println();
            }
            else if (i <= 0 && length >= 0){
                System.out.println(i + string);
            }
        }while (i <= 0 && length <= 0);
        System.out.println(" 0 digits ");








    }
}
