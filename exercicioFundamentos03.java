/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

/**
 *
 * @author bruno
 */
public class exercicioFundamentos03 {
    public static void main(String[] args){
        String[][] alunoTimes = new String[5][2];
        alunoTimes[0][0] = "Bruno";
        alunoTimes[0][1] = "Galo";
        alunoTimes[1][0] = "Gustavo";
        alunoTimes[1][1] = "Flamengo";
        alunoTimes[2][0] = "Larissa";
        alunoTimes[2][1] = "Cruzeiro";
        alunoTimes[3][0] = "Marcelo";
        alunoTimes[3][1] = "Sao paulo";
        alunoTimes[4][0] = "Lucimare";
        alunoTimes[4][1] = "Santos";
        
        for(int i = 0; i < alunoTimes.length; i++){
            System.out.println("Aluno: " + alunoTimes[i][0] + " Time: " + alunoTimes[i][1]);
         }
     }
 }
