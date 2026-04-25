/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;
import java.util.Scanner;
/**
 *
 * @author bruno
 */
public class A03ex01 {
    public static void main (String[]  args){
        try{
            System.out.println("Digite a altura da parede em metros: ");
            
            Scanner al = new Scanner(System.in);
            float altura = al.nextFloat();
            
            System.out.println("Digite a largura da parede em metros: ");
            float largura = al.nextFloat();
            
            float calculo = ((altura*largura)*20);
            System.out.println("A quantidade de tijolos para construir essa parede com " + altura + "m de altura e " + largura + "m de largura e " + calculo);
         
        }catch(Exception e){
            System.out.println("Houve um erro! Digite somente numeros!");
            e.printStackTrace();
        } 
    } 
}
