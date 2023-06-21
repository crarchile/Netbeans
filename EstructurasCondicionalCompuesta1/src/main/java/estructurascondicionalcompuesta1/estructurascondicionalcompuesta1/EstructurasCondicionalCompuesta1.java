/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructurascondicionalcompuesta1.estructurascondicionalcompuesta1;

import java.util.Scanner;
class EstructurasCondicionalCompuesta1 {
    
    public static void main(String arg[]){
        int numl, num2;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        numl = entrada.nextInt();
        
        System.out.println("Ingrese el segundo valor: ");
        num2 = entrada.nextInt();
        
        if (numl>num2){
            System.out.println(numl +" es el mayor");
        }else{
            System.out.println(num2 +" es el mayor");
        }
    }
}
