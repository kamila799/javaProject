package loops;

public class IntroToLoops {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        for (int i = -1; i <= 5; i++){ // -1 to 5
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--){ //10 to 0
            System.out.println(i);
        }
        // for (int i = 10; i >= 0;  i++ (infinite loop)

        int age;
        for (age = 0; age < 100; age+= 5 ){
            System.out.println("Baby is " + age + " years old");
        }

        for (int apple = 1; apple <= 20; apple++){
            System.out.println(apple + " apples");
        }
        //multiplication table

        for (int k = 1; k <=10; k++){
            System.out.println(2 + " * " + k + " = " + (2 * k));
        }

        for (int j = 1; j < 6; j++){ //prints 5 times until 6 since it's not equal to 6
            System.out.println("Java is fun");
        }





    }
}
