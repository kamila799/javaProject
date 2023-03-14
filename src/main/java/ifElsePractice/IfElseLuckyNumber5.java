package ifElsePractice;

import java.util.Scanner;

public class IfElseLuckyNumber5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        String n = s.next();
        String sum1 = n.substring(0) + n.substring(1);
        String sum2 = n.substring(n.length()-2) + n.substring(n.length()-1);

        if (sum1 == sum2){
            System.out.println("Lucky number!");
        }
        else if (sum1 != sum2){
            System.out.println("Not a Lucky number!");
        }


    }
}
