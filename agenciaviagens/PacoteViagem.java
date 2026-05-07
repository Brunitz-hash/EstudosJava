/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviagens;

/**
 *
 * @author bruno
 */
public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int dias;
    
    
    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias){
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }
    
    public PacoteViagem(){
        
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }
    
    public void setTransporte(Transporte transporte){
        this.transporte = transporte;
    }
    
    public void setHospedagem(Hospedagem hospedagem){
        this.hospedagem = hospedagem;
    }
    
    public void setDias(int dias){
        this.dias = dias;
    }
    
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    public double calculaHospedagem(){
        return(this.dias*this.hospedagem.getDiaria());
    }
    
    public double calculaLucro(double subtotal, double porcentagem){
        double lucro = ((subtotal/100)*porcentagem);
        return subtotal + lucro;
    }
    
    public double calculaTotalPacote(double porcentagem, double taxas){
        double valorHospedagem = calculaHospedagem();
        double valorTransporte = this.transporte.getValor();
        double subtotal = valorHospedagem + valorTransporte + taxas;
        double totalLucro = calculaLucro(subtotal, porcentagem);
        return totalLucro;
    }
}
