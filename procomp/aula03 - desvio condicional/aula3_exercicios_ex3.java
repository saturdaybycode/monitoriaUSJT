/*
4) Ler três números e escrevê-los em ordem crescente (suponha números diferentes).

*/

import javax.swing.*;

public class exe4{

   public static void main(String[] args){
   
      int a, b, c;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de a:"));
      
      b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de b:"));
      
      c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de c:"));
      
     if((a < b) && (a < c)){
      
         System.out.print(a);
         
         if(b < c){
         
            System.out.print(b);
            
            System.out.print(c);
                  
         }else{
         
            System.out.print(c);
            
            System.out.print(b);
         
         }
               
      }else if((b < a) && (b < c)){
      
         System.out.print(b);
         
         if(a < c){
         
            System.out.print(a);
            
            System.out.print(c);
         
         }else{
         
            System.out.print(c);
            
            System.out.print(a);
         
         } 
      
      
      }else if((c < a) && (c < b)){
      
         System.out.print(c);
         
         if(a < b){
         
            System.out.print(a);
            
            System.out.print(b);
         
         }else{
         
            System.out.print(b);
            
            System.out.print(a);
         
         } 
      
      } 
   
      System.exit(0);
   }


}