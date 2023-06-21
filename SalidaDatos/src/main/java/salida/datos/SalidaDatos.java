
package salida.datos;

/**
 *
 * @author iview
 */
public class SalidaDatos {
    public static void main(String[] args) {
        int precio=100;
        final double IVA=0.21;
        System.out.println("Información del producto");
        System.out.println("El precio del producto es "+precio);
        System.out.println("El precio del producto, incluyendo el IVA, es " + (precio+(precio*IVA)));
    
    }
}
