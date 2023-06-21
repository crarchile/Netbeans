package estructuraforeach.estructuraforeach;

/**
 *
 * @author Carlos Alvarez
 */
public class EstructuraForEach {
    public static void main(String args[]) {
        
       // forma usada en Java5
       String [] miString = {"1", "2", "3", "4","5"};
       for(String elemento : miString) {
            System.out.println("Posición #"+elemento);
        }
    }
}

