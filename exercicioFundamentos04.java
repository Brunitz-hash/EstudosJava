/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

import java.util.Arrays;


/**
 *
 * @author bruno
 */
public class exercicioFundamentos04 {
    public static void main(String[] args){
        String[] a = {"Sao Joao del Rei", "Santa Cruz de Minas", "Tiradentes", "Barbacena", "Resende Costa"};
        
        for(int i = 0; i < a.length; i++){
            System.out.println("Cidades da regiao: " + a[i]);
        }
        
        System.out.println();
        
        String[] b = Arrays.copyOf(a, 5); 
        if(Arrays.equals(a,b) == true){
            System.out.println("Os vetores sao iguais");
        } else {
            System.out.println("Os vetores sao diferentes");
        }
        
        System.out.println();
        
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println("Cidades da regiao: " + a[i]);
        }
        
        System.out.println();
        
        String[] sub = Arrays.copyOfRange(a, 1, 5);
        
        for(int i = 0; i < sub.length; i++){
            System.out.println("Cidades da regiao: " + sub[i]);
        }
        
    }
    
}
