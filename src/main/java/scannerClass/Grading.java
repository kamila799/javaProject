package scannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner grading = new Scanner(System.in);
        System.out.println("Enter number 0 to 100");
        int number = grading.nextInt();

        if (number >= 0 & number <= 20){
            System.out.println("bad, study everything again");
        } else if (number >= 21 & number <= 40) {
            System.out.println("ok, study more");
        }
        else if (number >= 41 & number <= 60){
            System.out.println("good, study more");
        } else if (number >= 61 & number <= 80) {
            System.out.println("very good, keep up");
        } else if (number >= 81 & number <= 95) {
            System.out.println("perfect, good job");
        } else if (number >= 96 & number <= 100) {
            System.out.println("exceptional, proud of you");
        }
        else {
            System.out.println ("Error, enter number from 0 to 100");
        }


    }
}
