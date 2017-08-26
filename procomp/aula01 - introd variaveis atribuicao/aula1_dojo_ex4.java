/*

4) Crie um algoritmo para ler um número inteiro, um número real, uma letra (caractere) e um booleano e imprimir todos na tela.
 Os valores lidos devem ser atribuídos a variáveis do tipo correspondente (inteiro para int, real para double, etc.).
 Faça em dois passos, primeiro lendo para uma variável do tipo String e depois convertendo a String para o tipo correto.

*/

//Realizamos a importação da biblioteca responsável pelas caixas de diálogo com o usuário
import javax.swing.*;

public class aula1_dojo_ex4{

   public static void main(String[] args){
   
      //Declaração das variáveis
      String dadosDigitados;   
   
      int numeroInteiro;
      
      double numeroReal;
      
      char caracter;
      
      boolean valorLogico;
      
      //Caixa de diálogo é exibida e usuário informa o valor
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor inteiro:");
      
      //Imprime o valor atribuido pelo usuário na tela/console
      System.out.println("valor inteiro: " + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor real:");
      
      System.out.println("valor real: " + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um caracter:");
      
      System.out.println("" + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor lógico:"); 
      
      System.out.println("valor lógico: " + dadosDigitados);   
      
      
      //JOptionPane retorna um valor do tipo STRING, por isso utilizamos os 
      //seguintes métodos para converter o valor para um tipo mais apropriado
      
      //Integer.parseInt(String) -> recebe uma STRING e converte para o tipo INT
      numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
      
      //Double.parseDouble(String) -> recece uma STRING e converte para o tipo DOUBLE
      numeroReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real:"));
      
      //Se uma STRING é uma cadaia de CHAR's, precisamos apenas capturar o 1º caracter através do método charAt(0)
      caracter = (JOptionPane.showInputDialog("Digite um caracter:")).charAt(0);
      
      //Boolean.parseBoolean -> recebe uma STRING e converte para o tipo BOOLEAN
      valorLogico = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite um valor lógico:"));
      
      //Exibe os valores informados pelo usuário
      JOptionPane.showMessageDialog(null, "Valores digitados:" 
      
                                        + "\nvalor inteiro: "  + numeroInteiro
                                        + "\nvalor real: "     + numeroReal
                                        + "\nvalor caracter: " + caracter
                                        + "\nvalor lógico: "   + valorLogico
                                             
      );
      
      System.exit(0);
   
   }

}