/*
3) Crie um algoritmo para ler 2 n�meros inteiros e calcular a divis�o e o resto da divis�o
 deles. N�o precisa testar a divis�o por zero, pois os alunos ainda n�o aprenderam desvio condicional.
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
      
      System.out.println("Divis�o: " + resultadoDivisao);
      
      System.out.println("Resto: " + resto);
      
      System.exit(0);
   
   }

}