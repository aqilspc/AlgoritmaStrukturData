/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshet.pkg5;

/**
 *
 * @author Abdulloh Aqil
 */
class Mahasiswa {
    String nama;
    int thn_masuk,umur;
    double ipk;
    
    Mahasiswa(String n ,int t, int u, double i){
    nama =n;
    thn_masuk=t;
    umur=u;
    ipk=i;
    }

   Mahasiswa(){
    
    }
    
    void tampil(){
        System.out.println("nama: "+nama);
        System.out.println("Tahun Masuk: "+ thn_masuk);
        System.out.println("Umur :" + umur);
        System.out.println("IPK :" +ipk);
    }
    }

