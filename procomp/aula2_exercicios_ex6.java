/*

6) Entrar com um numero inteiro de 3 casas decimais e imprimir o algarismo da casa das dezenas.

*/

import javax.swing.*;

public class aula2_exercicios_ex6{

   public static void main(String[] args){
   
      double numero;
      
      numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
      
      String txt = String.valueOf(numero); 
      
      System.out.println(txt.substring(txt.length() - 3, txt.length()));
   
      System.exit(0);
   }

}