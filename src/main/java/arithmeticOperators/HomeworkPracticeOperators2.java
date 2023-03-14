package arithmeticOperators;

public class HomeworkPracticeOperators2 {
    public static void main(String[] args) {

        //Task 1

        int a = 100;
        int b = 200;
        int result = (a + b);
        System.out.println(a + " + " + b + " = " + result);
        System.out.println(a + " + " + b + " = " + (a + b));


        // Task 2

        int q = 5;
        int w = 9;
        int e = 10;
        int result2 = (q + w + e);
        System.out.println(q + " + " + w + " + " + e + " = " + result2);


        // Task 3

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 7;
        int a6 = 8;
        int a7 = 10;
        System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
        System.out.println(a3 + " - " + a1 + " = " + (a3 - a1));
        System.out.println(a2 + " * " + a2 + " = " + (a2 * a2));
        System.out.println(a4 + " / " + a2 + " = " + (a4 / a2));
        System.out.println(a2 + " + " + a6 + " = " + (a2 + a6));
        System.out.println(a7 + " % " + a5 + " = " + (a7 % a5));


        //Task 4

        int length = 9;
        int width = 15;
        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println(perimeter); //perimeter = 2 * (length + width)
        System.out.println(area);  //area = length * width


        // Task 5

        double x1 = 8;
        double x2 = 2345;
        double result1 = ((x1 + x2) / 3);
        System.out.println((x1 + x2)/3);  //2353
        System.out.println(result1 % 5); //4
        double result3 = (result1 % 5);
        System.out.println(result3 * 5);
        System.out.println("(((8 + 2345) / 3) % 5) * 5" +  " = " + ((result3) * 5));


        // Task 6
        x1 += x2;
        System.out.println(x1); //2353
        x1 /= 3;
        System.out.println(x1); //784
        x1 %= 5;
        System.out.println(x1);  //4
        x1 *= 5;
        System.out.println(x1);  //21..


        // Task 7

        byte y1 = 23;
        byte y2 = 45;
        System.out.println(y1 == y2); //false
        System.out.println(y1 > y2);  //false
        System.out.println(y1 < y2);  // true
        System.out.println(y1 >= y2);  //false
        System.out.println(y1 <= y2);  //true
        System.out.println(y1 != y2);  //true


        // Task 8

        byte debt = -10;
        byte balance = 10;
        System.out.println(debt == balance); //false
        System.out.println(debt > balance); //false
        System.out.println(debt < balance); // true
        System.out.println(debt >= balance); //false
        System.out.println(debt <= balance); //true
        System.out.println(debt != balance); //true
























    }
}
