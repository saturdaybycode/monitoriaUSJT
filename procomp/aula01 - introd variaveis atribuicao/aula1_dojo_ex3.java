/*

3) Crie um algoritmo para ler 2 strings, concatená-las, atribuindo a uma terceira variável e escrever o resultado na tela.

*/

//Realizamos a importação da biblioteca responsável pelas caixas de diálogo com o usuário
import javax.swing.*;

public class aula1_dojo_ex3{

   public static void main(String args[]){
   
      //Declaração das variáveis 
      String textoUm, textoDois, textoTres;
      
      //Caixa de diálogo é exibida para o usuário. Assim que clicar em OK, o valor digitado será atribuido para a variável textoUm
      textoUm = JOptionPane.showInputDialog("Digite o texto 1:");
      
      //Caixa de diálogo é exibida para o usuário. Assim que clicar em OK, o valor digitado será atribuido para a variável textoDois
      textoDois = JOptionPane.showInputDialog("Digite o texto 2");
      
      //Concatenação dos texto e atribuição para a variável textoTres
      textoTres = textoUm + " " + textoDois;
      
      //Caixa de diálogo é exibida com o resultado da concatenação, ou seja, exibe o conteúdo da variável textoTres
      JOptionPane.showMessageDialog(null, "Conteudo do texto 3: " + textoTres);
      
      //Finalizamos o programa
      System.exit(0);
   
   }

}