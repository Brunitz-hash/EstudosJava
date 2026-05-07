/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviagens;

/**
 *
 * @author bruno
 */
public class Venda {
    private String cliente;
    private String formaPagamento;
    private PacoteViagem pacote;
    
    public Venda(String cliente, String formaPagamento, PacoteViagem pacote){
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }
    
    public Venda(){
        
    }
         
    public String getCliente() {
        return cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }
    
    public double converteDolarReal(double cotacaoDolar, double porcentagem, double taxas){
        return this.pacote.calculaTotalPacote(porcentagem, taxas)*cotacaoDolar;
    }
    
    public void exibirTotal(double valorDolar, double valorReal){
        System.out.printf(
                "Valor total do pacote em dolar: %.2f%nValor total do pacote em reais: %.2f%n",
                valorDolar,
                valorReal);
    }
}
