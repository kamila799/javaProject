package arithmeticOperators;

public class HomeworkPracticeOperators3 {
    public static void main(String[] args) {

        int a = 7;
        int b = 12;
        System.out.println(a + b);

        // Task 2

        a = 15;
        b = 8;
        System.out.println(a % b);

        // Task 3

        a = 3;
        b = 5;
        int c = 7;
        a *= b *= c;
        System.out.println(a);

        // Task 4
         a = 20;
         b = 5;
         a /= b;
         System.out.println(a);


         // Task 5

        a = 27;
        b = 4;
        System.out.println(a % b);
        a = 27;
        b = 4;
        a %= b;
        System.out.println(a); //3


        // Task 6

        a = 2;
        System.out.println(((((a * a) * a) * a) * a)) ; // =32


        // Task 7

        a = 10;
        b = 15;
        c = 20;
        int sum = a + b + c;
        System.out.println(sum);  //45
        int average = sum/3;
        System.out.println(average); //15

        // Task 8

        int length = 5;
        int width = 8;
        int area = length * width;
        System.out.println(area); //area of a rectangle 40

        // Task 9

        int sideLength = 6;
        int perimeter = 4 * sideLength;
        System.out.println(perimeter);  //perimeter of a square 24














    }
}
