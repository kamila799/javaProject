package loops;

public class NestedLoops {
    public static void main(String[] args) {

        /* nested loops - inside loop
        nested loops - inside loop
        tablitsa umnozheniya
         */
        for (int a = 1; a <=30; a++) {
            for (int b = 1; b <= 30; b++) {
                System.out.print((a * b) + "\t");// "\t" - tab is like space  ; n means new line
            }
            System.out.println();
        }


        for (int g = 1; g <= 6; g++){
            for (int j = 1; j <= g; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 -i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }


        for (int x = 1; x <= 10; x++ ){
            for(int y = 1; y<= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    }
}
