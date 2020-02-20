/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author Abdulloh Aqil
 */
public class pangkatmain {
     public static void main (String [] args){
      Scanner aqil = new Scanner (System.in);
        int menu;
        System.out.println("masukkan 1 jika ingin Brute force masukkan 2 untuk Divide and Conguer :");
        menu = aqil.nextInt();
        System.out.println("==================================");
        System.out.println("masukan jumblah elemen yang ingin dihitung :");
        int elemen = aqil.nextInt();
        pangkat [] png = new pangkat [elemen];
        
        for (int i=0; i<elemen; i++){
            png[i] = new pangkat ();
            System.out.println("masukan nilai yang akan dipangkatkan ke - " +(i+1)+ " :" );
            png [i].nilai = masuk(aqil.nextInt());
            System.out.println("masukan nilai pemangkat ke- " + (i+1) + " :");
            png[i].pangkat = masuk(aqil.nextInt());
        }
        
        if(menu == 1){
        System.out.println("============================");
        System.out.println("hasil pangkat dengan burete force ");
        for(int i = 0 ; i<elemen; i++){
            System.out.println("nilai " + png[i].nilai + "pangkat " + png[i].pangkat + "adalah : "+ png[i].pangkatbf (png[i].nilai,png[i].pangkat));
            
        }
        }else{
        System.out.println("============================");
        System.out.println("hasil pangkat dengan Divide and Conguer ");
        for(int i =0; i<elemen; i++){
            System.out.println("nilai "+ png[i].nilai + "pangkat " + png[i].pangkat + "adalah :" + png[i].pangkatdc(png[i].nilai,png[i].pangkat));
        }
        }
        
        
    }

    private static int masuk(int a) {
        return a;
    }
     
     
}


