/*ARREGLO DE OBJETOS
HEAP= CUANDO NO SE SABE LA MEMORIA QUE SE UTILIZARA
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
        //ARREGLO DE 10 ALUMNOS
        Alumno aaAlumnos[] = new Alumno[10];
        for (int i = 0; i < 10; i++) {
            aaAlumnos[i] = new Alumno("Ivonne", "15060769", 0);
        }
        //IMPRIMIR LOS DATOS DE LOS ALUMNO
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " +aaAlumnos[i].getsNom());
            System.out.println("No control: " +aaAlumnos[i].getsNoCtrl());
            System.out.println("Carrera: " +aaAlumnos[i].getiCarr());
        }
        //CREAR UNA COPIA DEL ARREGLO
        Alumno CopiaObj[] = new Alumno[10];
        for (int i = 0; i < 10; i++) {
            CopiaObj[i] = new Alumno(aaAlumnos[i].getsNom(),aaAlumnos[i].getsNoCtrl(),aaAlumnos[i].getiCarr());
        }
        aaAlumnos[2].setsNom("RANCHO");
        aaAlumnos[2].setsNoCtrl("1234543");
        aaAlumnos[2].setiCarr(0);
        
        //System.out.println("Nombre: " +aaAlumnos[2].getsNom());
        System.out.println("\nCOPIA");
        //IMPRIMIR LOS DATOS DE LOS ALUMNO
        for (int i = 0; i < 10; i++) {
            System.out.println(CopiaObj[i]);
            System.out.println(aaAlumnos[i]);
            /*System.out.println("Nombre: " +CopiaObj[i].getsNom());
            System.out.println("No control: " +CopiaObj[i].getsNoCtrl());
            System.out.println("Carrera: " +CopiaObj[i].getiCarr());*/
        }
        
    
    }
    
}

class Alumno{
    private String sNom;
    private String sNoCtrl;
    private int iCarr;//0=ISC
    //CONSTRUCTOR PARA LA CLASE, INICIALIZAR
    public Alumno(String sNombre, String sNoCtrl, int iCarr) {
        this.sNom = sNombre;
        this.sNoCtrl = sNoCtrl;
        this.iCarr = iCarr;
    }
    //SET GET DE LOS ATRIBUTOS
    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsNoCtrl() {
        return sNoCtrl;
    }

    public void setsNoCtrl(String sNoCtrl) {
        this.sNoCtrl = sNoCtrl;
    }

    public int getiCarr() {
        return iCarr;
    }

    public void setiCarr(int iCarr) {
        this.iCarr = iCarr;
    }
   
}
