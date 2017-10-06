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
        int aiArray3D[][][] =new int[2][2][2];
        //LENAR CON VALORES ALEATORIOS
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES/PROFUNDIDAD
                    aiArray3D[i][j][k] = (int)(Math.random()*100)+1;
                }
            } 
        }
        
        //IMPRIMIR
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES/PROFUNDIDAD
                    System.out.println("["+aiArray3D[i][j][k]+"]");
                }
            } 
        }
    }
    
}
