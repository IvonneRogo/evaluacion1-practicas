/*COMO FUNCIONA LAS VARIABLE DE TIPO OBJETOS
Y TIPO PRIMITIVO
PARA GUARDAR VALORES EN OTRA VARIABLE, ASI EL ORIGINAL PUEDE CAMBIAR DE VALOR
PERO LA COPIA SE MANTIENE TAL CUAL
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
        //TIPO PRIMITIVO
        int iVal= 10;
        System.out.println("iVal = " + iVal);
        //CREAR UNA COPIA DE iVal
        int iCopiaVal = iVal;
        System.out.println("iCopiaVal = " + iCopiaVal);
        //INCREMENTAMOS iVal
        iVal++;
        System.out.println("iVal = " + iVal); //SE INCREMENTO
        System.out.println("iCopiaVal = " + iCopiaVal);//SE QUEDO CON EL VALOR QUE SE GUARDO PRIMERO
        
        //VARIABLES TIPO OBJETOS
        Datos dObj = new Datos();
        System.out.println("Obj. iVal = " + dObj.iVal);
        //NO FUNCIONA
        Datos dCopiaFakeObj = dObj;//COPIA/GUARDA LA DIRECCION, NO EL VALOR
        System.out.println("dCopiaFakeObj.iVal = " + dCopiaFakeObj.iVal);
        dObj.iVal++;
        System.out.println("Obj.iVal = " + dObj.iVal);
        System.out.println("dCopiaFakeObj.iVal = " + dCopiaFakeObj.iVal);
        
        //CODIGO QUE SI FUNCIONA
        Datos dCopiaRealObj = new Datos();//CREA UNA INSTANCIA
        dCopiaRealObj.iVal = dObj.iVal;//GUARDA EL VALOR
        System.out.println("Obj.iVal = " + dObj.iVal);
        System.out.println("dCopiaRealObj.iVal = " + dCopiaRealObj.iVal);
        dObj.iVal++;
        System.out.println("Obj.iVal = " + dObj.iVal);
        System.out.println("dCopiaRealObj.iVal = " + dCopiaRealObj.iVal);
        //DIRECCIONES
        System.out.println(dObj);
        System.out.println(dCopiaRealObj);//DIFERENTE DIRECCION
        System.out.println(dCopiaFakeObj);//MISMA DIRECCION QUE dObj
    }
    
}


class Datos{
    public int iVal = 10;
}