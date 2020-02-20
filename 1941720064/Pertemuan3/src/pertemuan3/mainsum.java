/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner ;
/**
 *
 * @author Abdulloh Aqil
 */
public class mainsum {
    public static void main (String [] args){
        Scanner aqil = new Scanner (System.in);
        System.out.println("============================");
        System.out.println("progam menghitung keuntungan total (satuan juta , misal 5.9)");
        System.out.println("masukan jumblah bulan");
        int elm = aqil.nextInt();
        
        sum sm = new sum(elm) ;
        System.out.println("==============================");
        for (int i =0; i<sm.elemen; i++){
            System.out.println("masukan untung bulan ke - " + (i+1) +" - ");
            sm.keuntungan[i] =aqil.nextDouble();
        }
        System.out.println("============================");
        System.out.println("algoritma brute force");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + "bulan adalah =" +String.format("%.3f",sm.totalbf(sm.keuntungan)) );
        System.out.println("=======================");
        System.out.println("algoritma divide conguer");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + String.format("%.3f",sm.totaldc (sm.keuntungan,0,sm.elemen-1)) );
                  
        
    }
}
