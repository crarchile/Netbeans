/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package forvariante4.forvariante4;

/**
 *
 * @author Carlos Alvarez
 * El cuerpo asociado a un bucle puede estar vacío, esto se debe a que una instrucción null es 
 * sintácticamente válida. Veamos un ejemplo:
 */

public class ForVariante4 {

    public static void main(String[] args) {
        int i;
        int suma=0;
        for(i=1;i<=5;suma+=i++) { 
            
            // No hay cuerpo en este bucle
            
            System.out.println("La suma es: "+suma);
        }
    }
}
