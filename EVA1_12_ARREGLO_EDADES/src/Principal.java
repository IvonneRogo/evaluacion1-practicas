
import java.util.Scanner;

/*CALCULAR EL PROMEDIO DE EDADES DE UN GRUPO
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
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos tiene el grupo?");
        int iAlum = sCaptu.nextInt();
        //CREAR EL ARREGLO PARA EDADES (ENTERO)
        int aiEdades[] = new int[iAlum];
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Ingrese la edad: ");
            aiEdades[i] = sCaptu.nextInt();
        }
        //CALCULAR EL PROMEDIO
        int iSuma = 0;
        for (int iEdad : aiEdades) {
            iSuma += iEdad;//iSuma=iSuma+iEdad;
        }
        //MOSTRAR
        double dProm = iSuma / iAlum;
        System.out.println("El promedio es: " + dProm);
    }

}
