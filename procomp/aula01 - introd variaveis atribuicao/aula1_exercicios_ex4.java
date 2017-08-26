/*

4) Crie um algoritmo que leia 3 números que representem uma data, respectivamente 
dia, mês e ano. Depois imprima a data usando o formato dia/mês/ano.

*/


import javax.swing.*;

public class aula1_exercicios_exe4{

   public static void main(String[] args){
   
      int dia, mes, ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
      
      mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes: "));
      
      ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
      
      JOptionPane.showMessageDialog(null, "A data digitada foi: " + dia + "/ " + mes + "/" + ano);
      
      System.exit(0);
   
   }


}
