package loops;

import java.util.Scanner;

public class PalindromeHomework {
    public static void main(String[] args) {
        // Ask the user to enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        // Reverse the string
        String reverseString = "";
        for (int i = word.length()-1 ; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        if (word.equals(reverseString)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }


//        int length = word.length();
//        boolean isPalindrome = true;
//        for (int i = 0; i < length / 2; i++){
//            if (word.charAt(i) != word.charAt(length-1-i)){
//                isPalidrome = false;
//            }
//        }
//        System.out.println(isPalindrome);



    }
}


