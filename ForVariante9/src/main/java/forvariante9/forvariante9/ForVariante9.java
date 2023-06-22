/**
*  Descripción del Programa: uso de bucle externo con for y continue
 * @author Carlos Alvarez
 * Fecha: 22-06-2023
 */

package forvariante9.forvariante9;


public class ForVariante9 {

    public static void main(String[] args) {
        // Bucle externo
        bucleexterno:
        for(int i=1;i<10;i++) {
            System.out.println("\nPaso de Bucle externo: " +i+" Bucle interno: ");
            
            // bucle interno
            for(int j=1;j<10;j++){
                if(j==6)continue bucleexterno; // continúa el bucle externo
                System.out.print(j+" - ");
            }
        }
    }   
}
