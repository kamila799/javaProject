package loops;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int a = 10; a >= 0; a--){
            System.out.println("The value of x is: " + a);
        }

        for (int i = 0; i <= 10; i = i +2){
            System.out.println(i);
        }

        for (int y = 10; y >= 0; y -= 2){
            System.out.println("The value of y is: " + y);
        }

        for (int num = 1; num <=15; num += 2){
            System.out.println("The value of num is: " + num);
        }

        int sum = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("The value of i: " + i);
            sum = sum + i;
        }
        System.out.println("The sum of 10 numbers is: " + sum);


        int result = 0;
        for (int a = 2; a <= 100; a += 2){
            System.out.println("The value of a: " + a);
            result = result + a;
        }
        System.out.println("The sum of odd numbers is :" + result);




    }
}
