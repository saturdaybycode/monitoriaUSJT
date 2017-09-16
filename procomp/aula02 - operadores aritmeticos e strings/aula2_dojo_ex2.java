/*

2) Crie um algoritmo que leia uma string, divida-a ao meio, concatene a segunda metade com a primeira e imprima o resultado.

*/

import javax.swing.*;

public class aula2_dojo_ex2{

   public static void main(String[] args){
   
      String texto, parteUm, parteDois;
      
      texto = JOptionPane.showInputDialog("Digite um nome: ");
      
      parteUm = texto.substring(0, (texto.length() / 2));
      
      parteDois = texto.substring(texto.length() / 2, texto.length());
      
      System.out.println("Resultado: " + parteDois + parteUm);
      
      System.exit(0);
         
   }

}