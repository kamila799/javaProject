package primitiveDataTypes;

public class IntroToPrimitives {

    public static void main (String [] args){

        int age = 27;
        int number = 100;

        System.out.println(27);
        System.out.println(age);

        age = 28;
        System.out.println(age);
        System.out.println(number);

        age =  28;

        //
        byte myByte1 = 36;
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;

        myByte1 = 50;  //reassigning value
        System.out.println(myByte1);  //100

        myByte1 = 40;
        System.out.println(myByte1);  //40

        myByte2 = -116;
        System.out.println(myByte2);  //-116

        myByte3 = 126;
        System.out.println(myByte3);  //126

        myByte4 = -127;
        System.out.println(myByte4);  //-127

        short iceCreamPerDay = 5000;
        short iceCreamPerWeek = 25000;
        //short iceCreamPerMonth = 100000; will not work, because more than 32000

        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeek);


        int numOfFollowers =1300;
        numOfFollowers = 300000;
        System.out.println(numOfFollowers);
        numOfFollowers = 2130000000;
        System.out.println(numOfFollowers); //


        long creditCard1 = 1111222233334444L;
        long creditCard2= 1234123412341234l;
         System.out.println(creditCard1);












    }
}
