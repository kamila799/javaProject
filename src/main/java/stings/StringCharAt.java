package stings;

public class StringCharAt {
    public static void main(String[] args) {

        String city = "Chicago !";
        System.out.println(city.charAt(4)); //"a"

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println(c);
        System.out.println(welcomeSign.charAt(2));


        char h = welcomeSign.charAt(0);
        System.out.println(h);


        int length = welcomeSign.length();
        System.out.println(length);
        System.out.println(welcomeSign.charAt(welcomeSign.length() -1));

        int index = welcomeSign.indexOf('W');
        System.out.println(index);
        System.out.println(welcomeSign.charAt(welcomeSign.length()-18));





    }
}
