/*

2) Crie um algoritmo para calcular a �rea de um ret�ngulo, com base nas medidas de sua base e de sua altura.

*/

import javax.swing.*;

public class aula2_exercicios_ex2{

   public static void main(String[] args){
   
      double area, base, altura;
      
      altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
      
      base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
      
      area = altura * base;
      
      JOptionPane.showMessageDialog(null, "�rea : " + area);
      
      System.exit(0);
   
   }

}