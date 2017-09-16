/*

3) Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o método 
double Math.pow(base, expoente), onde base e expoente são números reais.

*/


import javax.swing.*;

public class aula2_exercicios_ex3{

   public static void main(String[] args){
   
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      
      JOptionPane.showMessageDialog(null, "O número " + numero + " elevado ao quadrado é: " + Math.pow(numero,2)); 
   
      System.exit(0);
   
   }

}