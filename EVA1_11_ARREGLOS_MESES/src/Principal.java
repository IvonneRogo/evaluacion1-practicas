
import java.util.Scanner;

/*ARREGLO DE LOS MESES
 USAR UN ARREGLO PARA MOSTRAR LOS MESES, EN VEZ DE USAR EL SWITCH O IF
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
        String asMeses[] = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 12: ");
        int iMes = sCaptu.nextInt();
        System.out.println("El mes correspondiente es " + asMeses[iMes - 1] + " y tiene " + aiDias[iMes - 1] + " dias.");

    }

}
