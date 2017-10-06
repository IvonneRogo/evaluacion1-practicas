/*MATRIZ 10X10
CON DIAGONAL PRINCIPAL IMPRIMA 1'S
 */
package practica_2;

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iMatriz[][] = new int[10][10];

        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < iMatriz[i].length; j++) {
                iMatriz[i][j] = 0;
                if (i == j) {
                    iMatriz[i][j] = 1;
                }
                System.out.print("["+iMatriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

}
