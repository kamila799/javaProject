package methodOverloading;

public class IntroToMethodOverloading {
    /*
    method names must be unique. We can't have two or more methods to use the same name
     */
    public int getAreaOfRectangle(int length, int width){
        return length * width;
    }
    public int getAreaOfRectangle(double length, double width) {
        System.out.println(9.4 + "fbj");
        return (int) (length * width);
    }
    public int getAreaOfRectangle(long length, int width) {
        return (int) (length * width);
    }

    public int getPerimeterOfSquare (int side){
        return side * 4;
    }
    public int getPerimeterOfSquare (long side) {
        return (int) side * 4;
    }
    public int getPerimeterOfSquare (double side) {
        return (int) side * 4;
    }




}
