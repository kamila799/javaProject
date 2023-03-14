package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        String operator;
        int num2;
        String question;

        do {
            System.out.println("Enter any number");
            num1 = scanner.nextInt();
            System.out.println("Enter arithmetic operator +, -, *, /, %");
            operator = scanner.next();
            System.out.println("Enter any number");
            num2 = scanner.nextInt();
            if (operator.equals("+")){
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }else if (operator.equals("-")){
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                }
            else if (operator.equals("*")){
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (operator.equals("/")){
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else if (operator.equals("%")) {
                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue?");
            question = scanner.nextLine();
            question.toLowerCase();

        }while(question.equals("yes"));
            System.out.println();




    }
}
