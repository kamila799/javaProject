package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main (String [] args){

        byte myByte; //declared variable (you can't use number in front and the name should make sense
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte); //10

        myByte = 20;
        System.out.println(myByte);

        _another_byte = 100;
        System.out.println(_another_byte);

        //--------------------------------------------------------

        short example0;
        example0 = 18;
        System.out.println(example0);

        example0 = 20;
        System.out.println(example0);

        short example1;
        example1 = 30;
        example1 = 25;
        System.out.println(example1);

        short example2;
        example2 = 10;
        short example3;
        example3 = 13;
        System.out.println(example2);
        example3 = 15;
        System.out.println(example3);
        short example4 ;
        example4 = 35;
        System.out.println(example4);

        //------------------------------------

        int int1;
        int1 = 30;
        System.out.println(int1);
        int1 = 31;
        System.out.println(int1);

        int int2 = 2;
        int2 = 3;
        System.out.println(int2);

        int int3; //created variable and didn't give any value
        int int4;
        int4 = 20;

        int3 = 3131313;
        int3 = 100;
        int4 = 200;

        int3 = int4;
        System.out.println(int3);
        System.out.println(int4);


        int int5 = 40;
        int int6 = 50;

        int5 = 45;
        int6 = int5;
        System.out.println(int5);
        System.out.println(int6);



        /*
        int -2 147 483 648 to 2 147 000 000 Range of INTEGER

         */
        long long1 = 1;
        long1 = -2000;

        long long2 = -2147483649L;
        long long3 = 2147483648L;
        long2 = int5; //45
        System.out.println(long2);

        /*
        byte into
        short
        int
        long
         */
        byte byteNumber = 0;
        short shortNumber = 50;
        int intNumber = 0;
        long longNumber = 127;

        //longNumber = byteNumber;
        // shortNumber = intNumber; NOT WORKS
        // shortNumber = longNumber;
       // longNumber = shortNumber;
       // intNumber = shortNumber;
       // intNumber = byteNumber;

        // CASTING is used to store larger variable values into smaller variable values



        intNumber = (int)longNumber;
        System.out.println(intNumber);
        byteNumber = (byte)intNumber;
        System.out.println(byteNumber);
        shortNumber = (short)longNumber;
        System.out.println(shortNumber);
        intNumber = (int)longNumber;







        /*
        Multiline Comment part (example this method takes numbers and multiplies)
        1.Declare variable (means create variable, but don't give a value)
        2.Assign value to variable (means to put value inside the variable)
        3.Reassign value to variable (put new value to the same variable)

         */

        //single line comment part
    }
}
