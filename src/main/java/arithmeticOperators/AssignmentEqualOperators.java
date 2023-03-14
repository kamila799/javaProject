package arithmeticOperators;

public class AssignmentEqualOperators {

    public static void main(String[] args) {
        /*
         =  assignment operator  (naznachat') when you give value to variable

        == equal equal operator (compares two variables if they equal or not)

        !=  not equal operator (compares if two variables are not equal)

         */

        int number1 = 10; //assignment
        int number2 = 8; //assignment
        System.out.println(number1 == number2);
        System.out.println(100 == 100); //true(boolean result)

        boolean isEqual = 100 == 101; //false
        System.out.println(isEqual);

        boolean isEqual1 = 100 == 100; //true
        System.out.println(isEqual1);

        boolean isEven;  // if number can be divided by 2
        isEven = 80 % 2 == 0;
        System.out.println(isEven);

        int userAge = 70;
        System.out.println(userAge % 2 ==0);
        boolean isOdd = userAge % 2 != 0;
        System.out.println(30 % 7 != 0);




    }
}
