/*ARREGLO TRIDIMENSIONAL
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
        int aiArray3D[][][] = new int[5][3][8];

        for (int i = 0; i < aiArray3D.length; i++) {//FILAS        
            for (int j = 0; j < aiArray3D[i].length; j++) {//COLUMNAS      
                for (int k = 0; k < aiArray3D[i][j].length; k++) {//NIVELES      
                    aiArray3D[i][j][k] = (int) (Math.random() * 100) + 1;
                }
            }
        }
        /*for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.println("[" + aiArray3D[i][j][k] + "]");
                }
            }
        }*/
        //FOR EACH. CUMPLE LA MISMA FUNCION QUE EL CODIGO DE ARRIBA (3 FOR'S)
        for (int[][] aiArray3D1 : aiArray3D) {//REGRESA UN ARREGLO DE DOS DIMENSIONES
            for (int[] aiArray3D11 : aiArray3D1) {//UNA DIMENSION
                for (int b : aiArray3D11) {//EL VALOR, ENTERO
                    System.out.println("["+b+"]");
                }
            }
        }
    }

}
