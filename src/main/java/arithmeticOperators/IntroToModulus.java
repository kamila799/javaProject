package arithmeticOperators;

public class IntroToModulus {

    public static void main(String[] args) {

        /*
        % modulus returns you the remainder after division
        Even numbers are numbers that can be divided by 2
        Odd numbers that can't be divided by 2
         */
        int a = 12;
        int b = 5;
        int c = a % b;  //2
        System.out.println(c);
        System.out.println(100 % 30); //10
        System.out.println(100 % 20); //0
        System.out.println(12.6 % 3); // 0
        System.out.println(25 % 10); //5 (20) ostatok 5
        System.out.println (5 % 4); //1
        System.out.println(25 % 5); //0 (ostatok nol)
        System.out.println(7 % 2 ); // 7 can't be divided by 2 (1)




    }
}
