/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

//Bruno Vinicius Silva
//Nao quis usar variaveis para armazenar o casting e os valores, para exercitar a escrita do casting manualmente em cada println
public class A02t03 {
    public static void main (String[] args){
        System.out.println("O resto da divisao entre esses valores:" +(Float.parseFloat(args[0])%Integer.parseInt(args[1])));
        System.out.println("O produto entre esses valores e:" +(Integer.parseInt(args[0])*Integer.parseInt(args[1])));
        System.out.println("A media entre esses valores e:" +((Float.parseFloat(args[0])+Float.parseFloat(args[1]))/2));
    
    }
}
