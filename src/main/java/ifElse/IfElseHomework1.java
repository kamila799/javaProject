package ifElse;

public class IfElseHomework1 {
    public static void main(String[] args) {

        // Task 1
        //Write a program that checks whether the number is positive,
        // negative, or zero. The program should print out a message indicating the result.

        int number = 40;
        if (number > 0){
            System.out.println("Number is positive");
        }
        if (number < 0){
            System.out.println("Number is negative");
        }
        if (number == 0){
            System.out.println("Number is zero");
        }

        // Task 2
        //Write a program that  checks whether the year is a leap year or not.
        // A year is a leap year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400.
        // The program should print out a message indicating the result.

        int year = 2019;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("is a leap year");
        }
        else {
            System.out.println("is not a leap year");
        }


        // Task 3
        // Write a program that checks which int is larger.
        // The program should print out a message indicating the result.
        int num1 = 3;
        int num2 = 123;
        if (num1 > num2){
            System.out.println("num1 is larger than num2");
        } else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        }

        // Task 4
        // Write a program that checks whether the temperature is below freezing (32 degrees or lower),
        // above boiling (212 degrees or higher), or in between.
        // The program should print out a message indicating the result.
        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit <=32){
            System.out.println("Freezing");
        } else if (tempInFahrenheit >= 212) {
            System.out.println("Boiling hot");
        } else if (tempInFahrenheit > 32 || tempInFahrenheit < 212) {
            System.out.println("Temp in between");
        }

        // Task 5
        //Write a program that checks the months and tells which season it is
        // (winter, spring, summer, or fall). Assume that winter starts in December, spring starts in March,
        // summer starts in June, and fall starts in September. The program should print out a message
        // indicating the result.
        byte month = 6;
        if (month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
        }
        else if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        } else if (month == 9 || month ==10 || month == 11) {
            System.out.println("Fall");
        }


    }

}
