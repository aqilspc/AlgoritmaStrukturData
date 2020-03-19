/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertmuan7;

/**
 *
 * @author Abdulloh Aqil
 */
  public class Searching {
     public int[] data;
    public int jumlah_data;
    
     public Searching(int [] Data, int jumlah_data1){
    this.jumlah_data = jumlah_data1;
    data = new int[jumlah_data];
    for (int i = 0 ; i<jumlah_data;i++){
    data[i] = Data[i];
    }
    }
     public int find_seq_search(int cari){
     int posisi =-1;
     for(int j = 0; j<jumlah_data; j++){
         if(data[j] == cari){
         posisi = j;
         break;
         }
     }
     return posisi;
     }
     
     public int find_binary_search(int cari,int left, int right){
     int mid;
     if(right >= left){
     mid = (left +right) /2;
     if(cari == data[mid]){
     return (mid);
     }else if (data[mid]>cari){
     return find_binary_search(cari,left,mid-1);
     }else {
     return find_binary_search(cari,mid+1,right);
     }
     }
     return -1;
     }
     
    
     public void tampil_data(){
     for (int i=0 ; i<jumlah_data; i++){
         System.out.print(data[i]+" ");
     }
         System.out.println();
     }
     
     public void tampil_posisi(int x,int pos){
     if (pos!=-1){
         System.out.println("data :"+x+"ditemukan pada index :" + pos);
     }else{
         System.out.println("data :"+x+"tidak ketemu!");
     }
     }
     }