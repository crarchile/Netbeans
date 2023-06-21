package welcome.welcome;

 /**
 * Este programa muestra un saludo al lector.
 * @version 1.0 21-06-2023
 * @author Carlos Alvarez
 */
 public class Welcome {
    public static void main(String[] args){
        
        String saludo = "Bienvenidos a Java!";
        
        // Muestro un doble subrayado superior
        for (int i = 0; i < saludo.length(); i++)
            System.out.print("=");
            System.out.println();
        
        // Muestro el Saludo
            System.out.println(saludo);
        
        // Muestro un doble subrayado inferior
        for (int i = 0; i < saludo.length(); i++)
            System.out.print("=");
            System.out.println();
    }
}
