/*

3) Crie um algoritmo para ler 2 strings, concaten�-las, atribuindo a uma terceira vari�vel e escrever o resultado na tela.

*/

//Realizamos a importa��o da biblioteca respons�vel pelas caixas de di�logo com o usu�rio
import javax.swing.*;

public class aula1_dojo_ex3{

   public static void main(String args[]){
   
      //Declara��o das vari�veis 
      String textoUm, textoDois, textoTres;
      
      //Caixa de di�logo � exibida para o usu�rio. Assim que clicar em OK, o valor digitado ser� atribuido para a vari�vel textoUm
      textoUm = JOptionPane.showInputDialog("Digite o texto 1:");
      
      //Caixa de di�logo � exibida para o usu�rio. Assim que clicar em OK, o valor digitado ser� atribuido para a vari�vel textoDois
      textoDois = JOptionPane.showInputDialog("Digite o texto 2");
      
      //Concatena��o dos texto e atribui��o para a vari�vel textoTres
      textoTres = textoUm + " " + textoDois;
      
      //Caixa de di�logo � exibida com o resultado da concatena��o, ou seja, exibe o conte�do da vari�vel textoTres
      JOptionPane.showMessageDialog(null, "Conteudo do texto 3: " + textoTres);
      
      //Finalizamos o programa
      System.exit(0);
   
   }

}