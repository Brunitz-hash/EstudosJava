/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

/**
 *
 * @author bruno
 */
public class exercicioFundamentos01 {
    public static void main(String[] args){
        int[] inteiros = new int[3];
        double[] decimais = new double[5];
        String[] palavra = new String[8];
        
        inteiros[0] = 5;
        inteiros[1] = 10;
        inteiros[2] = 45;
        
        decimais[0] = 1.5;
        decimais[1] = 5.5;
        decimais[2] = 7.5;
        decimais[3] = 9.5;
        decimais[4] = 1.5;
        
        palavra[0] = "Bruno";
        palavra[1] = "Gustavo";
        palavra[2] = "Larissa";
        palavra[3] = "Lucimare";
        palavra[4] = "Marcelo";
        palavra[5] = "Bruna";
        palavra[6] = "Luana";
        palavra[7] = "Aline";
        
        
        System.out.println("Primeiro indice do vetor inteiros: " + inteiros[0] + " ultimo indice do vetor inteiros: " + inteiros[2]);
        System.out.println("Primeiro indice do vetor decimais: " + decimais[0] + " ultimo indice do vetor decimais: " + decimais[4]);
        System.out.println("Primeiro indice do vetor palavra: " + palavra[0] + " ultimo indice do vetor palavra: " + palavra[7]);


    }
}
