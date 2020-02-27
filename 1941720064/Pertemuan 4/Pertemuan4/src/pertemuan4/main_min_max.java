/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.util.Scanner;
import static pertemuan4.min_max.max_min;
/**
 *
 * @author Abdulloh Aqil
 */
public class main_min_max {
    public static void main(String[] args) {
    Scanner aqil = new Scanner(System.in);
    
    min_brute[] ppArray = new min_brute[5];
    ppArray [0] = new min_brute();
    
    int min=ppArray[0].nilai_array;
    int max=ppArray[0].nilai_array;
    
    for (int i = 0 ; i<5 ; i++){
    if(ppArray[i].nilai_array<min)
    min=ppArray[i].nilai_array;
    else if(ppArray[i].nilai_array>max)
    max=ppArray[i].nilai_array;
    }
    
    
       for (int i=0 ; i<5; i++){
    ppArray[i] = new min_brute();
        System.out.println("Nilai array index ke -"+i);
        System.out.println("masukkan");
        ppArray[i].nilai_array = aqil.nextInt();
    }
        System.out.println("brute force");
        System.out.println("Maximal Value :"+max);
        System.out.println("Minimal Value :" + min);

        //
        int arr[] = new int[5];
         for (int i=0; i<5; i++){
           arr[i]=ppArray[i].nilai_array; 
        }
        
        maxmin hasil = new maxmin();
        max_min(arr,0,4,hasil);
        System.out.println("Devide Concouer");
        System.out.println("Nilai Mainimal :" + hasil.minimum +"Value Maximal" +hasil.maximum);
        System.out.println("\n");
}
}


