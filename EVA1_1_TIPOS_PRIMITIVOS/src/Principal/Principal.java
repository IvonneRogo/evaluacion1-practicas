/*PRACTICA PARA DESCRIBIR LOS TIPOS DE DATOS PRIMITIVOS JAVA*/

package Principal;

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
        // TODO code application logic here
        String nom;
        int edad;
        double sal;
        Scanner captura = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        nom = captura.nextLine();
        System.out.println("¿Cuál es tu edad?");
        edad = captura.nextInt();
        System.out.println("¿Cuál es tu salario?");
        sal = captura.nextDouble();
        hacerAlgo(nom, edad, sal);
    }
    
    /**
     * Un método para imprimir los valores del usuario
     * @param nombre Nombre del usuario
     * @param edad   Edad del usuario
     * @param salario Salario del usuario
     */
    
    public static void hacerAlgo(String nombre, int edad, double salario){
        System.out.println(nombre + " " + edad + " " + salario);
    }
    
}
