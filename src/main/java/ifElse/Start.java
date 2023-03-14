package ifElse;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Which letter i chose? ");
        System.out.print("Try to guess: ");
        ch = (char) System.in.read();

        if (ch == answer){
            System.out.println("Congrats!");
        }
        else if (ch > answer){
            System.out.println("Try harder");
        }
        else {
            System.out.println("Wrong");
        }







    }
}
