package ifElsePractice;

import java.util.Scanner;

public class IfElseCalculator4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number1 operator number2 (5 * 7): ");
        double num1 = s.nextDouble();
        char operator = s.next().charAt(0);
        double num2 = s.nextDouble();

        if (operator == '+'){
            System.out.println(num1 + num2);
        }
        else if (operator == '-'){
            System.out.println(num1 - num2);
        }
        else if (operator == '*'){
            System.out.println(num1 * num2);
        }
        else if (operator == '/'){
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Invalid operator");
        }



    }
}
