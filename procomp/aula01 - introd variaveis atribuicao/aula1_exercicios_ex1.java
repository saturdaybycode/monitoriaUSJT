/*

1) Crie um algoritmo que leia tr�s palavras, separadamente, e as apresenta na tela
 na ordem contr�ria em que foram digitadas, separadas por espa�o.

*/

import javax.swing.*;

public class aula1_exercicios_ex1{

   public static void main(String[] args){
   
      //Declara��o das vari�veis   
      String palavra1, palavra2, palavra3, inverte;
      
      //Atribui o valor informado pelo usu�rio na vari�vel palavraX
      palavra1 = JOptionPane.showInputDialog("Digite a palavra 1: ");
      
      palavra2 = JOptionPane.showInputDialog("Digite a palavra 2: ");
       
      palavra3 = JOptionPane.showInputDialog("Digite a palavra 3: ");
      
      //Concatena na ordem inversa
      inverte = palavra3 + " " + palavra2 + " " + palavra1;
      
      //Exibe uma caixa de di�logo com o resultado da invers�o
      JOptionPane.showMessageDialog(null, "Exibindo a ordem inversa: " + inverte);
        
      System.exit(0);
      
   }

}