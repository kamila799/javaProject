package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");
        if (a > b){
            System.out.println("a is more than b");
        }
        else {
            System.out.println("a is less than be");
        }
        System.out.println("I already compared a and b");

        if (a == b){
            System.out.println("a is more tha b");
        }else {
            System.out.println("earth is larger than sun");
        }
        System.out.println("I already compared a and b");


        int number1 = 100;
        int number2 = 50;

        if (number1 / number2 == 2){
            System.out.println("YES, two");
        }else{
            System.out.println("Not, two");
        }


        String elon = "Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not owned Paypal");
        }


        int q = 100;
        int w = 4;
        int e = 25;
        if (q / e == 4){
            System.out.println("correct");
        }else{
            System.out.println("not correct");
        }
        if (e / w <= w){
            System.out.println("correct");
        }
        else{
            System.out.println("not correct");
        }

        String fruits = " Peach, Apple, Pineapple";
        if (fruits.contains("P")){
            System.out.println("fruits contain P");
        }else{
            System.out.println("doesn't contain P");
        }











    }
}
