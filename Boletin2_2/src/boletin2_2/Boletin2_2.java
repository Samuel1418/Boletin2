/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double centigrados;
        double kelvin=273.15;
        double faren=32;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduzca grados centígrados");
        centigrados=ler.nextDouble();
        System.out.println("Kelvin "+(centigrados+kelvin)+"  Fahrenheit "+(centigrados*9/5)+faren);
        
           
        
        
    }
    
}
