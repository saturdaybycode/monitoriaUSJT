
/*

2) Construir um algoritmo que leia dois n�meros e efetue a adi��o. Caso o valor somado seja menor ou igual a 20,
 este dever� ser apresentado subtraindo-se 5.

*/

import javax.swing.*;

public class exe2{

   public static void main(String[] args){
   
      int a, b, soma;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Informe a:"));
      
      b = Integer.parseInt(JOptionPane.showInputDialog("Informe b:"));
   
      soma = a + b;
      
      if(soma <= 20){
      
         JOptionPane.showMessageDialog(null, "Soma de " + a + " e " + b + " = " + (soma - 5));
      
      }else{
      
         System.out.println("soma > 20 >>> " + soma);
      }
      
      System.exit(0);
   
   }

}