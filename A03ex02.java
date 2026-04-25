/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class A03ex02 {
    public static void main (String[] args){
        try{
            String valorA = JOptionPane.showInputDialog("Digite a altura da parede em metros: ");
            String valorL = JOptionPane.showInputDialog("Digite a largura da parede em metros: ");
            
            float altura  = Float.parseFloat(valorA);
            float largura = Float.parseFloat(valorL);
            
            JOptionPane.showMessageDialog(null,"Altura: " + altura + " Largura: " + largura,"Parede", JOptionPane.INFORMATION_MESSAGE);
            float calculo = ((altura*largura)*20);
            
            JOptionPane.showMessageDialog(null,
                    "A quantidade necessaria de tijolos para construir essa parede com " + altura  + "m" + " de altura e " + largura + "m" + " de largura e " + calculo + " tijolos",
                    "Bruno Vinicius Silva",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Houve um erro! Digite apenas numeros!");
            e.printStackTrace();
        }
    }
}
