/*

4) Crie um algoritmo para ler um n�mero inteiro, um n�mero real, uma letra (caractere) e um booleano e imprimir todos na tela.
 Os valores lidos devem ser atribu�dos a vari�veis do tipo correspondente (inteiro para int, real para double, etc.).
 Fa�a em dois passos, primeiro lendo para uma vari�vel do tipo String e depois convertendo a String para o tipo correto.

*/

//Realizamos a importa��o da biblioteca respons�vel pelas caixas de di�logo com o usu�rio
import javax.swing.*;

public class aula1_dojo_ex4{

   public static void main(String[] args){
   
      //Declara��o das vari�veis
      String dadosDigitados;   
   
      int numeroInteiro;
      
      double numeroReal;
      
      char caracter;
      
      boolean valorLogico;
      
      //Caixa de di�logo � exibida e usu�rio informa o valor
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor inteiro:");
      
      //Imprime o valor atribuido pelo usu�rio na tela/console
      System.out.println("valor inteiro: " + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor real:");
      
      System.out.println("valor real: " + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um caracter:");
      
      System.out.println("" + dadosDigitados);
      
      dadosDigitados = JOptionPane.showInputDialog("Digite um valor l�gico:"); 
      
      System.out.println("valor l�gico: " + dadosDigitados);   
      
      
      //JOptionPane retorna um valor do tipo STRING, por isso utilizamos os 
      //seguintes m�todos para converter o valor para um tipo mais apropriado
      
      //Integer.parseInt(String) -> recebe uma STRING e converte para o tipo INT
      numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
      
      //Double.parseDouble(String) -> recece uma STRING e converte para o tipo DOUBLE
      numeroReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real:"));
      
      //Se uma STRING � uma cadaia de CHAR's, precisamos apenas capturar o 1� caracter atrav�s do m�todo charAt(0)
      caracter = (JOptionPane.showInputDialog("Digite um caracter:")).charAt(0);
      
      //Boolean.parseBoolean -> recebe uma STRING e converte para o tipo BOOLEAN
      valorLogico = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite um valor l�gico:"));
      
      //Exibe os valores informados pelo usu�rio
      JOptionPane.showMessageDialog(null, "Valores digitados:" 
      
                                        + "\nvalor inteiro: "  + numeroInteiro
                                        + "\nvalor real: "     + numeroReal
                                        + "\nvalor caracter: " + caracter
                                        + "\nvalor l�gico: "   + valorLogico
                                             
      );
      
      System.exit(0);
   
   }

}