package stings;

public class HomeworkString2 {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello World!";
        String hello3 = new String("Hello World!");

        // Task 1
        System.out.println(hello1 == hello2); // true

        // Task 2
        System.out.println(hello1 == hello3); // false

        // Task 3
        System.out.println(!hello1.equals(hello2)); //false

        // Task 4
        hello1 = hello1.toLowerCase();
        hello2 = hello2.toLowerCase();
        System.out.println(hello1.equals(hello2)); //true
        System.out.println(hello1 == hello2); // false

        // Task 5
        hello1 = hello1.toUpperCase();
        hello3 = hello3.toUpperCase();
        System.out.println(hello1.equals(hello3)); //true
        System.out.println(hello1 == hello3); //false




    }
}
