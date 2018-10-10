/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletin2_5 {

    public static void main(String[] args) {
    
    double comision=0.05;
    double km=2;
    double dietas=30;
    double IRPF= 0.18;
    double seguridade=36;
    double soldo,vendas,gastos1,gastos2,gastos3,comidas,kilom;
    Scanner ler = new Scanner(System.in);
    
    System.out.println("introduzca saldo fixo");
    soldo= ler.nextDouble();
    
    System.out.println("introduzca valor vendas");
    vendas= ler.nextDouble();
    gastos1=(vendas*comision);
    System.out.println("comision por vendas"+gastos1);
    
    System.out.println("introduzca kilometros");
    kilom= ler.nextDouble();
    gastos2= (km*kilom);
    System.out.println("Gastos por kilometraxe"+gastos2);
    
    System.out.println("Introduzca dias que comió fuera");
    comidas= ler.nextDouble();
    gastos3=(comidas*30);
    System.out.println("Gastado en comidas"+gastos3);
    
    double sooldo=(soldo-(gastos1+gastos2+gastos3));
    System.out.println("Salario Bruto "+sooldo);
    
    
    System.out.println("Líquido "+(sooldo*IRPF-seguridade));
        
    }
    
}
