/* MATRIX 5X5, NUMEROS ALEATORIOS ENTRE 1 Y 100
COPIA DE LA MATRIZ PERO CON LOS NUMEROS INVERSOS

 */
package practica_3;

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
        int aiMatriz[][] = new int[5][5];
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int) ((Math.random() * 100) + 1);
                System.out.print("[" + aiMatriz[i][j] + "]\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //COPIA
        int iF=5;
        int aiCopiaMatriz[][] = new int[5][5];
        for (int i = 0; i < aiCopiaMatriz.length; i++) {
            int iC=5;
            iF--;
            for (int j = 0; j < aiCopiaMatriz[i].length; j++) {
                iC--;
                aiCopiaMatriz[i][j] = aiMatriz[iF][iC];
                System.out.print("[" + aiCopiaMatriz[i][j] + "]\t");
            }
            
            System.out.println("");
        }
    }

}
