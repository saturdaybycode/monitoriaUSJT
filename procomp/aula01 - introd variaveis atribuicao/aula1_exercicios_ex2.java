/*

2) Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do tipo int e depois escreva
 na tela: “O valor do número digitado é: ” e o valor do número.

*/

import javax.swing.*;

public class aula1_exercicios_exe2{

   public static void main(String args[]){
   
      int valor;
   
      valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
      
      JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + valor);
      
      System.exit(0);
   }


}
