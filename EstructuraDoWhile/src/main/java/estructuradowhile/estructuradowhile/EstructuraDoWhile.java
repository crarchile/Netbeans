/* Programa que pide un número entero, entre 1 y 10 y valida su ingreso
* Si el dato ingresado no es un número entero no lo acepta y lo vuelve a pedir
* Si el usuario ingresa letras tampoco las acepta y vuelve a pedir un número
* El número debe estar en el rango entre 1 a 10
* Autor: Carlos Alvarez
 */

package estructuradowhile.estructuradowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EstructuraDoWhile {

    public static void main(String[] args){
    int num;

    do{
        System.out.println("introduce un numero entre 1 y 10: ");
        num = leerInt(); //leeInt(); 
    }while(num>10||num<1);
        
    System.out.println("El número ingresado es: "+num);
    
    } // cierra la clase main
    
  
    public static int leerInt() {

        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

        Integer x = 0;/*instancia de Integer a la que asignamos 
                     el valor 0 para inicializarla.*/
        do{
            try {           
                x = Integer.valueOf(teclado.readLine());
                /*si consigue asignar a x el valor leido por 
                  teclado entonces con break paramos el    
                  do-while y devolvemos x, sino 
                  continuamos al catch.*/  
                                                            
                 break;
                
            }catch (NumberFormatException | IOException e) {
                /*sino lo consigue entra aqui y mostramos el 
                  mensaje.*/
                System.out.println("debes introducir un numero entero");
            }
            /*como x desde el principio vale 0 es por tanto una 
              instancia de Integer, entonces repetimos el bucle, 
              así, hasta que Integer.valueOf() consiga asignar
              un valor nuevo a x diferente al inicial que era 0, 
              entonces con break se saldra del bucle*/

        }while(x instanceof Integer);
        
      
        return x;
    
    } // cierra la función leerInt()
    
} // cierra la clase EstructuraDoWhile