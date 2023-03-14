package stings;

public class StringIndexOf {
    public static void main(String[] args) {

        String ad  = "Buy two, get one free!";
        int index = ad.indexOf('g');
  //      System.out.println(index);
//        index = ad.indexOf('t'); //4
//        System.out.println(index);
//        System.out.println(ad.indexOf(',')); //7
//        index = ad.indexOf('o', 7);
//        System.out.println(index);
          index = ad.indexOf('o', ad.indexOf('o') + 1);
          System.out.println(index);
//        index = ad.indexOf('t', ad.indexOf('t') + 1);
//        System.out.println(index);

//        String trump = "TRUMP BYER";
//        int city = trump.indexOf('Y');  //7
//        System.out.println(city);
//        city = trump.indexOf('R', 2); //9
//        System.out.println(city);//9
//        System.out.println(trump.indexOf('R', trump.indexOf(' ') + 1));
//        System.out.println(trump.indexOf('R')); // 1







    }
}
