package ifElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {

        boolean b = 100 > 1; //true
        System.out.println(b);
        String str1 = "avocado";
        boolean b1 = str1.startsWith("d");
        System.out.println(b1);

        boolean a = 10 >= 5; // True
        System.out.println(a);
        boolean c = 2 <= 5; // true
        System.out.println(c);
        b = 70 == 50; // false
        System.out.println(b);

        String x = "banana";
        String v = "apple";
        String q = "grape";
        String w = "peach";
        String e = "milk";
        String r = "coffee";
        String t = "Coffee";

        System.out.println(x.startsWith("b")); // true
        System.out.println(v.endsWith("a")); //false
        System.out.println(q.contains("e"));//true
        System.out.println(w.isEmpty());; //false
        System.out.println(r.equalsIgnoreCase(t)); // true
        System.out.println(e.length()); //4

        System.out.println(e);

        System.out.println(r == e); //false
        System.out.println(r.equals(t)); // false







    }
}
