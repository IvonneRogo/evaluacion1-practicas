
import java.util.Scanner;

/*PRACTICA 16
BUSCAR EL NUMERO DE REPETICIONES DEL ARREGLO
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
        System.out.println("Ingrese el tamaño del arreglo");
        Scanner sCap = new Scanner(System.in);
        int iNum = sCap.nextInt();
        int aiArray[] = new int[iNum];
        //LLENAR EL ARREGLO
        for (int i = 0; i < aiArray.length; i++) {
            System.out.println("Ingrese el numero");
            aiArray[i] = sCap.nextInt();
        }
        //BUSCAR EL NUMERO
        System.out.println("Ingrese el numero que quiera buscar");
        int iVaBuscar = sCap.nextInt();
        int iRepe = 0;
        for (int i = 0; i < aiArray.length; i++) {
            if (iVaBuscar == aiArray[i]) {
                iRepe++;
            }
        }
        System.out.println("El numero " + iVaBuscar + " se repite " + iRepe + " veces");

    }

}
