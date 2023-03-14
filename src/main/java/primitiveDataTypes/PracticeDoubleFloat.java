package primitiveDataTypes;

public class PracticeDoubleFloat {
    public static void main (String [] args){
        /*
       - float and double are variables that store decimal numbers
       - double is larger than float
       - double is the most precise variable
       - Java thinks that all decimal numbers are double
       - to make sure float is float put F/f in the end
       4.88 -floating,fractional numbers, decimal numbers
       1,2,3 - whole numbers
       1234567890 - decimal system
       01234567 - octal system
       0123456789abcdef - hexadecimal
       10 - binary system

         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.99555555555555555555555553333333;
        System.out.println(priceOfApples);

        priceOfBread = 33333339999994444984.9303982384824844;
        System.out.println(priceOfBread);

        priceOfBread = 98.1;

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 =345;
        float float1 = 3545.64F;
        double double1 = 2343;

        float1 = (float)double1;
        double1 = float1;

        double1 =4.99;
        long1 = (long)double1;
        System.out.println(long1);
        int1 = (byte)byte1;
        System.out.println(int1);











    }

}
