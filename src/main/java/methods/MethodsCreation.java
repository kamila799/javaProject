package methods;

public class MethodsCreation {

    public static int takesTwoIntAndReturnString (int a, int b){
        String str = ("" + (a +b));
        return (a + b);
    }

    public static boolean takesOneIntReturnsBoolean (int a){
        return false;
    }
    public static int returnsOne (){
        return 1;
    }

    public static double returnDouble (String str){
        return 1.8 ;
    }
    public void takesNothing (){
        return;
    }

    public static void takes3IntsReturnsNothing (int a, int b, int c){
        return;

    }
//    public static short returnShort (String str1, String str2) {
//        return ;
//    }
//
//    public static byte returnsByte (int a){
//        return byte
//    }





    public static void main(String[] args) {
        System.out.println(takesTwoIntAndReturnString(2, 5));
        System.out.println(takesOneIntReturnsBoolean(3));
        System.out.println(returnsOne());
        System.out.println(returnDouble("Hello"));
//        System.out.println(takesNothing();
//        System.out.println(takes3IntsReturnsNothing();
//        System.out.println(returnShort());

    }
}
