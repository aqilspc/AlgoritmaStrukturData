/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshet.pkg5;

import java.util.Scanner;

/**
 *
 * @author Abdulloh Aqil
 */
public class main {

    private static boolean ascending;
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         Scanner s1 = new Scanner(System.in);
         daftar_mhs_prestasi data = new daftar_mhs_prestasi();
         int jml_mhs=5;
         for (int i=0;i<jml_mhs;i++){
             System.out.println("Nama: ");
             String nama = s1.nextLine();
             System.out.println("Tahun Masuk :");
             int thn_masuk = s.nextInt();
             System.out.println("umur: ");
             int umur = s.nextInt();
             System.out.println("IPK: ");
             double ipk = s.nextDouble();
             
             Mahasiswa m = new Mahasiswa(nama,thn_masuk,umur,ipk);
             data.tambah(m);
         }
             System.out.println("data sebelum di sort");
             data.tampil();
             
             System.out.println("data sudah sort buuble sort");
             data.buble_sort();
             data.tampil();
             
             System.out.println("data sudah sort selection sort");
             data.selection_sort();
             data.tampil();
             
             System.out.println("data sudah sort insertuion sort dsc");
             data.insertion_sort();
             data.tampil();
             
             System.out.println("data sudah sort insertuion sort asc");
             data.insertion_sort_pilih(ascending);
             data.tampil();
         }
    }
     

