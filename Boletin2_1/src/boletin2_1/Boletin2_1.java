/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletin2_1 {

    public static void main(String[] args) {
       double prezoTarifa;
       double PrezoPagado;
       Scanner ler = new Scanner(System.in);
       System.out.println("Introduzca los precios,primero el recio tarifa(Original) y luego el pagado");
       prezoTarifa= ler.nextDouble();
       PrezoPagado= ler.nextDouble();
       System.out.println((100-PrezoPagado/prezoTarifa*100)+"%");
        
        
    }
    
}
