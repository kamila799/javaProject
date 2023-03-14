package loops;

import java.util.Scanner;

public class ForLoopHomeworkReverse {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        for (int i = word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }


    }
}


