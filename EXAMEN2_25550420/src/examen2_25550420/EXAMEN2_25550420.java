/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_25550420;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN2_25550420 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner capt = new Scanner (System.in);
        int opcion,num,num2;
        String texto="*";
        boolean primo=true, continuar;
        System.out.println("Elige un numero entero");
        num=capt.nextInt();
        System.out.println("deceas imprimir los numeros primos o no primos?(1(primo)/2(no primo))");
        opcion=capt.nextInt();
        do{
        if(opcion==1){
            for (int i=2; i<num; i++) {
             if (num%i==0) {
             num2=num;
            for (int j = 2; j%num2==0; j++) {
            for (int k = 1; k <= j; k--) {
            System.out.print(texto);
        }
            System.out.println();
        }}
            }
            break;
        }
        else if(opcion==2){
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j--) {
            System.out.print(texto);
        }
            System.out.println();
        }
         break;
           
        }while(continuar != false);
    }
}
