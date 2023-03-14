package methods;

public class Cat {

    static boolean isCarnivore = true;
    static boolean isMammal = true;
    String type;
    double weight;
    byte age;

    public void eat(){   //instance  method
        System.out.println(type + " is eating");
    }
    public void sleep (int hours){
        System.out.println(type + " slept for " + hours);
    }
    

    public static void main(String[] args) {
        System.out.println("Welcome to Chicago Zoo! Enter your employee id");
        Cat lion = new Cat();
        Cat cheetah = new Cat();
        Cat tiger = new Cat();

        lion.age = 2;
        cheetah.age = 5;
        tiger.isMammal = false;
        System.out.println(isMammal);


    }





}
