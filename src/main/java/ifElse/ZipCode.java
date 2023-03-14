package ifElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter 5 digit zip code");
        int zipCode = user.nextInt();
////        String str = "Good Morning";
//
//  //      if ((zipCode + "").length() == 5 && !(zipCode + "").contains("9") && !(zipCode + "").startsWith("0")){
//           System.out.println("Zip code: " + zipCode);
//        }
//        else {
//            System.out.println("Invalid zip");
//        }
        String zip = zipCode + "";

        if (zip.length() == 5 && !zip.contains("9")  && !zip.startsWith("0")){
            System.out.println("Zip code: " + zip);
        }
        else{
            System.out.println("Invalid zip");
            zipCode = user.nextInt();
        }



    }
}
