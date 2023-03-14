package stings;

import javax.print.attribute.standard.SheetCollate;

public class HomeworkString3 {
    public static void main(String[] args) {

        // Task 1
        String hello = "Hello World";
        System.out.println(hello.indexOf('W'));

        // Task 2
        System.out.println(hello.charAt(0));

        // Task 3
        System.out.println(hello.substring(0, 5).toLowerCase());

        // Task 4
        System.out.println(hello.substring(0, 5).toUpperCase());

        // Task 5
        String hello1 = "hello";
        String hello2 = "Hello";
        System.out.println(hello1.equals(hello2)); // false
        System.out.println(hello1.equalsIgnoreCase(hello2)); // true
        System.out.println(!hello1.equals(hello2)); //true
        System.out.println(hello1 == hello2); // false


        // Task 6
        String a = "the quick brown gox";
        String b = (a.charAt(0) + "" + a.charAt(4) + a.charAt(10)  + a.charAt(16));
        System.out.println(b);
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());


        // Task 7
        hello = "Hello";
        System.out.println("" + hello.charAt(4) +  hello.charAt(3) +
                hello.charAt(2) + hello.charAt(1) + hello.charAt(0));


        // Task 8

        String helloWorld = "Hello World";
        int counter  = 0;
        String str = helloWorld.toLowerCase();

        if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i'
                || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
            counter++;
        }
        if(str.charAt(1) == 'a' || str.charAt(1) == 'e' || str.charAt(1) == 'i'
                || str.charAt(1) == 'o' || str.charAt(1) == 'u'){
            counter++;
        }
        if(str.charAt(2) == 'a' || str.charAt(2) == 'e' || str.charAt(2) == 'i'
                || str.charAt(2) == 'o' || str.charAt(2) == 'u'){
            counter++;
        }
        if(str.charAt(3) == 'a' || str.charAt(3) == 'e' || str.charAt(3) == 'i'
                || str.charAt(3) == 'o' || str.charAt(3) == 'u'){
            counter++;
        }
        if(str.charAt(4) == 'a' || str.charAt(4) == 'e' || str.charAt(4) == 'i'
                || str.charAt(4) == 'o' || str.charAt(4) == 'u'){
            counter++;
        }
        if(str.charAt(5) == 'a' || str.charAt(5) == 'e' || str.charAt(5) == 'i'
                || str.charAt(5) == 'o' || str.charAt(5) == 'u'){
            counter++;
        }
        if(str.charAt(6) == 'a' || str.charAt(6) == 'e' || str.charAt(6) == 'i'
                || str.charAt(6) == 'o' || str.charAt(6) == 'u'){
            counter++;
        }
        if(str.charAt(7) == 'a' || str.charAt(7) == 'e' || str.charAt(7) == 'i'
                || str.charAt(7) == 'o' || str.charAt(7) == 'u'){
            counter++;
        }
        if(str.charAt(8) == 'a' || str.charAt(8) == 'e' || str.charAt(8) == 'i'
                || str.charAt(8) == 'o' || str.charAt(8) == 'u'){
            counter++;
        }
        System.out.println("Counter of vowels = " + counter);


            // Task 9
        hello = "Hello";
        String world = "World";
        System.out.println(hello + " " + world);

        // Task 10
        hello = "hello";
        hello1 = "HELLO";
        System.out.println(hello.equalsIgnoreCase(hello1)); // true

        // Task 11
        helloWorld = "Hello World";
        System.out.println(helloWorld.length()); //11

        // Task 12
        hello = "Hello";
        System.out.println(hello.charAt(2));

        // Task 13
        System.out.println(helloWorld.indexOf('l'));

        // Task 14
        hello = "hello";
        hello1 = "hello";
        System.out.println(hello == hello1); //true
        System.out.println(hello.equals(hello1)); //true
        System.out.println(!hello.equals(hello1)); // false

        // Task 15
        hello = "hello";
        hello1 = "HELLO";
        System.out.println(hello.equals(hello1)); //false
        System.out.println(hello == hello1); //false
        System.out.println(hello.equalsIgnoreCase(hello1)); // true

        // Task 16
        System.out.println(helloWorld.toLowerCase());

        // Task 17
        System.out.println(helloWorld.toUpperCase());

        // Task 18
        helloWorld = "Hello World";
        System.out.println(helloWorld.replace('l', 'r'));

        // Task 19
        a = "the quick brown gox";
        b = (a.charAt(0) + "" + a.charAt(4) + a.charAt(10)  + a.charAt(16));
        System.out.println(b);
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());


















    }
}
