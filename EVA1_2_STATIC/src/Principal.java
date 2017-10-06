/*
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
        //Con instanciacion
        PruebaNoEstatico pneObj = new PruebaNoEstatico();//Se instancia (pide memoria)  (MEMORIA DINAMICA)
        pneObj.imprimirMensaje();
        System.out.println(pneObj.nom);
        //Sin instanciacion
        PruebaEstatico.imprimirMensaje();
        PruebaEstatico.nom = "konichiwa";
        System.out.println(PruebaEstatico.nom);
    }
    
}

class PruebaNoEstatico{
    public String nom = "Bonnie";
    public void imprimirMensaje(){
        System.out.println("¡Hola mundo!");
    }
}

class PruebaEstatico{
    public static String nom = "Bonnie";
    public static void imprimirMensaje(){
        System.out.println("¡Hola mundo!");
    }
}