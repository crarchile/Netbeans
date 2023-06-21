
package forvariante6.forvariante6;

/*
 *
 * @author Carlos Alvarez
 * Notas del Ejercicio:
 * Uso de Break para salir del bucle
 * Si empleamos la instrucción break, podemos forzar la salida inmediata
 * de un bucle omitiendo cualquier código en su cuerpo, así como la
* prueba de condición del bucle. Esto terminará el bucle, y el control
* del programa se reanudará en la instrucción siguiente a él. Veamos un
* ejemplo:
*/

public class ForVariante6 {
    public static void main(String args []) {
        int num= 100;
        //Recorre el bucle si i*i es menor que num
        for(int i=0;i<num; i++){
            if(i*i>=num) break;
            //termina el bucle si i*i >=100
            System.out.println(i+" ");
        }
        System.out.println("bucle completo.");
    }
}

// Una vez que ejecutemos este programa veremos que se generará la siguiente salida:
// 0 1 2 3 4 5 6 7 8 9 bucle completo