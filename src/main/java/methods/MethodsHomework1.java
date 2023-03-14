package methods;

public class MethodsHomework1 {
//    Create PracticeMethods class and do the following tasks:
//
//    Create a public static method that takes two integers and returns the multiplication of 2 ints.
//    Create a public instance method that takes a String and returns a new String with all lowercase letters.
//    Create a public instance method that takes two integers, divides one int by another and returns the result as a double.
//    Create a static method that takes a string and returns true if it is a palindrome (reads the same forwards and backwards) and false otherwise.
//    Create an instance method that takes a double and returns that double multiplied by 100.
//    Create a static method that takes a char and returns true if it is a consonant (a letter that is not a vowel) and false otherwise.
//    Create a public instance method that takes two integers and returns true if difference between them equals to 5 or -5, else false.
//    Create an instance method that takes a String and returns true if it is a valid email address format (contains "@" and ".") and false otherwise.
//    Create a public instance method that takes an integer and returns true if it is a prime number and false otherwise.
//    Create a static method that takes two integers and returns true if they have the same parity (both even or both odd) and false otherwise.

    public static int multiplication (int a, int b){
        return a * b;
    }
    public String lowerCase(String word) {
       return (word.toLowerCase());
    }
    public double division (int i, int j){
        return i / j;
    }
    public static boolean palindrome (){
        return true;
    }




    public static void main(String[] args) {
        System.out.println(multiplication(5, 2));
    }


    }



