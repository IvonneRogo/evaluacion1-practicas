/*Calcular la media, moda y desviacion estandar de un arreglo de edades
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sCap = new Scanner(System.in);
        System.out.println("Ingrese el numero de edades que va a capturar:");
        int iEdad = sCap.nextInt();
        int aiEdades[] = new int[iEdad];

        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Ingrese la edad:");
            aiEdades[i] = sCap.nextInt();
        }
        
        //4CALCULO DE LA MEDIA
        int iSuma = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iSuma += aiEdades[i];
        }
        double dMedia = iSuma / iEdad;
        System.out.println("La media es: " + dMedia);

        //CALCULAR LA MODA
        int iModa = 0, iCont = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            int iRepe = 0;
            for (int j = 0; j < aiEdades.length; j++) {
                if (aiEdades[i] == aiEdades[j]) {//Compara valores en las posiciones
                    iRepe++;//Se va aumentando
                }
                if (iCont < iRepe) {
                    iModa = aiEdades[i];//Guarda el valor como moda
                    iCont++;
                }
            }
        }
        if (iCont > 1) {
            System.out.println("La moda es " + iModa + " y se repite " + iCont + " veces");
        } else {
            System.out.println("No hay moda");
        }
        // System.out.println("La moda es "+iValor+" y se repite "+iCon);

        //CALCULAR LA DESVIACION ESTANDAR
        double dSumEstan = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            dSumEstan += Math.pow((aiEdades[i] - dMedia), 2);
        }
        double dDesEstan = Math.sqrt((dSumEstan) / (iEdad - 1));
        System.out.println("La desviacion estandar es: " + dDesEstan);
    }

}
