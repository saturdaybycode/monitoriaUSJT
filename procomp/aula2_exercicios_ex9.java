/*

9) Entrar com um numero e a base em que se deseja calcular o logaritmo do numero, 

calcular tal logaritmo e imprimir o resultado.

*/

import javax.swing.*;

public class aula2_exercicios_ex9{

   public static void main(String[] args){
   
      int num, base;
      
      num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero:"));
      
      base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base:"));
      
      JOptionPane.showMessageDialog(null, "Logaritmo na base " + base + " : " + Math.log(num) / Math.log(base));
      
      System.exit(0);
   
   }

}