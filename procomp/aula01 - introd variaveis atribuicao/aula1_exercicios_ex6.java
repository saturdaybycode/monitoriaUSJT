/*

6) Ler dez caracteres e imprimir a palavra formada por eles.

*/

import javax.swing.*;

public class aula1_exercicios_ex6{

   public static void main(String[] args){
   
      char caracter1, caracter2, caracter3, caracter4;
      
      caracter1 = (JOptionPane.showInputDialog("Digite o caracter 1: ")).charAt(0);
      
      caracter2 = (JOptionPane.showInputDialog("Digite o caracter 2: ")).charAt(0);
      
      caracter3 = (JOptionPane.showInputDialog("Digite o caracter 3: ")).charAt(0);
      
      caracter4 = (JOptionPane.showInputDialog("Digite o caracter 4: ")).charAt(0);
      
      JOptionPane.showMessageDialog(null, "Palavra formada: " + caracter1 + caracter2 + caracter3 + caracter4);
      
      System.exit(0);
   
   }

}