/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Carlos Alvarez
 */

package estructurasseleccionmultiple.estructurasseleccionmultiple;

import java.util.Scanner;

class EstructurasSeleccionMultiple {
    public static void main(String arg[]){
        String dia="Lunes";
        System.out.println("Ingrese un dia de la semana: ");
        
        // Leo las pulsaciones del teclado y las meto en la variable dia
        // Utilizo el parámetro charsetName "Windows-1252" para poder leer letras con tildes.
        
        Scanner leerTeclado=new Scanner(System.in, "Windows-1252");
        dia=leerTeclado.nextLine();
        
        switch (dia){
            case "Lunes":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Martes":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Miércoles":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Jueves":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Viernes":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Sábado":
                System.out.println("El día ingresado fue: "+dia);
                break;
            case "Domingo":
                System.out.println("El día ingresado fue: "+dia);
                break;
            default:
                System.out.println("No ha ingresado un dato correcto.");
        }
    }
}
