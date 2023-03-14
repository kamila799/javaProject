package scannerClass;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter month");
        String month = user.next();

        if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
                || month.equalsIgnoreCase("February")){
            System.out.println("Winter");
        }
        else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
                || month.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }
        else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
                || month.equalsIgnoreCase("August")){
            System.out.println("Summer");
        }
        else if (month.equalsIgnoreCase( "Septermber") || month.equalsIgnoreCase("October")
                || month.equalsIgnoreCase("November")) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
