/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletin2_4 {

    public static void main(String[] args) {
    int bill100=100;
    int bill20=20;
    int bill5=5;
    int moned=1;
    int cantidad;
    Scanner ler = new Scanner(System.in);
    System.out.println("Introduzca cantidad en euros");
    cantidad= ler.nextInt();
    
    int billetes100= cantidad/100;
    int sig1= cantidad%100;
    System.out.println("billetes de 100  "+billetes100);
    
    int billetes20= (sig1/20);
    int sig2= sig1%20;
    System.out.println("billetes de 20  "+billetes20);
    
    int billetes5= sig2/5;
    int sig3= sig2%5;
     System.out.println("Billetes de 5  "+billetes5);
     
     int monedas= sig3;
      System.out.println("Monedas de euro "+monedas);
    
    
    
    }
    
}
