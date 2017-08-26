/*

1) Crie um algoritmo que leia três palavras, separadamente, e as apresenta na tela
 na ordem contrária em que foram digitadas, separadas por espaço.

*/

import javax.swing.*;

public class aula1_exercicios_ex1{

   public static void main(String[] args){
   
      //Declaração das variáveis   
      String palavra1, palavra2, palavra3, inverte;
      
      //Atribui o valor informado pelo usuário na variável palavraX
      palavra1 = JOptionPane.showInputDialog("Digite a palavra 1: ");
      
      palavra2 = JOptionPane.showInputDialog("Digite a palavra 2: ");
       
      palavra3 = JOptionPane.showInputDialog("Digite a palavra 3: ");
      
      //Concatena na ordem inversa
      inverte = palavra3 + " " + palavra2 + " " + palavra1;
      
      //Exibe uma caixa de diálogo com o resultado da inversão
      JOptionPane.showMessageDialog(null, "Exibindo a ordem inversa: " + inverte);
        
      System.exit(0);
      
   }

}