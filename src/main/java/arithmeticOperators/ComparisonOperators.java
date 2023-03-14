package arithmeticOperators;

public class ComparisonOperators {
    public static void main(String[] args) {

        /*
        Comparison operator are used to compare 2 values:

        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */

        byte potato = 5;
        byte fries = 10;
        System.out.println(potato > fries); //false
        System.out.println(potato < fries); //true
        System.out.println(potato >= fries); //
        System.out.println(potato <= fries);
        System.out.println(potato == fries);
        System.out.println(potato != fries); //true


        byte byte1 = 1;
        byte byte2 = 20;
        short short1 = 10;
        short short2 = 20;
        int int1 = 25;
        int int2 = 15;
        long long1 = 5;
        long long2 = 30;

        System.out.println(long1 > byte1); //true
        System.out.println(long2 < int2); //false
        System.out.println(byte2 >= short2); //true
        System.out.println(int2 <= long1); //false
        System.out.println(byte2 == short2); //true
        System.out.println(byte1 != byte2); //true

        /*
        Concatenation (sliyanie,soedineie) works
         */

        System.out.println(1 + 2);  //3
        System.out.println(1 + 2 + "hello"); //3 hello
        System.out.println("hello" + 1 + 2); //hello12
        System.out.println("hello" + (1+2)); //hello3
        System.out.println("hello" + 3 + true); //hello3true




    }
}
