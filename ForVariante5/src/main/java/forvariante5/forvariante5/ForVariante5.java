/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package forvariante5.forvariante5;

/**
 *
 * @author Carlos Alvarez
 * Notas del ejercicio:
 * A menudo, la variable que controla un bucle for solo es necesaria para dicho bucle. 
 * Cuando esto sucede, es posible declarar la variable dentro de la inicialización del for. 
 * Veamos un ejemplo:
 */
public class ForVariante5{
    public static void main(String args[]) {
        int suma=0;
        int fact=1;
        //Calcula el factorial de los números del 1 al 5
        for(int i=1;i<=5; i++){
            //Aquí entra la variable i que no se conocía antes
            suma += i ;
            fact *= i;
            
            System.out.println("La suma es: " +suma);
            System.out.println("El factorial es: " +fact);
        }
    }
}

/**
 *
 * 
 */