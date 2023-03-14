package primitiveDataTypes;

public class HomeWorkPracticeVariables {
    public static void main (String [] args){

        byte byte1 = 9;
        byte byte2 = 25;
        byte byte3 = 73;
        byte byte4 = 99;
        byte byte5 = 111;
        byte1 = 10;

        System.out.println(byte1);
        System.out.println(byte2);
        byte3 = byte4;  //99
        System.out.println(byte3);
        System.out.println(byte4);
        byte3 = byte5;
        System.out.println(byte5);

        byte byte6 = 55;
        byte byte7 = 66;
        byte7 = byte6;
        System.out.println (byte7);

        byte byte8 = 76;
        byte byte9 = 86;
        byte byte10 = 98;
        byte9 = 88;
        byte8 = 77;
        byte8 = byte9; // 88
        System.out.println(byte8);  //88
        System.out.println(byte9);
        byte10 = 99;
        byte8 = byte10;
        System.out.println(byte10); // 99



        short short1;
        short short2 = 20;
        short short3 = 300;
        short short4 = 400;
        short short5 = 500;
        short1 = 100;
        short2 = short1; //100
        System.out.println(short1);
        System.out.println(short2);
        System.out.println(short3);

        short3 = 333;
        short5 = 555;
        short4 = short5; // 555
        System.out.println(short3);
        System.out.println(short4); //555
        System.out.println(short5);

        short short6 = 600;
        short short7 = 700;
        short short8 =800;
        short short9 = 900;
        short short10 =1000;
        short7 = 7777;
        short9 = 9999;
        short10 =short9; //9999
        short6 = short7;
        System.out.println(short6); //7777
        System.out.println(short7);
        System.out.println(short8);
        System.out.println(short9); //9999
        System.out.println(short10); //9999



        int int1 = 100500;
        int int2;
        int int3 = 300;
        int int4 = 4000;
        int int5;
        int2 = int1;
        System.out.println(int1); //100500
        System.out.println(int2);

        int5 = 500100;
        int3=int5;
        System.out.println(int3); // 500100
        System.out.println(int4);
        System.out.println(int5);

        int int6 = 600500;
        int int7 = -700300;
        int int8 = 80;
        int int9 = -900555777;
        int int10;
        int8 = -333555;
        int6 = int8; // 333555
        int10 = int9;
        System.out.println(int6);
        System.out.println(int7);
        System.out.println(int8);
        System.out.println(int9); // -900555777
        System.out.println(int10);


        long long1 = 1111222233334444L;
        long long2 = 0000111122223333L;
        long long3;
        long long4;
        long long5 = 5555666677778888L;
        long3 = 9999777755553333L;
        long1 = long3;
        long4 = long5;
        System.out.println(long1); //9999777755553333
        System.out.println(long2);
        System.out.println(long3); //9999777755553333
        System.out.println(long4); //5555666677778888
        System.out.println(long5);

        long long6;
        long long7;
        long long8 = 8888999900007777L;
        long long9 = 9999000088887777L;
        long long10 = 1000200030004000L;
        long7 = 7777000055557777L;
        long6 = long7;  // 7777000055557777
        long10 = long9; //9999000088887777
        System.out.println(long6); //7777000055557777
        System.out.println(long7);
        System.out.println(long8);
        System.out.println(long9);
        System.out.println(long10);



        float float1 = 123456.99F;
        float float2;
        float float3;
        float float4 = 1234567.990095F;
        float float5 = 5;
        float3 = -333.99F;
        float2 = float3;
        float5 = -999.999F;
        float3 = -11222.999F;
        float1 = float2;
        System.out.println(float1); //
        System.out.println(float2); //-333.99
        System.out.println(float3); //-11222.999
        System.out.println(float4);
        System.out.println(float5);

        float float6 = 3333222244445555.99F;
        System.out.println(float6);
        float float7 = 1234567.99F;
        System.out.println(float7);
        float float8 = 123456.99F;
        System.out.println(float8);
        float float9 = 123.12345F;
        System.out.println(float9);
        float float10 = 12345.1234F;
        System.out.println(float10);


        double double1 = 12.123456;
        System.out.println(double1);
        double double2 = 123.123456;
        System.out.println(double2);
        double double3 = 123.12345;
        System.out.println(double3);
        double double4 = 1234.1234;
        System.out.println(double4);
        double double5 = 12345.12345;
        System.out.println(double5);
        double double6 = 123456.123456;
        System.out.println(double6);
        double double7 = 1234567.1234567;
        System.out.println(double7);
        double double8 = 12345678.12345678;
        System.out.println(double8);
        double double9 = 12345678.1234567;
        System.out.println(double9);
        double double10 = 1234567.12345678;
        System.out.println(double10);


        boolean catsLoveMeat = true;
        boolean dogsHateCats = false;
        boolean weatherIsBad = true;
        boolean itIsIcy = false;
        boolean teaIsHot = true;
        System.out.println(catsLoveMeat);
        dogsHateCats = true;
        System.out.println(dogsHateCats); //true
        itIsIcy = weatherIsBad;
        System.out.println(weatherIsBad); //true
        System.out.println(itIsIcy); //true
        teaIsHot = false;
        System.out.println(teaIsHot);
        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = true;
        boolean a4 = false;
        boolean a5 = true;
        System.out.println(a1);
        a2 = a3;
        System.out.println(a2); //true
        a3 = a4;
        System.out.println(a3); //false
        System.out.println(a4); //false
        System.out.println(a5);



        char name1 = '-';
        char name2 = '+';
        char name3 = '=';
        char name4 = '/';
        char name5 = '*';
        char name6 = '2';
        char name7 = '5';
        char name8 = '@';
        char name9 = 'H';
        char name10 = 'I';

        name1 = name2;
        name5 = name4;
        name7 = name9;
        System.out.println(name1); //+
        System.out.println(name2); //+
        System.out.println(name3);  //=
        System.out.println(name4); // /
        System.out.println(name5); // /
        System.out.println(name6);  //2
        System.out.println(name7); //H
        System.out.println(name8); //@
        System.out.println(name9);  //H
        name9 = name10;
        System.out.println(name9); //I
        System.out.println(name10);  //I




































    }
}
