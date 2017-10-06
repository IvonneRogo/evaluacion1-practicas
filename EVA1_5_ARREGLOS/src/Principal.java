/*ARREGLOS
 */

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int TAMA = 10;//MAYUSCULAS POR QUE ES CONSTANTE
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo;//TODOS LOS IDENTIFICADORES SERAN ARREGLOS
        int Arreglo2[];//SOLO EL QUE TENGA [] SERA ARREGLOS
        
        int iArre[] = new int[TAMA];//ARREGLO DE 10 ENTEROS---SE COMPORTA COMO OBJETO
        //LLENARLO CON NUMEROS DEL 1 AL 10, CADA ELEMENTO DEL ARREGLO
        for (int i = 0; i < iArre.length; i++){
            iArre[i] = (int)(Math.random() * 10) + 1;
        }
        for (int j : iArre) {//FOR ESPECIAL PARA ARREGLOS
            System.out.println("valor = " + j);
        }
        
    }
    
}
