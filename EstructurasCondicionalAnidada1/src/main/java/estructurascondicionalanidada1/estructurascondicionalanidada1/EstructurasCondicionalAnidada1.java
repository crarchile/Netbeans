/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructurascondicionalanidada1.estructurascondicionalanidada1;

import java.util.Scanner;
class EstructurasCondicionalAnidada1 {
    
    public static void main(String arg[]){
        int nota1,nota2,nota3;
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextInt();
        
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextInt();
        
        float promedio = 1.0f*(nota1+nota2+nota3)/3;
        if (promedio>=7) {
            System.out.println("Aprobado");
        }else{ 
              if (promedio>=4) {
              System.out.println("Diciembre");
        }else{
              System.out.println("Reprobado");
        }
        }
    }
}
