package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(1, 100);
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Guess a number");
            number = scanner.nextInt();
            if (number < randomNumber) {
                System.out.println("Too low");
            } else if (number > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Great Job");
                break;
            }
        }while (number <= 100);













    }
}
