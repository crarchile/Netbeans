/*
 * Nota acerca de este ejercicio:
#El uso de continue#
Es posible forzar una iteración temprana de un bucle omitiendo
la estructura de control normal del bucle. Esto se logra usando la
instrucción continue, la que impone la ejecución de la siguiente
iteración del bucle omitiendo cualquier código entre sí mismo y la
expresión condicional que controla el bucle. Por lo tanto, continue
es esencialmente el complemento de break. 
Por ejemplo, el siguiente programa usa continue como ayuda para imprimir 
los números pares entre el 0 y el 100
 */

package forvariante8.forvariante8;

/**
 * Programa ForVariante8
 * @author Carlos Alvarez
 */
public class ForVariante8{
    public static void main(String args[]) {
        int i ;
        //Imprime números pares entre 0 y 100
        for(i=0;i<=100; i++){
            if((i%2)!=0) continue; //itera
            System.out.print(i+" -- ");
        }
    }
}

/*
Solo se imprimen los números pares, porque uno no causaría que el
bucle se iterara antes, omitiendo la llamada a println() .
En los bucles while y do while, una instrucción continue hará que el
control vaya directamente a la expresión condicional y luego siga
el recorrido del bucle. En el caso de for, se evalúa la expresión de
iteración del bucle, luego se ejecuta la expresión condicional y, más
tarde, se sigue el bucle.
*/
