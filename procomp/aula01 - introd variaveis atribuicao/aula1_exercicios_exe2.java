/*

2) Crie um algoritmo que leia um n�mero inteiro, armazene-o em uma vari�vel do tipo int e depois escreva
 na tela: �O valor do n�mero digitado �: � e o valor do n�mero.

*/

import javax.swing.*;

public class aula1_exercicios_exe2{

   public static void main(String args[]){
   
      int valor;
   
      valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
      
      JOptionPane.showMessageDialog(null, "O valor do n�mero digitado �: " + valor);
      
      System.exit(0);
   }


}