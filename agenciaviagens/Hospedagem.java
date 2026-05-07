/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviagens;

/**
 *
 * @author bruno
 */
public class Hospedagem {
    private String descricao;
    private double diaria;
    
    
    public Hospedagem(String descricao, double diaria){
        this.descricao = descricao;
        this.diaria = diaria;
    }
    
    public Hospedagem(){
        
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public double getDiaria(){
        return diaria;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setDiaria(double diaria){
        this.diaria = diaria;
    }
}
