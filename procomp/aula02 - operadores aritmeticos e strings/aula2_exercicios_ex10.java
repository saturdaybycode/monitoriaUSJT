/*

10) Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três frases,
 separe cada uma delas ao meio. Então junte nesta ordem: primeira metade da segunda,
  segunda metade da terceira, segunda metade da segunda, primeira metade da primeira,
   primeira metade da terceira, segunda metade da primeira. Concatene então as três 
   frases originais e imprima o resultado. Na linha de baixo, escreva a frase embaralhada 
   e compare o resultado.

*/


import javax.swing.*;

public class aula2_exercicios_ex10{

   public static void main(String[] args){
   
      String fraseA, fraseB, fraseC;
   
      fraseA = JOptionPane.showInputDialog("Informe a frase A:");
      
      fraseB = JOptionPane.showInputDialog("Informe a frase B:"); 
      
      fraseC = JOptionPane.showInputDialog("Informe a frase C:");
      
      JOptionPane.showMessageDialog(
                                    "Frase A: " + fraseA
                                  + "Frase B: " + fraseB
                                  + "Frase C: " + fraseC
                                  + "[1] " +      
      );        
   
   }

}