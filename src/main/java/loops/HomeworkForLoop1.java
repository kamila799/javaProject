package loops;

public class HomeworkForLoop1 {
    public static void main(String[] args) {

        //Task 1

        for (int i = 1; i <= 50;i++) {
            if (i % 5 == 0) {  // ==0 = is a lest over from the division
                System.out.println(i);
            }
        }

        // Task 2
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        //Task 3

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        //Task 4
        //Write a Java program to print the multiplication table of 5 using a for loop.
        int j =5;
        for (int i = 1; i <=10; i++){
            if (j >=5 ){
                System.out.println(j + " * " + i + " = " + (j * i));
            }
        }

        // Task 5

        for (int i = 1; i <= 20; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }

        //Task 6
        for (int i = 1; i <= 50; i++){
            if (i%2 ==0){
                System.out.println(i);
            }
        }

        //



        // Task 8
        for (int i = 1; i <= 5; i++){  // outer loop is responsible for lines
            for (int k = 5; k >= i; k--) {  //inner loop
                System.out.print("*");
            }
            System.out.println("");
            }

        // Task 9
        for (int i = 1; i <=4; i++){
            for (int k = 1; k <= i; k++){
                System.out.print(i);
            }
            System.out.println("");
        }






    }
}
