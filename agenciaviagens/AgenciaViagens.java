package agenciaviagens;

import java.util.Scanner;

public class AgenciaViagens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PacoteViagem pacote = new PacoteViagem();
        Transporte transporte = new Transporte();
        Venda venda = new Venda();
        Hospedagem hospedagem = new Hospedagem();
        double margem;
        double taxas;
        double cotacaoDolar;
        String operacao;
        
        
        do{
            System.out.println("Digite o comando a ser realizado pelo programa: [C]riar pacote, [V]enda, [E]ncerrar ");
            operacao = entrada.nextLine();
            
            
            switch(operacao){
                case "C":
                    
                    System.out.println("Digite o destino: ");
                    pacote.setDestino(entrada.nextLine());
        

                    System.out.println("Digite a modalidade do transporte: ");
                    transporte.setModalidade(entrada.nextLine());


                    System.out.println("Digite o valor do transporte: ");
                    transporte.setValor(entrada.nextDouble());

                    entrada.nextLine();

                    System.out.println("Digite a descricao da hospedagem: ");
                    hospedagem.setDescricao(entrada.nextLine());


                    System.out.println("Digite o valor da diaria: ");
                    hospedagem.setDiaria(entrada.nextDouble());

                    entrada.nextLine();

                    System.out.println("Digite quantos dias de hospedagem: ");
                    pacote.setDias(entrada.nextInt());

                    entrada.nextLine();

                    System.out.println("Digite a margem de lucro(porcentagem): ");
                    margem = entrada.nextDouble();

                    entrada.nextLine();

                    System.out.println("Digite as taxas sobre o pacote: ");
                    taxas = entrada.nextDouble();

                    entrada.nextLine();
                    
                    pacote.setTransporte(transporte);
                    pacote.setHospedagem(hospedagem);
                    
                    System.out.println();

                    System.out.println("Destino do pacote: " +pacote.getDestino() 
                            +"\nModalidade de transporte: " +pacote.getTransporte().getModalidade()
                            +"\nValor do transporte: " +pacote.getTransporte().getValor()
                            +"\nHospedagem: " +pacote.getHospedagem().getDescricao()
                            +"\nValor da diaria: " +pacote.getHospedagem().getDiaria()
                            +"\nQuantidade de dias: " +pacote.getDias()
                            +"\nValor total do pacote em dolar: " +pacote.calculaTotalPacote(margem,taxas));
                    System.out.println();
                    break;
                    
                case "V":
                    
                    System.out.println("Digite a margem de lucro: ");
                    margem = entrada.nextDouble();

                    entrada.nextLine();

                    System.out.println("Digite as taxas sobre o pacote: ");
                    taxas = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    System.out.println("Digite a cotacao do dolar atualizada: ");
                    cotacaoDolar = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    System.out.println("Digite o nome do cliente: ");
                    venda.setCliente(entrada.nextLine());
                    
                    
                    System.out.println("Digite a forma de pagamento: ");
                    venda.setFormaPagamento(entrada.nextLine());
                    
                    venda.setPacote(pacote);
                    
                    System.out.println();
                    
                    System.out.println("Cliente referente a venda: "+venda.getCliente()
                            +"\nForma de pagamento: "+venda.getFormaPagamento());
                    
                    venda.exibirTotal(venda.getPacote().calculaTotalPacote(margem, taxas), venda.converteDolarReal(cotacaoDolar, margem, taxas));
                    
                    System.out.println();
                    break;
                    
                case "E":
                    System.out.println("Encerrando o programa!");
                    break;
                    
                default:
                    System.out.println("Comando invalido!");
                    break;
            }
                
            
        }while(!operacao.equals("E"));     
    }
    
}
