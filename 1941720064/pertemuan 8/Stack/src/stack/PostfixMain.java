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
public class PostfixMain {
     public static void main(String[] args) {
         Scanner aqil = new Scanner(System.in);
         String P,Q;
         System.out.println("Masukkan Espresi Matemarika");
         Q =aqil.nextLine();
         Q=Q.trim();
         Q= Q+")";
         int total;
         total = Q.length();
         Postfix post = new Postfix(total);
         P = post.konversi(Q);
         System.out.println("Postfx: " + P);
     }
}
