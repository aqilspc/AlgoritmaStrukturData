/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertmuan7;
import java.util.Scanner;
/**
 *
 * @author Abdulloh Aqil
 */
public class searching_main {
    public static void main(String[] args) {
        Scanner aqil = new Scanner(System.in);
        int data[] = {10,30,40,50,60,70,80,90};
        int data1[] = {100,90,80,70,60,50,40,30};
        int cari;
        Searching cari_data1 = new Searching(data1,8);
        Searching cari_data = new Searching(data,8);
         System.out.println("Isi Array Sequantial");
        cari_data.tampil_data();
        System.out.println("Isi Array Binary ");
        cari_data1.tampil_data();
        System.out.println("Masukkaan data yang mau dicari");
        cari = aqil.nextInt();
        int posisi = cari_data.find_seq_search(cari);
        System.out.println("squantial seacrh");
        
        if(posisi !=-1){
            System.out.println("data :" +cari+ "Ditemukan pada indeks ke :"+posisi);
        }else{
            System.out.println("data :"+cari+"tidak ada!");
        }
        int posisi1 = cari_data1.find_seq_search(cari);
        System.out.println("================");
        System.out.println("Binary Search");
         cari_data1.tampil_posisi(cari,posisi1);
    }
}
