
import java.util.Scanner;

/*COPIA DE UN ARREGLO
todos los objetos guardan en sus variables direcciones
 */

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int TAMA = 5;//constante
    public static void main(String[] args) {
        // TODO code application logic here
        String asNombres[] = new String[TAMA];
        //CAPTURA 5 NOMBRES
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < asNombres.length; i++) {//  lenght devuelve el tamaño del arreglo
            System.out.println("Tu nombre: ");
            asNombres[i] = sCaptu.nextLine();
        }
        for (String asNombre : asNombres) {
            System.out.println("Nombre: "+ asNombre);
        }
        //CREAR UNA COPIA
        String asCopia[] = new String[TAMA];
        for (int i = 0; i < asNombres.length; i++) {//i < TAMA
            asCopia[i] = asNombres[i];
        }
        asNombres[0] = "holis";
        System.out.println("Nombres[0] = " + asNombres[0]);
        System.out.println("Copia[0] = " + asCopia[0]);
    }
    
}
