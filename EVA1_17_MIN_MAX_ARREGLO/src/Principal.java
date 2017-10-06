
import java.util.Scanner;

/*PRACTICA 17:
BUSCAR EL VALOR MINIMO Y MAXIMO DE UN ARREGLO
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
        //BUSCAR EL MAXIMO Y MINIMO
        int iMax = aiArray[0];
        int iMin = aiArray[0];
        for (int i = 0; i < aiArray.length; i++) {
            if (aiArray[i] <= iMin) {
                iMin = aiArray[i];
            }
            if (aiArray[i] >= iMax) {
                iMax = aiArray[i];
            }
        }
        System.out.println("El valor maximo es " + iMax + " y el valor minimo " + iMin);
    }

}
