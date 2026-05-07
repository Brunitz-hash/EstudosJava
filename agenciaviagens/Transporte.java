/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviagens;

/**
 *
 * @author bruno
 */
public class Transporte {
    private String modalidade;
    private double valor;
    
    
    public Transporte(String modalidade, double valor){
        this.modalidade = modalidade;
        this.valor = valor;
    }
    
    public Transporte(){
        
    }
    
    public void setModalidade(String modalidade){
        this.modalidade = modalidade;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getModalidade(){
        return modalidade;
    }
    
    public double getValor(){
        return valor;
    }
}
