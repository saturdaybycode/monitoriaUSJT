/*

5) Crie um algoritmo que calcule o valor de uma dívida, submetida a juros compostos: 
Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros (em %) e N representa o 
número de meses Responda: se você deve para o cartão de crédito R$ 100,00, à taxa de juros de 10%, 
quanto deverá depois de 8 meses?

*/

import javax.swing.*;

public class aula2_exercicios_ex5{

   public static void main(String[] args){
   
      double valorFinal, valorInicial, juros;
      
      int meses;
      
      valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor inicial: R$"));
      
      juros = Double.parseDouble(JOptionPane.showInputDialog("Informe o juros: %"));
      
      meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtd de meses: "));
      
      valorFinal = valorInicial * Math.pow((1 + juros/100), meses);
      
      JOptionPane.showMessageDialog(null, "Valor total: R$ " + valorFinal);
      
      System.exit(0);
      
         
   }

}