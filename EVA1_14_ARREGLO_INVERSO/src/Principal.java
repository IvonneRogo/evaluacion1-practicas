
import java.util.Scanner;

/* PRACTICA 14: ARREGLO DE UNA SOLA DIMENSION, PREGUNTAR CUANTOS SON, 
LLENAR EL ARREGLO Y HACER UNA COPIA PERO EN INVERSO
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
        System.out.println("¿Cuantos numeros ingresara?");
        Scanner sCap=new Scanner(System.in);
        int iVal=sCap.nextInt();
        int aiNumeros[]=new int[iVal];
        for (int i = 0; i < aiNumeros.length; i++) {
            System.out.println("Ingrese el numero: ");
            aiNumeros[i]=sCap.nextInt();
        }
        //COPIA DEL ARREGLO
        int aiCopiaNumeros[]=new int[aiNumeros.length];
        for (int i = 0; i < aiCopiaNumeros.length; i++) {
            iVal--;
            aiCopiaNumeros[i]=aiNumeros[iVal];
        }
        System.out.println("COPIA");
        for (int i = 0; i < aiCopiaNumeros.length; i++) {
            System.out.println(aiCopiaNumeros[i]);
        }
    }
    
}
