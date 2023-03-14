package methods;

public class IntroToMethods {

    void voidMethod(){
        System.out.println("Inside void method");
        /*
        void means doesn't return anything
        inside void method you can write any logic
         */
    }
    static int sum(int a, int b){
        return a + b;
        /* You Can Not write any code after return

         */

    }

//    public static void main(String[] args) {
//        int result = sum(10, 5);
//        System.out.println(result);

//    }
    int getLetter(){
        return 'a';
    }
    double getAreaOfRectangle (double length, double width){
        return length * width;
    }
    double getAreaOfTriangle (double a, double b, double c){
        return (a + b + c);
    }

    int getTheLengthOfString (String str) {
        return str.length();

    }

    public static void main(String[] args) {
        IntroToMethods intro = new IntroToMethods(); //creating object
        System.out.println(intro.getAreaOfRectangle(5.4, 7.6));
        double areaOfRectangle = intro.getAreaOfRectangle(5.4, 7.6);
    }





}
