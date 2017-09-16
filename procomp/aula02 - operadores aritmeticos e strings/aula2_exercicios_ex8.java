/*

8) Entrar com um numero e imprimir o logaritmo desse numero na base 10.

*/

import javax.swing.*;

public class aula2_exercicios_ex8{

   public static void main(String[] args){
   
      int num;
      
      num = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
      
      System.out.println("Logaritmo na base 10: " + Math.log(num) / Math.log(10));
      
      System.exit(0);
   
   }

}