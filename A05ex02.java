package ifsp;

//* Bruno Vinicius Silva

import java.util.Scanner;

public class A05ex02 {
    public static void main(String[] args){
        
       int[][] matriz = new int[8][8];
       
       for( int i = 0; i < matriz.length; i++){
           for( int j = 0; j < matriz[i].length; j++){
               matriz[i][j] = 5;
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println();
       }
    
        Scanner r = new Scanner(System.in);
        System.out.println("Digite um inteiro para substituir as posicoes pares da matriz: ");
    
        int substituto = r.nextInt();
        
        for( int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz.length; j++){
                if((i+j)%2 == 0){
                    matriz[i][j] += substituto;
                } else {
                    matriz[i][j] -= substituto;
                }
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}