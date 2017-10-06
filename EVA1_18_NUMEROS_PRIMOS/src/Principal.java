
import java.util.Scanner;

/*NUMEROS PRIMOS
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
        System.out.println("¿Cual nuemero quiere saber si es primo?");
        Scanner sCap = new Scanner(System.in);
        int iNum = sCap.nextInt();
        //PRIMER ALGORITMO
        int iResi = 0;
        boolean bBande = false;
        for (int i = 2; i < iNum; i++) {//i<=(iNum-1)
            //System.out.println(""+i);
            iResi = iNum % i;
            if (iResi == 0) {
                bBande = true;
                break;
            }
        }
        if (bBande) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }
        
        //ALGORITMO EFICIENTE
        bBande = false;
        int iRaiz = (int) (Math.sqrt(iNum));
        for (int i = 2; i <= iRaiz; i++) {
            //System.out.println(""+i);
            iResi = iNum % i;
            if (iResi == 0) {
                bBande = true;
                break;
            }
        }
        if (bBande) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }

    }
}
