package methods;

public class StringMethods {

    static boolean compareStings(String str1, String str2){
        if (str1.equals(str2)) {
            return true;
        }// else {  i methods we don't have to add else, since if it' s not true it will go right away to return false
            return false;
        }

        static String concatinateStrigs(String s1, String s2){
        return (s1 + s2).toUpperCase();

        }

        static int getLengthOfTwoStrings (String s1, String s2){
        return ((s1 + s2).length());
        }

        static boolean isEven (int num){
        if (num % 2 == 0){
            return true;
        }
        return false;

        }
        public static boolean isDivisible(int num){
        return num % 10 == 0;
        }

        public static void multiplicationTable (int a){
        for (int i = 1; i <=10; i++){

            System.out.println(a + " * " + i + " = " + (a * i));

        }
    }
    public static int getLargest(int a, int b){
        if (a > b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }

    public static int average(int a, int b, int c, int d){
        return ((a + b + c + d)/ 4);

    }

    public static int sumOfAllNumbers (int a){
        int sum = 0;
        for (int j =1; j<= a; j++ ){
            sum = sum + j;
        }
            return sum;
    }



    public static void main(String[] args) {
        boolean isSame = compareStings("hello", "hellloooo"); //false
        System.out.println(isSame);
        compareStings("bye", "sf");
        multiplicationTable(2);
        getLargest(10,15);
        System.out.println(average(1,2,3,4));
        System.out.println(sumOfAllNumbers(5));


    }




}
