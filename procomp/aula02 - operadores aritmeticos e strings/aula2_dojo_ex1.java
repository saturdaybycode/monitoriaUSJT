/*

1) Crie um algoritmo para ler 2 números inteiros, calcular e imprimir a soma deles.

a. Faça uma solução atribuindo a soma a uma variável e imprimindo o resultado via System.out.println (só o número, sem concatenar texto).
b. Faça outra solução imprimindo a soma diretamente no System.out.println (só o número, sem concatenar texto).
c. Faça mais uma solução, desta vez concatenando uma mensagem, como "O resultado é: " e imprimindo o resultado via System.out.println.

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

      System.out.println("\n\nO resultado é:" + (numeroUm + numeroDois));
    
      System.exit(0);
   
   }

}

