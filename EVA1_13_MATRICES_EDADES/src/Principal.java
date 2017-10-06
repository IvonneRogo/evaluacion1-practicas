
import java.util.Scanner;

/*ARREGLO DONDE SE ESPECIFICA LAS COLUMNAS 
SACAR EL PROMEDIO DE CADA GRUPO
 */
/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int aiEdades[][]=new int[4][30];
        /*EJEMPLO
         int aiEdades[][];
         aiEdades = new int [4][];
         //PREGUNTAR GRUPO POR GRUPO
         aiEdades[0] = new int[10];//GRUPO 1 /DEFINIMOS FILA POR FILA
         aiEdades[1] = new int[28];//GRUPO 2
         aiEdades[2] =new int[10];//GRUPO 3*/

        System.out.println("¿Cuantos grupos tiene?");
        Scanner sCap = new Scanner(System.in);
        int iGrupo = sCap.nextInt();//FILAS
        int aiEdades[][];//ARREGLO
        aiEdades = new int[iGrupo][];
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("¿Cuantos alumnos tiene en el grupo " + (i + 1) + "?");
            //int iAlum =sCap.nextInt();
            aiEdades[i] = new int[sCap.nextInt()];
        }
        //CAPTURAR LAS EDADES
        for (int i = 0; i < aiEdades.length; i++) {
            for (int j = 0; j < aiEdades[i].length; j++) {
                System.out.println("Ingrese la edad del alumno del grupo " + (i + 1));
                aiEdades[i][j] = sCap.nextInt();
            }
        }
        //CALCULAR EL PROMEDIO
        int iSum = 0;               //(12+13+14)=39/3=13
        int iEdad = 0;               //(12+13+14+15)=54/13.5
        for (int i = 0; i < aiEdades.length; i++) {
            for (int j = 0; j < aiEdades[i].length; j++) {
                iSum += aiEdades[i][j];
                iEdad = j + 1;
            }

            System.out.println("Grupo " + (i + 1) + ": " + (double)(iSum / iEdad));
            iSum = 0;
        }

    }

}
