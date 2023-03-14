package stings;

public class IntroToStrings1 {
    public static void main(String[] args) {

        String city = "London";
        System.out.println(city);

        String city2 = new String("New York");
        System.out.println(city2);

        //-----------------
        System.out.println(city.length());  // Length method returns us the number of chars (letters) in that string 6
        System.out.println(city2.length()); // 8
        String name =  "Antananarivo";
        System.out.println("The length of Antananarivo is: " + name.length());

        System.out.println("Benazir".length()); // Can't call it again because the reference wasn't created

        String school = "Codewise"; // this object is still there
        school = "CodeWise Academy"; //new object is created

        /*
        equals() method compares the values of 2 Stings
         */

        String fruit1 = "apple";  //different references but the same object
        String fruit2 = "apple"; // same object from heap memory > (String Pool)
        String fruit3 = "Apple"; // new object created in the String Pool

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame); //true
        isSame = fruit1.equals(fruit3);
        System.out.println(isSame); //False

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println("Is banana same as orange? " + fruit1.equals(fruit2));  //False ( This boolean doesn't have the reference

        boolean isSame2 = !fruit1.equals(fruit2);  // !.equals Checks not equals , TRUE

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        boolean isSame4  = !state1.equals(state2);
        System.out.println(isSame4);  //true
        boolean isSame5 = state2.equalsIgnoreCase(state4);
        System.out.println(isSame5); //true
        System.out.println(state3.equals(state5)); //false
        isSame5 = state5.equals(state1); // false
        System.out.println(isSame5);
        isSame5 = !state4.equals(state3); //true
        System.out.println(isSame5);



        //========================

        int cucumber = 5;
        int tomato = 10;

        System.out.println("cucumber: " + cucumber); // cucumber: 10
        System.out.println("tomato: " + cucumber); //tomato: 5

        int empty = cucumber; //5
        cucumber = tomato; //10
        tomato = empty; //5

        System.out.println("cucumber: " + cucumber);
        System.out.println("tomato: " + tomato);

        // Second way
        cucumber = 5;
        tomato =10;
        int cc = cucumber;
        cucumber += cucumber; //10
        tomato -= cc; //5
        System.out.println("cucumber: " + cucumber);
        System.out.println("tomato:" + tomato);












    }
}
