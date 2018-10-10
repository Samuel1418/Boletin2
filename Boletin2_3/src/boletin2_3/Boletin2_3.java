/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletin2_3 {

    public static void main(String[] args) {
    int bill100;
    int bill20;
    int bill5;
    int moned;
    Scanner ler = new Scanner(System.in);
    System.out.println("Introduzca cantidad en euros");
       System.out.println("Billetes de 100");
    bill100= ler.nextInt();
       System.out.println("Billetes de20");
    bill20= ler.nextInt();
       System.out.println("Billetes de 5");
    bill5= ler.nextInt();
       System.out.println("Monedas de euro");
    moned= ler.nextInt();
     System.out.println("Euros en total"+(bill100*100+bill20*20+bill5*5+moned));
    
    
    }
    
}
