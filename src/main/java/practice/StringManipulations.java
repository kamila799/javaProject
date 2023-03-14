package practice;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "Hello Codewise";
        String str2 = new String ("Hello World");

        String word = "hi";
        String word1 = "hi";
        String word3 = new String("hi");
        String word4 = "Hi";

        System.out.println(word == word1);
        System.out.println(word.equals(word1));
        System.out.println(word1 == word3);
        System.out.println(word1.equals(word3));
        System.out.println(word1.equals(word4));
        System.out.println(word1.equalsIgnoreCase(word4));
        System.out.println(str.length() - 1); // "l"
        System.out.println(str.length()); //14
        System.out.println(str.charAt(str.length()/2 )); // 'o'




    }
}
