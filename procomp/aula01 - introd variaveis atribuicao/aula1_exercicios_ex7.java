/*

7) Leia 4 n�meros inteiros, representando milhar, centena, dezena e unidade. Use o tipo caractere para garantir
   que n�o seja digitado mais de um n�mero por vez. Depois concatene estes caracteres armazenando-os em uma String
   (lembre-se de que o jeito mais f�cil de transformar algo em String � concatenando-o com uma String vazia ��).
   Imprima o resultado.

*/

import javax.swing.*;

public class aula1_exercicios_ex7{

   public static void main(String[] args){
   
      String valorCompleto = "";
      
      char unidade, dezena, centena, milhar;      
      
      milhar = (JOptionPane.showInputDialog("Digite a milhar").charAt(0));
      
      valorCompleto += milhar;
      
      centena = (JOptionPane.showInputDialog("Digite a centena").charAt(0));
      
      valorCompleto += centena;
      
      dezena = (JOptionPane.showInputDialog("Digite a dezena").charAt(0)); 
      
      valorCompleto += dezena;    
     
      unidade = (JOptionPane.showInputDialog("Digite a unidade").charAt(0));
      
      valorCompleto += unidade;
      
      JOptionPane.showMessageDialog(null, "Valor completo: " + valorCompleto);
   
      System.exit(0);
   
   }

}