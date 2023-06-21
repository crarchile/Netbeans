/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Carlos Alvarez
 */

/*
* Suma de dos números enteros
*/
package sumanumeros.sumanumeros;
import java.util.*;
public class SumaNumeros {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerol, numero2, resultado;
        System.out.print("Ingrese el primer número: ");
        numerol = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        resultado = sumar(numerol, numero2);
        
        //sumar es el método
        System.out.println("El resultado de la Suma es: " + resultado);
    }
    
    public static int sumar(int a, int b){
        int c;
        c = a + b;
        return c;
    }
}