/*

5) Crie um algoritmo que calcule o valor de uma d�vida, submetida a juros compostos: 
Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros (em %) e N representa o 
n�mero de meses Responda: se voc� deve para o cart�o de cr�dito R$ 100,00, � taxa de juros de 10%, 
quanto dever� depois de 8 meses?

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