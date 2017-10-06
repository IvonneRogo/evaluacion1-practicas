/*MULTIPLICACION DE DOS MATRICES DE 5X5
 */
package practica_4;

import java.text.DecimalFormat;

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
        DecimalFormat objFormato = new DecimalFormat("#.##");

        double[][] adMatriz1, adMatriz2, adMatrizResu;
        adMatriz1 = new double[5][5];
        adMatriz2 = new double[5][5];
        adMatrizResu = new double[5][5];

        System.out.println("MATRIZ 1");
        for (int i = 0; i < adMatriz1.length; i++) {
            for (int j = 0; j < adMatriz1[i].length; j++) {
                adMatriz1[i][j] = ((Math.random() * 10.0) + 1.0);
                System.out.print(objFormato.format(adMatriz1[i][j]) + "\t");
            }
            System.out.println("");
        }
        //Matriz 2
        System.out.println("MATRIZ 2");
        for (int i = 0; i < adMatriz2.length; i++) {
            for (int j = 0; j < adMatriz2[i].length; j++) {
                adMatriz2[i][j] = ((Math.random() * 10.0) + 1.0);
                System.out.print(objFormato.format(adMatriz2[i][j]) + "\t");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ RESULTANTE");
        for (int i = 0; i < adMatrizResu.length; i++) {
            for (int j = 0; j < adMatrizResu[i].length; j++) {
                adMatrizResu[i][j] = adMatriz1[i][j] * adMatriz2[i][j];
                System.out.print(objFormato.format(adMatrizResu[i][j]) + "\t");
            }
            System.out.println("");
        }

    }

}
