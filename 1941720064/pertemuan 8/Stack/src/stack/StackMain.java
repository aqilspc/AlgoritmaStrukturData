/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Abdulloh Aqil
 */
public class StackMain {
        public static void main(String[] args) {
                Scanner aqil = new Scanner(System.in);
                int a;
          
                System.out.print("Masukkan Panjang Data Stack:");
                a=aqil.nextInt();
               int[] stack = new int [a];
                Stack tumpukan = new Stack(a);
                for (int i=0 ; i<stack.length;i++){
                   System.out.print("Masukkan data ke -" +" "+(i+1)+":");
                    stack[i] =aqil.nextInt();
                    tumpukan.push(stack[i]);
              }
               tumpukan.print();
               tumpukan.pop();
               tumpukan.peek();
               tumpukan.print();
             }
}
