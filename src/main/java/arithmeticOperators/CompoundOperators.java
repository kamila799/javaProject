package arithmeticOperators;

public class CompoundOperators {
    public static void main(String[] args) {


        int a = 5;
        a++; // a = a + 1
        System.out.println(a);  //6

        a++; //a = 6 + 1
        System.out.println(a); // 7

        a--; //a = a -1;
        System.out.println(a); //6

        int age = 18;
        System.out.println(age++); //post increment 18 it will increment after
        System.out.println(age); //19

        int price = 20;
        System.out.println(++price); //pre increment 21 increments right away
        System.out.println(price++); //21
        System.out.println(price); //22


        int money = 20;
        money += 3; // money = money + 3 (gives result right away)
        System.out.println(money);

        money += 5 ;
        System.out.println(money); //28

        money -= 8;
        System.out.println(money); //20

        money *= 2; //money = money * 2
        System.out.println(money); //40

        money /= 4;
        System.out.println(money); //10

        money %= 2;
        System.out.println(money); //0


        /*
        Compound operators is a short cut of ariphmetic operators
         */











    }
}
