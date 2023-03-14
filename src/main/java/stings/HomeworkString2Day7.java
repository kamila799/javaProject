package stings;

import java.sql.SQLOutput;

public class HomeworkString2Day7 {
    public static void main(String[] args) {

        // Task 1
        String a = "CodeWise!";
        System.out.println(a.endsWith("!"));

        // Task 2
        System.out.println(a.indexOf('W'));
        System.out.println(a.substring(4, 9));
        System.out.println("" + a.charAt(4) + a.charAt(5) + a.charAt(6) + a.charAt(7) + a.charAt(8));

        // Task 3
        System.out.println(a.replace('!', '.'));

        // Task 4
        String aa = "Hello Codewise!";
        System.out.println(aa.length());

        int startIndex = 6;
        int endIndex = 15;
        System.out.println(aa.substring(startIndex, endIndex));


        // Task 5
        System.out.println(a.lastIndexOf('!'));

        // Task 6
        System.out.println(aa.startsWith("Hello")); //true

        // Task 7
        System.out.println(aa.replaceFirst("Codewise", "CodeWise"));

        // Task 8
        String str = "hello hi how are you?";
        char h = 'h';
        System.out.println("HERE: "+str.indexOf("" + "h", 1));

        // Task 9
        aa = "       Hello Code Wise!";
        System.out.println(aa);
        System.out.println(aa.trim());
        aa = "    Hello Code Wise!";
        System.out.println(aa.replace(" ", ""));
        aa = aa.replace(" ", "");

        // Task 10
        System.out.println(aa.toUpperCase());






    }
}
