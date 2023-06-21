/*
 Notas del Ejercicio:
 Uso de break como goto
 La instrucción break puede emplearse por sí sola para proporcionar una
 forma actual de la instrucción goto. Java no cuenta con una instrucción
 goto porque esta proporciona una manera no estructurada de modificar
 el flujo de ejecución del programa. Los programas que llevan a cabo 
un uso extenso de goto suelen ser difíciles de comprender y de mantener. 
Sin embargo, existen ciertos lugares en los que goto resulta útil y legítimo, 
por ejemplo, puede ser útil al salir de conjuntos profundamente anidados de bucles.
Para manejar estas situaciones, Java define una forma expandida de
la instrucción break, la que nos permite salir de uno o más bloques de
código. No es necesario que estos bloques sean parte de un bloque o
un switch, puede tratarse de cualquier bloque.
Además, se puede especificar con precisión dónde se reanudará la
ejecución, pues esta forma de break funciona con una etiqueta.
La forma general de la instrucción break etiquetada se muestra a
continuación:
 */

package forvariante7.forvariante7;

/**
 *
 * @author Carlos Alvarez
 */

public class ForVariante7{
    public static void main(String args[]) {
        hecho:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++ ){
                for(int k=0;k<10;k++ ){
                    System.out.println(k+" ") ;
                    if(k==5) break hecho; //salta a hecho
                }
                System.out.println("Tras bucle k");//no se ejecuta
            }
            System.out.println("Tras bucle j");//no se ejecuta
        }
        System.out.println("Tras bucle i");
    }
}