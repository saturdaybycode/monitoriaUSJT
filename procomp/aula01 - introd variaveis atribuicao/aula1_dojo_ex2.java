
/*

2) Crie um algoritmo bem simples, que escreva o nome da disciplina na tela.
a. Comece escrevendo usando um System.out.prindddral a uma variável String e imprimindo a variável usando o System.out.println.
c. Faça outra, agora lendo uma entrada via JOptionPane.showInputDialog, atribuindo à variável e imprimindo ainda com o System.out.println.
d. Faça outra análoga à anterior, mas desta vez imprima o resultado via JOptionPane.showMessageDialog.

*/

//Realizamos a importação da biblioteca responsável pelas caixas de diálogo com o usuário
import javax.swing.*;

public class aula1_dojo_ex2{

   public static void main(String args[]){
   
      //Declaração das variáveis   
      String nome, versao;      
      
      int idade;
      
      //Declara a variável e atribui um valor para a mesma
      String cabecalho = ">>> Versao da aplicacao: ";
      
      //Caixa de diálogo é exibida para o usuário. Assim que clicar em OK, o valor digitado será atribuido para a variável nome 
      nome = JOptionPane.showInputDialog("Digite o nome:");
      
      //Caixa de diálogo é exibida para o usuário. Assim que clicar em OK, 
      //O JOptionPane retornará o valor digitado no formato STRING, por isso precisamos converter o seu retorno para o tipo INT
      //utilizando o método  Integer.parseInt()  
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
      
      //Caixa de diálogo é exibida com os valores digitados
      JOptionPane.showMessageDialog(null, "Nome digitado foi: " + nome + "\nIdade digitada: " + idade);
            
      versao = "1.0";
      
      //Comando de impressão na tela/console
      System.out.println(cabecalho + versao);
      
      System.out.println("\nNome: " + nome + " Idade: " + idade);
      
      
      //Finaliza a execução do programa
      System.exit(0);
            
   
   }

}