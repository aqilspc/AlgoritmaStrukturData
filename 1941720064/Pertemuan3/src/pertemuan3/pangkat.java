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
public class pangkat {
     public int nilai,pangkat;
    
    public int pangkatbf(int a,int n){
        int hasil =1;
        for (int i=1; i<n; i++){
            hasil =hasil * a;
        }
        return hasil ;
    }
    
    public int masuk(int a){
    return a;
    }
    
    public int pangkatdc(int a,int n ){
        if (n==0){
            return 1 ;
            
        }
        else {
            if(n%2==1)
                return (pangkatdc(a,n/2)*pangkatdc(a,n/2)*a);
            else 
                return (pangkatdc(a,n/2)* pangkatdc(a,n/2));
        }
    }
}
