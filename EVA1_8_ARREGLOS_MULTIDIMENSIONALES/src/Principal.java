/*ARREGLO BIDIMENSIONAL
 */

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
        int aiArray2D[][] = new int[3][3];//MATRICE 3X3
        //LLENAR CADA ELEMENTO DEL ARREGLO CON # ALEATORIOS
        for (int i = 0; i < 3; i++) {//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                aiArray2D[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 3; i++) {//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                System.out.print("["+aiArray2D[i][j]+"]\t");
            }
            System.out.println("");
        }
    }

}
