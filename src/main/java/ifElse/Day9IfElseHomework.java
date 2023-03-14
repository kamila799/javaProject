package ifElse;

public class Day9IfElseHomework {
    public static void main(String[] args) {

        //Task 1: Write a program that takes three integers as input and checks if any two of them are equal.
        // Print "Two of the numbers are equal" if any two of the numbers are equal, and
        // "None of the numbers are equal" if none of the numbers are equal.

        //Expected output: Two of the numbers are equal
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;
        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All three numbers are equal");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Two of the numbers are equal");
        } else {
            System.out.println("None of the numbers are equal");
        }


        //Task 2: Write a program that takes an integer as input and checks if it is a multiple of 3 or 5.
        // Print "Multiple of 3 or 5" if the number is a multiple of 3 or 5, and
        // "Not a multiple of 3 or 5" if the number is not a multiple of 3 or 5.
        //Expected output:Multiple of 3 or 5
        int num=9;
        if(num%3==0||num%5==0)

        {
        System.out.println("Multiple of 3 or 5");
        }else

        {
        System.out.println("Not a multiple of 3 or 5");
        }

        //Task 3: Write a program that takes two integers as input and checks if their
        // sum is even or odd. Print "Even" if the sum is even, and "Odd" if the sum is odd.
        //Expected output:Odd
        num1=4;
        num2=3;
        if((num1+num2)%2==0)

        {
        System.out.println("Even");
        }else

        {
        System.out.println("Odd");
        }

        //Task 4: Write a program that takes an integer as input and checks if it is a prime number or not.
        // A number is prime if it is only divisible by 1 and itself. Print "Prime" if the number is prime,
        // and "Not prime" if the number is not prime.
        //Example input:int num = 7;
        //Expected output:Prime
        num=7;
        if(num%1==0&&num%num==0)

        {
        System.out.println("Prime");
        }else

        {
        System.out.println("Not Prime");
        }


        }
        }
