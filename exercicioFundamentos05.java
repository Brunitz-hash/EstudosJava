
package ifsp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class exercicioFundamentos05 {
    public static void main(String[] args){
        
        
        Scanner r = new Scanner(System.in);
        int carrinho = 0;
        double carrinhoValor = 0;
        int verifica = 0;
        boolean encerrar = false;
        boolean encontrado = false;
        ArrayList<String> produtos = new ArrayList<>();
        
        produtos.add("Racao");
        produtos.add("Areia");
        produtos.add("Coleira");
        produtos.add("Vacina");
        produtos.add("Sache");
        produtos.add("Remedio");
        produtos.add("Perfume");
        produtos.add("Shampoo");
        produtos.add("Lacinho");
        produtos.add("Tapetinho");
        
        ArrayList<Double> precos = new ArrayList<>();
        
        precos.add(120.00);
        precos.add(25.00);
        precos.add(30.00);  
        precos.add(45.00);  
        precos.add(5.99);   
        precos.add(136.00);   
        precos.add(69.90);   
        precos.add(49.90);   
        precos.add(2.90);   
        precos.add(15.00);   
        
       
        while(!encerrar){
            
            System.out.println();
            
            encontrado = false;
            
            System.out.println("Digite o produto: ");
            String produto = r.nextLine();
            
            System.out.println("Digite a quantidade: ");
            int quant = r.nextInt();
            
            System.out.println();
            
            for(int i = 0; i < produtos.size(); i++){
                if(produtos.get(i).equalsIgnoreCase(produto)){
                    System.out.println("Nome do produto: " + produtos.get(i) + "\n" + "Quantidade: " + quant +"\n"+ "Valor unitario: " 
                        + precos.get(i) + "\n" + "Valor total: " + (quant*precos.get(i)));
                
                    carrinhoValor += (quant*precos.get(i));
                    carrinho += quant;
                    
                    System.out.println();
                    
                    System.out.println("Total: "+carrinhoValor);
                    System.out.println("Quantidade de itens: "+carrinho);
                    
                    encontrado = true;
                    break;
                }
            }
            
            if(!encontrado){
                System.out.println("Produto nao encontrado!");
            }
            
            System.out.println();
            
            r.nextLine();
            
            System.out.println("Digite o digito referente a sua compra: \n1 para continuar a adicionar itens\n2 para encerrar a compra e seguir para o pagamento \n3 para cancelar a compra"  );
            verifica = r.nextInt();
            
            r.nextLine();
            
            System.out.println();
            
            if(verifica == 2){
                System.out.println("Redirecionando para o pagamento...");
                encerrar = true;
            } else if (verifica == 3){
                System.out.println("Encerrando o programa ");
                carrinho = 0;
                carrinhoValor = 0;
                break;
            } 
        }
            System.out.println("Total: "+carrinhoValor);
            System.out.println("Total de itens: "+carrinho);
    } 
}
