/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550420_examen1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {
final static int PIN = 1234;
final static double SaldoInicial = 5000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner capt = new Scanner (System.in);
        int Pin, Accion;
        double SaldoActual=SaldoInicial, Monto, SaldoFinal;
        System.out.println("Ingrece el Pin");
        Pin=capt.nextInt();
        if(Pin==PIN){
            System.out.println("Seleccione la ccion que decea realizar(1-2-3)");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Retirar dinero");
            System.out.println("3.Depositar dinero");
            Accion=capt.nextInt();
            if(Accion==1){
                System.out.print("Su saldo actual es de ");
                System.out.print(SaldoActual);
            }
            else if(Accion==2){
                System.out.println("Cual es el monto a retirar");
                Monto=capt.nextDouble();
                SaldoFinal=SaldoActual-Monto;
                if(Monto<=SaldoActual){
                System.out.print("Su saldo actual es de ");
                System.out.print(SaldoFinal);}
                else{
                System.out.println("No se puede retirar esa cantidad");}
            }
            else if(Accion==3){
                System.out.println("Cual es el monto a depositar");
                Monto=capt.nextDouble();
                SaldoFinal=SaldoActual+Monto;
                if(Monto>0){
                System.out.print("Su saldo actual es de ");
                System.out.print(SaldoFinal);}
                else{
                System.out.println("ERROR");}
            }
            }else{
            System.out.println("Acceso Denegado");
    }
    
}}
