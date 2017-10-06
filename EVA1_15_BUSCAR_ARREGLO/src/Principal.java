
import java.util.Scanner;

/*PRACTICA 15, BUSCAR LA POSICION DE UN NUMERO QUE SE ENCUENTRA EN UN ARREGLO
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
        int iPosicion = 0;
        for (int i = 0; i < aiArray.length; i++) {
            if (iVaBuscar == aiArray[i]) {
                iPosicion = i + 1;
                System.out.println("El numero " + iVaBuscar + " esta en la posicion " + iPosicion);
                break;
            }
            
        }
        
    }

}
