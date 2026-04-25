/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

import java.util.Scanner;

/**
 *
 * @author Bruno Vinicius Silva
 */
public class A04ex01 {
    public static void main (String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial da contagem: ");
        int inicio = r.nextInt();

        System.out.println("Digite o valor final da contagem: ");
        int fim = r.nextInt();
        
        for (int i = inicio; i <= fim ; i++) {
            System.out.println("Contando: "+i);
        } 
    }
}
