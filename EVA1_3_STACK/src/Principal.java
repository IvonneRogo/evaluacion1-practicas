/*PRACTICA PARA VER LA UTILIZACION DE LA MEMORIA STACK
VER QUE ES LO QUE SE EJECUTA PRIMERO
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
        System.out.println("Llamando a A()");
        A();//LLAMA EL METODO A
        System.out.println("Terminando A()");
    }
    
    public static void A(){
        System.out.println("Llamando a B()");
        B();//LLAMA EL METODO B
        System.out.println("Terminando B()");
    }
    
    public static void B(){
        System.out.println("Llamando a C()");
        C();
        System.out.println("Terminando C()");
    }
    
    public static void C(){
        System.out.println("METODO C");
    }
}
