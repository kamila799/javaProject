package methodOverloading;

public class ArithmeticOperators {
    public int sumOfTwo (int a, int b){
        return a + b;
    }
    public int sumOfThree (int aa, int bb, int cc){
        return aa+ bb + cc;
    }

    public int averageOfFour (int q, int w, int e, int r){
        return (q+ w + e + r)/ 4;
    }
    public int averageOfSix (int qq, int ww, int ee, int rr, int tt, int yy){
        return (qq + ww + ee+ rr + tt + yy) /6;
    }
    public double getAreaOfTriangle (int base, int height){
        int area =  (1/2 * base * height);
        return area;
    }
    public double getAreaOfTriangle (int a, int b, int c) {
        int s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s -a) * (s-b) * (s-c));
        return area;
    }

}
