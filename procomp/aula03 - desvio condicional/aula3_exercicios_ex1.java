/*
1) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
 caso o resultado seja maior que 10, apresentá-lo.

*/

import javax.swing.*;

public class exe1{

   public static void main(String[] args){
   
      int a, b, soma;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Informe a:"));
      
      b = Integer.parseInt(JOptionPane.showInputDialog("Informe b:"));
   
      soma = a + b;
      
      if(soma > 10){
      
         JOptionPane.showMessageDialog(null, "Soma de " + a + " e " + b + " = " + soma);
      
      }else{
      
         System.out.println("Valor <= a 10 >>> " + soma);
      }
      
      System.exit(0);
   }

}