/*
4) Crie um algoritmo que leia um número inteiro e calcule a sua raiz quadrada.
*/

import javax.swing.*;

public class aula2_dojo_ex4{

   public static void main(String[] args){
   
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um num: "));
      
      JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(numero));
      
      System.exit(0);
   
   }

}