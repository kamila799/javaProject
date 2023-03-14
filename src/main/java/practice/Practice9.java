package practice;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        String aa = user.nextLine();
        System.out.println("Enter the first string");
        String b = user.nextLine();
        System.out.println("Enter the second string");

        if (aa.length() > b.length()){
            System.out.println(aa + ": " + aa.length());
        }
        else if (b.length() > aa.length()){
            System.out.println(b + ": " + b.length());
        }
        else{
            System.out.println(aa + " " +  b  + ": " + aa.length());
        }
    }
}
