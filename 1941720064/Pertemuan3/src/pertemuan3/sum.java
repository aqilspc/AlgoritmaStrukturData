/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Abdulloh Aqil
 */
public class sum {
    public int elemen ;
    public double keuntungan [];
    public double total ;
    
    sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen] ;
        this.total = 0 ;
        
    }
    double totalbf(double arr []){
        for (int i=0; i<elemen; i++){
            total = total + arr[i];
            
        }
        return total ;
    }
    double totaldc(double arr[],int i , int r){
        if (i==r)
            return arr [i];
        else if (1<r){
            int mid=(i+r)/2;
            double isum=totaldc(arr,1,mid-1);
            double rsum=totaldc(arr,mid+1,r);
            return isum+rsum+arr[mid];
            
        }
        return 0;
    }
}
