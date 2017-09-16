/*

4) Crie um algoritmo que leia três strings por meio do JOptionPane e escreva a soma do comprimento destas strings.

*/

import javax.swing.*;

public class aula2_exercicios_ex4{

   public static void main(String[] args){
   
      String txtA, txtB, txtC, saida;
      
      txtA = JOptionPane.showInputDialog("Digite txtA: ");
      
      txtB = JOptionPane.showInputDialog("Digite txtB: ");
      
      txtC = JOptionPane.showInputDialog("Digite txtC: ");
      
      saida = "Textos digitados:\n"
             + "\n" + txtA + " Tamanho: " + txtA.length()
             + "\n" + txtB + " Tamanho: " + txtB.length()
             + "\n" + txtC + " Tamanho: " + txtC.length();
             
      JOptionPane.showMessageDialog(null, saida); 
      
      System.exit(0);      
   
   }

}