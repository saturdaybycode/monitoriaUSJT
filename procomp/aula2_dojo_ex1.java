/*

1) Crie um algoritmo para ler 2 n�meros inteiros, calcular e imprimir a soma deles.

a. Fa�a uma solu��o atribuindo a soma a uma vari�vel e imprimindo o resultado via System.out.println (s� o n�mero, sem concatenar texto).
b. Fa�a outra solu��o imprimindo a soma diretamente no System.out.println (s� o n�mero, sem concatenar texto).
c. Fa�a mais uma solu��o, desta vez concatenando uma mensagem, como "O resultado �: " e imprimindo o resultado via System.out.println.

*/

import javax.swing.*;

public class aula2_dojo_ex1{

   public static void main(String[] args){
   
      int numeroUm, numeroDois, soma;
      
     
      numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o num 1: "));
      
      numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o num 2: "));
      
     
      soma = numeroUm + numeroDois;
      
      System.out.println(soma);
      
      System.out.println(numeroUm + numeroDois);

      System.out.println("\n\nO resultado �:" + (numeroUm + numeroDois));
    
      System.exit(0);
   
   }

}

