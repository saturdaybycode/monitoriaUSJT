/*

5) Para gerar o nome de usu�rio de rede de um novo empregado uma empresa usa o seguinte algoritmo: 
pega as tr�s primeiras letras do nome e as tr�s �ltimas letras do sobrenome da pessoa os concatena. 
Implemente este algoritmo, lendo o nome completo da pessoa e imprimindo o resultado.

*/

import javax.swing.*;

public class aula2_dojo_ex5{

   public static void main(String[] args){
   
      String nome, usuario;
      
      nome = JOptionPane.showInputDialog("Informe o nome do funcion�rio: ");
      
      usuario = nome.substring(0,3) + nome.substring(nome.length()-3, nome.length());
      
      JOptionPane.showMessageDialog(null, "Nome completo: " + nome 
                                         +"\n\nNome de usu�rio: " + usuario        
      );
      
      System.exit(0);
   
   }

}