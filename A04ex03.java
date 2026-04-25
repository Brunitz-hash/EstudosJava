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
public class A04ex03 {
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.println("Digite o texto:");
        String texto = r.nextLine();
        
        String resultado = "";

        
        for (int i = 0; i < texto.length(); i++) {
            String letra = String.valueOf(texto.charAt(i));
            
            if(!letra.matches("[aeiouAEIOU]")){
                resultado += letra;
    
            }
        }
        
        System.out.println("Texto sem vogais: "+resultado);
    }
}
