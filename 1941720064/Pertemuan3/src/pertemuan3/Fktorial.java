/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Abdulloh Aqil
 */
public class Fktorial {
   public int nilai;
   public int faktorialIBF(int n){
   int fakto =1;
   int i=1;
   while(i<=n){
       fakto = fakto * i; //ulang
       i++;
    }
   return fakto;
   }
   
   
   
   public int faktoialIDC(int n){
   if (n==1){
   return 1;
   }else{
   int fakto = n * faktoialIDC(n-1);
           return fakto;
   }
   }
   
}
