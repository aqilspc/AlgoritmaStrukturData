/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdulloh Aqil
 */
public class Buku_Aqil_Main {
     public static void menu() {
        System.out.println("SIM BUKU PERPUSATAKAAN");
        System.out.println("==============================");
        System.out.println("Pilihan Menu");
        System.out.println("1. Buku Masuk Baru");
//        System.out.println("2. Add Last");
//        System.out.println("2. Buku Masuk"); //buku rusak sama tapi belum
//        System.out.println("4. Delete First");
//        System.out.println("5. Delete Last");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Cari Buku");
//        System.out.println("9. Sorting ");
        System.out.println("6. Exit");
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner aqil = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih, index;
        
        do {
            Buku_Aqil data = new Buku_Aqil();
            data.kode=101;
            data.judul="C++";
            data.penerbit="Gramedia";
            data.stock=100;
            data.rusak=20;
            //data
            Buku_Aqil data1 = new Buku_Aqil();
            data1.kode=102;
            data1.judul="Php";
            data1.penerbit="Gajah Mada";
            data1.stock=100;
            data1.rusak=20;
            //data
            Buku_Aqil data2 = new Buku_Aqil();
            data2.kode=103;
            data2.judul="Python";
            data2.penerbit="HWH Media";
            data2.stock=100;
            data2.rusak=20;
            try {
                dll.add(data,0);
                dll.add(data1,1);
                dll.add(data2,2);
            } catch (Exception ex) {
//                Logger.getLogger(Buku_Aqil_Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            menu();
            System.out.print(">> ");
            pilih = aqil.nextInt();
            System.out.println("==============================\n");
            switch (pilih) {
                case 1:
                    System.out.print("Enter code: ");
                    data.kode = aqil.nextInt();
                    System.out.print("Enter name: ");
                    data.judul=aqil.nextLine();
                    System.out.print("Enter vendor: ");
                    data.penerbit = aqil.nextLine();
                    System.out.print("Enter Stock: ");
                    data.stock = aqil.nextInt();
                    data.rusak = 0;
                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    index = aqil.nextInt();
                    try {
                        dll.buku_keluar(index);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
             case 3:
                    System.out.print("Enter index: ");
                    index = aqil.nextInt();
                    int rusak;
                     System.out.print("Enter banyak rusak: ");
                    rusak = aqil.nextInt();
                    try {
                        dll.buku_rusak(index,rusak);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 4:
                    dll.print(data);
                    dll.print(data1);
                    dll.print(data2);
                    break;
                case 5:
                    System.out.print("Mencar berdasrkan ?");
                    System.out.println("1.judul");
                    System.out.println("2.Kode");
                    System.out.println("3.penerbit");
                    int oyi;
                    System.out.print("Pilihan : ");
                    oyi = aqil.nextInt();
                    if(oyi==1){
                    System.out.print("Enter judul wanto to search : ");
                    aqil.nextLine();
                    String judul = aqil.nextLine();
                    try {
                        dll.get(judul);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    }else if(oyi==2){
                     System.out.print("Enter judul wanto to search : ");
                    aqil.nextLine();
                    int kode = aqil.nextInt();
                    try {
                        dll.cek_buku_kode(kode);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    }else{
                     System.out.print("Enter penerbit wanto to search : ");
                    aqil.nextLine();
                    String penerbit = aqil.nextLine();
                    try {
                        dll.cek_buku_penerbit(penerbit);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    }
                    break;
                case 6:
                    System.exit(0);
            }
            System.out.println();
        } while (pilih >= 1 && pilih <= 6);
    }
}
