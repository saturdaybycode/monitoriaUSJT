/*

3) Crie um algoritmo que leia um n�mero inteiro e o eleve ao quadrado usando o m�todo 
double Math.pow(base, expoente), onde base e expoente s�o n�meros reais.

*/


import javax.swing.*;

public class aula2_exercicios_ex3{

   public static void main(String[] args){
   
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      
      JOptionPane.showMessageDialog(null, "O n�mero " + numero + " elevado ao quadrado �: " + Math.pow(numero,2)); 
   
      System.exit(0);
   
   }

}