/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigas14;
import java.util.Scanner;
/**
 *
 * @author Abdulloh Aqil
 */
public class BinaryTreeMain {
    static void menu() {
        System.out.println("Pilihan menu");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Traverse preOrder");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Keluar");
    }

    public static void main(String[] args) {
        Scanner aqil = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int pilih, data;
        do {
            menu();
            System.out.println("=====================");
            pilih = aqil.nextInt();
            System.out.println("=====================");
            switch (pilih) {
                case 1:
                    System.out.print("Sub menu\n1. add secara iterasi\n2. add secara rekursif");
                    System.out.println("\n--------------------");
                    pilih = aqil.nextInt();
                    System.out.print("Masukkan data : ");
                    data = aqil.nextInt();
                    if (pilih == 1) {
                        bt.add(data);
                    } else if (pilih == 2) {
                        bt.addRekursif(data);
                    } else {
                        System.out.println("input salah!");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan data : ");
                    data = aqil.nextInt();
                    bt.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan data : ");
                    data = aqil.nextInt();
                    System.out.printf("Find %s %s", data, bt.find(data));
                    System.out.println("");
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Aplikasi keluar!!");
                    System.exit(0);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
