/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Bruno Vinicius Silva
 */
public class A04ex02 {
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        String operacao;
        
        System.out.printf("Operacoes que o programa realiza:\n" + " \n" + "soma\n" + "subtracao\n" + "multiplicacao\n" + "divisao\n" + "resto da divisao\n" + "potencia\n" + " \n" );
        
        System.out.println("Digite a operacao que deseja realizar: ");
        operacao = r.nextLine();
        
        System.out.println("Digite o primeiro valor para a operacao: ");
        float valor1 = r.nextFloat();
        
        System.out.println("Digite o segundo valor para a operacao: ");
        float valor2 = r.nextFloat();
        
        if(operacao.equals("soma")){
            float soma = (float)(valor1+valor2);
            System.out.println("Soma: "+df.format(soma));
            
        }else if(operacao.equals("subtracao")){
            float subtracao = (float) (valor1-valor2);
            System.out.println("Subtracao: "+df.format(subtracao));
            
        }else if(operacao.equals("multiplicacao")){
            float multiplicacao = (float) (valor1*valor2);
            System.out.println("Multiplicacao: "+df.format(multiplicacao));

        }else if(operacao.equals("divisao")){
            float divisao = (float) (valor1/valor2);
            System.out.println("Divisao: "+df.format(divisao));
        
        }else if(operacao.equals("resto da divisao")){
            float resto = (float) (valor1%valor2);
            System.out.println("Resto: "+df.format(resto));

        }else if(operacao.equals("potencia")){
            float potencia = (float) Math.pow(valor1,valor2);
            System.out.println("Potencia: "+df.format(potencia));

        }else{
            System.out.println("Nao e possivel realizar essa operacao");
        }
    } 
}

