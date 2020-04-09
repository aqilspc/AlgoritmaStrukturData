/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;
import java.util.Scanner;
/**
 *
 * @author Abdulloh Aqil
 */
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih,n;
        System.out.println("Masukkan Jumlah Maksimal antrian");
        n = sc.nextInt();
        Queue Q = new Queue(n);
        do{
        menu();
        pilih = sc.nextInt();
        switch(pilih){
        case 1:
                System.out.print("Masukkan data baru: ");
                int data_masuk = sc.nextInt();
                Q.Enqueue(data_masuk);
                break;
        case 2:
            int data_keluar = Q.Dequeue();
            if (data_keluar !=0){
                System.out.println("Data yan dikeluarkan : "+ data_keluar);
                break;
            }
        case 3:
            Q.print();
            break;
        case 4:
            Q.peek();
            break;
        case 5:
            Q.peek_rear();
            break;
        }
        }while(pilih ==1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
    public static void menu(){
        System.out.println("Masukkan Operasi yang ingin dialankan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("---------------------------------------");
    }
}
