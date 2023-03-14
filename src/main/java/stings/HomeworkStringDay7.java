package stings;

public class HomeworkStringDay7 {
    public static void main(String[] args) {

        //Task 1
        String str1 = "Hello Universe!";
        char ch = 'o';
        System.out.println(str1.indexOf(ch));

        // Task 2
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(start, end));

        // Task 3
        String str3  = "Good morning World";
        System.out.println(str3.length()-1);
        System.out.println(str3.charAt(13));

        // Task 4
        String str4 = "             I love coding";
        System.out.println(str4);
        System.out.println(str4.trim());

        // Task 5
        String str5 = "Learn as if you will live forever, live like you will die tomorrow.";
        System.out.println(str5.replace('o', ' '));







    }
}
