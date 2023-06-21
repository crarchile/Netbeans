/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructurassimples1.estructurassimples1;

/**
 *
 * @author iview
 */

// Importamos la clase Scanner
import java.util.Scanner;

public class EstructurasSimples1 {

    public static void main(String[] args) {

        // Declaramos las variables enteras
         int num1,num2;

        // Se declara e inicializa una instancia de la clase Scanner
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        num1=entrada.nextInt();
        
        System.out.println("Ingrese el segundo número entero:");
        num2=entrada.nextInt();
        
        int suma = num1+num2;
        int producto = num1*num2;
        
        System.out.println("La suma de los dos números enteros es: "+suma);
        System.out.println("Y el producto de los dos valores es: "+producto);
    }
}
