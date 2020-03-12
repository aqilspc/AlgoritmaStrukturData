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
 class daftar_mhs_prestasi {
    Mahasiswa list_mhs[] = new Mahasiswa[5];
    int idx;
   
    
    void tambah(Mahasiswa m){
    if(idx<list_mhs.length){
    list_mhs[idx]=m;
    idx++;
    }else{
        System.out.println("data penuh!!");
    }
    }
    
    void tampil(){
    for(Mahasiswa m : list_mhs){
    m.tampil();
        System.out.println("---------------------");
    }
    }
    
    void buble_sort(){
    for (int i=0; i<list_mhs.length-1; i++){
    for(int j=1; j<list_mhs.length-i;j++){
    if(list_mhs[j].ipk>list_mhs[j-1].ipk){
    Mahasiswa tmp = list_mhs[j];
    list_mhs[j] = list_mhs[j-1];
    list_mhs[j-1] = tmp;
    }
    }
    }
    }
    
    void selection_sort(){
        for (int i=0;i<list_mhs.length-1;i++){
        int idxMin=i;
        for (int j=i+1; j<list_mhs.length; j++){
        if(list_mhs[j].ipk<list_mhs[idxMin].ipk){
        idxMin=j;
        }
        }
        Mahasiswa tmp=list_mhs[idxMin];
        list_mhs[idxMin] = list_mhs[i];
        list_mhs[i] =tmp;
        }
    }
    
    void insertion_sort(){
    int i,j;
    for(i=1;i<list_mhs.length;i++){
    Mahasiswa temp = new Mahasiswa();
    temp=list_mhs[i];
    j=i;
    while ((j>0) && (list_mhs[j-1].ipk > temp.ipk)){
    list_mhs[j] = list_mhs[j-1];
    j--;
    }
    list_mhs[j] = temp;
    }
    }
    
     void insertion_sort_pilih(boolean ascending){
    int i,j;
    for(i=1;i<list_mhs.length;i++){
    Mahasiswa temp = new Mahasiswa();
    temp=list_mhs[i];
    j=i;
    if(ascending){
    while ((j>0) && (list_mhs[j-1].ipk > temp.ipk)){
    list_mhs[j] = list_mhs[j-1];
    j--;
    }
    
    }else{
     while ((j<0) && (list_mhs[j-1].ipk < temp.ipk)){
    list_mhs[j] = list_mhs[j-1];
    j--;
    }  
    }
    list_mhs[j] = temp;
     }
}
 }
