package objects;

public class Car {
    String brand;
    String model;
    String year;
    String color;
    String price;

    String drive;
    String stop;
    String playMusic;

    public void brand(){ System.out.println(brand + drive + "s");
    }
    public void model(){ System.out.println(brand + model + " costs: " + price);
    }
    public void year(){ System.out.println(model + " is " + color + "and " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Sienna";
        car1.color = "Black";
        car1.year = "2023";
        car1.price = "$ 60000";







    }



}
