/*
3) Crie um algoritmo para ler 2 números inteiros e calcular a divisão e o resto da divisão
 deles. Não precisa testar a divisão por zero, pois os alunos ainda não aprenderam desvio condicional.
*/

import javax.swing.*;

public class aula2_dojo_ex3{

   public static void main(String[] args){
   
      int numA, numB;
      
      double resultadoDivisao, resto;
      
      numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o numA: "));
      
      numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o numB: "));
      
      resultadoDivisao = (double) numA / numB;
      
      resto =  (double) numA % numB;
      
      System.out.println("Divisão: " + resultadoDivisao);
      
      System.out.println("Resto: " + resto);
      
      System.exit(0);
   
   }

}