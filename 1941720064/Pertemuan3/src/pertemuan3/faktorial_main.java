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
public class faktorial_main {
    public static void main(String[] args) {
        long siap = System.currentTimeMillis(); // mengambil waktu awal eksekusi
       Scanner aqil = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan Jumlah Elemen yang ingin dihitung");
        int elemen = aqil.nextInt();
        
        Fktorial []fk = new Fktorial[elemen];
        for (int i=0; i<elemen; i++){
        fk[i] = new Fktorial();
            System.out.print("Masukan data ke-"+(i+1)+":");
            fk[i].nilai=aqil.nextInt();
        }
        
        System.out.println("============================================");
        System.out.println("Hasil faktoria dengan brutforce");
        for (int i=0;i<elemen;i++){
            System.out.println("Fkotial dari nilai"+fk[i].nilai+" Adalah :"+ fk[i].faktorialIBF(fk[i].nilai));   
        }
        System.out.println("============================================");
        System.out.println("Hasil Faktorial dengan devide qonqure");
        for (int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai"+fk[i].nilai+" Adalah :"+ fk[i].faktoialIDC(fk[i].nilai));
        }
        long oke = System.currentTimeMillis(); // mengambil waktu akhir eksekusi
        long wes = oke - siap; // menghitung waktu eksekusi
        System.out.println("execution time: "+ String.valueOf(wes)+" milidetik");
    }
    
}
