/*

1) Crie um algoritmo para calcular o número de dias aproximado que você viveu, com base em sua idade.

*/

import javax.swing.*;

public class aula2_exercicios_ex1{

   public static void main(String[] args){
   
      int idade;
      
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
      
      JOptionPane.showMessageDialog(null, " Dias (Aproximado): " + (idade * 365));
      
      System.exit(0);
   
   }   

}