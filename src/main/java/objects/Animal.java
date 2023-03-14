package objects;

public class Animal {
    String name;
    String type;
    boolean isMammal;
    boolean isCarnivore;
    String eat;
    String environment;

    public void eat(){ System.out.println(type + " eats: " + eat + " . " + type + " is Mammal animal: " + (isMammal ));
    }
    public void sleep() {
        System.out.println(type + " sleeps in " + isCarnivore + " is habitat" );
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.type = "Giraph";
        animal1.isMammal = true;
        animal1.eat = "greens";

        animal2.type = "Alligator";
        animal2.isMammal = false;
        animal2.eat = "meat";




        animal1.eat();
        animal2.eat();

    }




}
