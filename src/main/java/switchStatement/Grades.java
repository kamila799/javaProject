package switchStatement;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: A, B, C, D or F");
        String grade =sc.nextLine();
        switch(grade){
            case "A":
                System.out.println("Excellent, proud of you");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Good, study more");
                break;
            case "D":
                System.out.println("Bad, study more");
                break;
            case "F":
                System.out.println("Very bad, study harder");
                break;
            default:
                System.out.println("Wrong Letter");
        }



    }
}
