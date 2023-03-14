package stings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length()); // returns number of chars

        System.out.println(singerName.endsWith("on")); //true boolean
        System.out.println(singerName.endsWith("ON")); //false

        System.out.println(singerName.startsWith("Misha")); //false
        System.out.println(singerName.startsWith("michael")); //false "Java is case sensetive language"

        System.out.println(!singerName.isEmpty()); //true
        System.out.println(singerName.toLowerCase()); //michael jackson not storing the value because it wasn't assigned
        System.out.println(singerName); // Michael Jackson this object is still in the heap
        singerName = singerName.toUpperCase(); //reassigning the value
        System.out.println(singerName);

        System.out.println(singerName.charAt(0)); //M
        System.out.println("" + singerName.charAt(0) + singerName.charAt(3)); //MH string concatination

        System.out.println(singerName.indexOf('J'));  // 8
        System.out.println(singerName.charAt(8)); // J


        System.out.println(singerName.indexOf("C")); //2
        System.out.println(singerName.indexOf('C', 3 ));
        System.out.println(singerName.indexOf("W")); //in case if the char you're searching for doesn't exist gives - 1 by default

        // System.out.println(singerName.charAt(2352)); // for non existing number =  Index is out of bounds error

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName); // false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2)); //true not equals

        singerName = singerName2;  // now singername is Justin Bieber;
        System.out.println(singerName.equals(singerName2)); // true now both of them pointing to the same object
        System.out.println(singerName == singerName2); //true









    }
}
