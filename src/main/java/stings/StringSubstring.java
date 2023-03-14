package stings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you cold and windy?";
        String city = message.substring(6, 13);// from C till o which is index 12 up to 13 (not including 13)
        System.out.println(city);

        String question = message.substring(15); //substring (int begin) 15 from W
        System.out.println(question);
        String hello = message.substring(0, 5); // substring (int begin and end)
        System.out.println(hello);


        String welcomeSign = "Welcome to USA, our population is 140 million people," +
                "the average salary is 90k dollars, and our president is Joe Biden";
        System.out.println(welcomeSign.substring(welcomeSign.indexOf("USA"), welcomeSign.indexOf("USA") + 3));//USA
        String country = welcomeSign.substring(welcomeSign.indexOf('U'),welcomeSign.indexOf('A') + 1);// USA
        System.out.println(country);
        System.out.println(welcomeSign.substring(welcomeSign.indexOf('U'),welcomeSign.indexOf('A')));//US
        System.out.println(welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf(",")));//USA


        String population = welcomeSign.substring(welcomeSign.indexOf("140") , welcomeSign.indexOf(" people"));
        System.out.println(population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("salary"),welcomeSign.indexOf(", and"));
        System.out.println(salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);

        String phrase = "Just one positive thought in the morning can change your whole day.";
        System.out.println(phrase.substring(0,4) + " a " + phrase.substring(18, 25));
        int beginIndex = phrase.indexOf("positive"); //9
        int endIndex = phrase.indexOf(" thought"); //
        System.out.println(phrase.substring(beginIndex, endIndex));
        int beginIndex1 = phrase.indexOf("m");
        int endIndex2 = phrase.indexOf(" can");
        System.out.println(phrase.substring(beginIndex, endIndex2));



        ///==================

        String str1 = "hi";
        String str2 = "bye";

        System.out.println(str1 + str2 + str2 + str1); //hibyebyehi

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " " + str2.toUpperCase() +
               " " + str2.toUpperCase() + " " + str2.toLowerCase() + " " + str1.toLowerCase());

        System.out.println(str2.substring(0, 1) + str1.substring( 1));
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str2.charAt(0) + "" + str1.charAt(1));


        String see = "see";
        String hear = "hear";
        System.out.println(see.substring(0,1) + hear.substring(1,4));
        System.out.println(see.replace("ee","ear"));
        System.out.println(see.charAt(0) + "" + hear.charAt(1) + hear.charAt(2) + hear.charAt(3));















    }
}
