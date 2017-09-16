/*

7) Entrar com um angulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente.

*/

import javax.swing.*;

public class aula2_exercicios_ex7{
   
   public static void main(String[] args){
   
      double angulo, radiano, seno, cosseno, tangente, secante, cossecante, cotangente;
      
      angulo = Double.parseDouble(JOptionPane.showInputDialog("Informe o angulo:"));
      
      radiano = (Math.PI * angulo) / 180;
      
      seno = Math.sin(radiano);
      
      cosseno = Math.cos(radiano);
      
      tangente = Math.tan(radiano);
      
      secante = 1 / cosseno;
      
      cossecante = 1 / seno;
      
      cotangente = 1 / tangente;
      
      JOptionPane.showMessageDialog(null, "Angulo: " + angulo 
                                          + "\n\nseno: " + seno
                                          + "\n\ncosseno: " + cosseno
                                          + "\n\ntangente: " + tangente
                                          + "\n\nsecante: " + secante
                                          + "\n\ncossecante: " + cossecante
                                          + "\n\ncotangente: " + cotangente                                
      
      );
      
      System.exit(0);
   
   }

}