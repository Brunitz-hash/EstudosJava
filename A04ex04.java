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
public class A04ex04 {
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        System.out.println("Qual cidade voce gostaria de morar ?");
        String cidade = r.nextLine().toLowerCase();
        
        if (cidade.matches(".*florianopolis.*")) {
            System.out.println("Eu adoro Florianopolis");
        } else if (cidade.matches(".*paris.*")) {
            System.out.println("Eu adoro Paris");
        } else if (cidade.matches(".*roma.*")) {
            System.out.println("Eu adoro Roma");
        } else {
            System.out.println("Nao gosto tanto dessa cidade.");
        }
        
        
        System.out.println("Qual sua banda favorita ?");
        String banda = r.nextLine().toLowerCase();
        
        if (banda.matches(".*led zeppelin.*")) {
            System.out.println("Led Zeppelin e incrivel!");
        } else if (banda.matches(".*red hot chili peppers.*")) {
            System.out.println("RHCP e iradissimo!");
        } else if (banda.matches(".*pink floyd.*")) {
            System.out.println("Pink Floyd e um classico do rock!");
        } else {
            System.out.println("Nao conheco essa banda!");
        }
        
        
        System.out.println("Quais jogos voce joga ?");
        String jogos = r.nextLine().toLowerCase();
        
        if (jogos.matches(".*dota 2.*")) {
            System.out.println("Dota 2 e viciante!");
        } else if (jogos.matches(".*cs 2.*")) {
            System.out.println("Prefiria o CS:GO!");
        } else if (jogos.matches(".*dayz.*")) {
            System.out.println("Morri cheio de loot!");
        } else {
            System.out.println("Nao jogo esse, mas legal!");
        }
    }
}
