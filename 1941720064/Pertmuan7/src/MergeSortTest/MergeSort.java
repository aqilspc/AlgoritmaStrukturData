/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSortTest;

/**
 *
 * @author Abdulloh Aqil
 */
public class MergeSort {
    int data[] = {10,30,40,50,60,70,80,90};
    public void mergeSort(int[] data){
    sort(data,0,7);
    }  
    public void print_array(int data[]){
    int n = data.length;
    for(int i=0; i<n;i++){
        System.out.print(data[i]+" ");
    }
    }
    private void merge(int data[],int left,int middle,int right){
    int [] temp= new int [data.length];
    for (int i=left;i<=right;i++){
    temp[i] = data[i];
    }
    int a=left;
    int b=middle+1;
    int c=left;
    
    while(a<=middle && b <=right){
    if(temp[a] <= temp[b]){
    data[c] = temp[a];
    a++;
    }else {
    data[c]=temp[b];
    b++;
    }
    c++;
    }
    int s=middle -a;
    for(int i=0; i<=s;i++){
    data [c+i] = temp[a+i];
    }       
    } 
    private void sort (int data[], int left, int right){
    if (left < right){
    int middle = (left + right)/2;
    sort(data,left,middle);
    sort(data,middle+1,right);
    merge(data,left,middle,right);
    }
    }
    
    
}
