package forvariante2.forvariante2;

/**
 *
 * @author Carlos Alvarez
 */

/* 
# Piezas Faltantes: #
Algunas de las variaciones de for se recrean al dejar vacías las piezas
de la definición del bucle. En Java es posible que cualquiera o todas las
inicializaciones, condiciones o partes de iteración del bucle for estén en
blanco. Veamos un ejemplo:
*/

public class ForVariante2{
    public static void main(String args[]) {
        int i;
        for(i=0; i<10;){ //Falta la expresión de iteración
            System.out.println("Paso #: "+ i) ;
            i++; // Incrementa la variable de control de bucle
        }
    }
}

/*
Aunque la expresión iteradora se encuentra vacía, dentro del cuerpo
del bucle la variable de control aumenta. Esto significa que el bucle se
repite y va a comprobar que sea menor que 10.
*/
