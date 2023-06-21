/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructurascondicionalcompuesta2.estructurascondicionalcompuesta2;

import java.util.Scanner;
class EstructurasCondicionalCompuesta2 {
    public static void main(String arg[]){
        int num;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un valor entre 60 y 120: ");
        num = entrada.nextInt();
        if (num > 100){
            System.out.println("El número ingresado ("+num+") es mayor que 100");
        }else if(num>=70){
            System.out.println("El número ingresado ("+num+") es mayor o es igual que 70");
        }else{
            System.out.println("El número ingresado ("+num+") es menor que 70");
        }
        }
    }
