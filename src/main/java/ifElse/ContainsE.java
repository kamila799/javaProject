package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.nextLine();

        if (word.contains("e")){
            System.out.println(word.indexOf("e"));
            System.out.println("The word contains e: " + word);
        }
        else if (!word.contains("e")){
            System.out.println("The word doesn't contain e: " + word);
        }

        String word1 = "Hello everyone";
        if (word.contains("e")){
            System.out.println(word.indexOf("e"));
        }else {
            System.out.println("the word doesn't contain e");
        }


    }
}
