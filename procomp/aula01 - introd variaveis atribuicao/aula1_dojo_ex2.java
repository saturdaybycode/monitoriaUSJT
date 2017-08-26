
/*

2) Crie um algoritmo bem simples, que escreva o nome da disciplina na tela.
a. Comece escrevendo usando um System.out.prindddral a uma vari�vel String e imprimindo a vari�vel usando o System.out.println.
c. Fa�a outra, agora lendo uma entrada via JOptionPane.showInputDialog, atribuindo � vari�vel e imprimindo ainda com o System.out.println.
d. Fa�a outra an�loga � anterior, mas desta vez imprima o resultado via JOptionPane.showMessageDialog.

*/

//Realizamos a importa��o da biblioteca respons�vel pelas caixas de di�logo com o usu�rio
import javax.swing.*;

public class aula1_dojo_ex2{

   public static void main(String args[]){
   
      //Declara��o das vari�veis   
      String nome, versao;      
      
      int idade;
      
      //Declara a vari�vel e atribui um valor para a mesma
      String cabecalho = ">>> Versao da aplicacao: ";
      
      //Caixa de di�logo � exibida para o usu�rio. Assim que clicar em OK, o valor digitado ser� atribuido para a vari�vel nome 
      nome = JOptionPane.showInputDialog("Digite o nome:");
      
      //Caixa de di�logo � exibida para o usu�rio. Assim que clicar em OK, 
      //O JOptionPane retornar� o valor digitado no formato STRING, por isso precisamos converter o seu retorno para o tipo INT
      //utilizando o m�todo  Integer.parseInt()  
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
      
      //Caixa de di�logo � exibida com os valores digitados
      JOptionPane.showMessageDialog(null, "Nome digitado foi: " + nome + "\nIdade digitada: " + idade);
            
      versao = "1.0";
      
      //Comando de impress�o na tela/console
      System.out.println(cabecalho + versao);
      
      System.out.println("\nNome: " + nome + " Idade: " + idade);
      
      
      //Finaliza a execu��o do programa
      System.exit(0);
            
   
   }

}