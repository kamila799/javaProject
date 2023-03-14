package ifElse;

public class AndOperator {
    public static void main(String[] args) {

        if (2 < 3){
            System.out.println("hello");
        }
        if (5 < 10){
            System.out.println("hello");
        }

        //==================

        if (2 < 3 && 5 <10){
            System.out.println("bye,bye");
        }

        if (false && true){ // only true boolean can be executed in "if"
            System.out.println("potato");
        }

        if (true && false){  // if one of the boolean is false it won't be executed
            System.out.println("do something");
        }

        //==============================================

        String actualUsername = "sunshine123";
        String actualPassword = "moonlight456!true";
        String actualEmail = "sunshine123@gmail.com";
        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";


        if (enteredUsername.equals(actualUsername) && enteredPassword.equals(actualPassword)) {
            System.out.println("Logged in");

        }
        if (enteredUsername.equals(actualUsername) && !enteredPassword.equals(actualPassword)){
            System.out.println("Incorrect password, try again");
        }
        if (!enteredUsername.equals(actualUsername)){
            System.out.println("Username doesn't exist");
        }
        if (!enteredEmail.equals(actualEmail)) {
            System.out.println("Recover email");
        }



    }
}
