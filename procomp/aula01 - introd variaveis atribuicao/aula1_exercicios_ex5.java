/*

5) Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso informado foi “ + peso + “ kg.”.

*/

import javax.swing.*;

public class aula1_exercicios_ex5{


   public static void main(String[] args){
   
      double peso;
   
      peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
      
      JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + "kg.");
   
      System.exit(0);
   
   }

}