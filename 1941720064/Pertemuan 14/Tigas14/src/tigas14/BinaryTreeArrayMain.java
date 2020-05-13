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
public class BinaryTreeArrayMain {
     public static void main(String[] args) {
        Scanner aqil = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int idxLast=0, idxStart = 0, pilih, data;

        do {
            if (bta.data == null) {
                System.out.print("Masukkan panjang array :");
                idxLast = aqil.nextInt();
            }
            System.out.println("\nPilihan menu");
            System.out.println("1. add");
            System.out.println("2. display");
            System.out.println("=====================");
            pilih = aqil.nextInt();
            System.out.println("---------------------");
            switch (pilih) {
                case 1:
                    bta.populateData(idxLast);
                    for (int i = 0; i < idxLast; i++) {
                        System.out.printf("Masukkan data %d: ", i);
                        data = aqil.nextInt();
                        bta.add(data);
                    }
                    break;
                case 2:
                    System.out.print("Traverse inOrder\t: ");
                    bta.traverseInOrder(idxStart);
                    System.out.println("");
                    System.out.print("Traverse preOrder\t: ");
                    bta.traversepreOrder(idxStart);
                    System.out.println("");
                    System.out.print("Traverse postOrder \t: ");
                    bta.traversepostOrder(idxStart);
                    System.out.println("");
            }
        } while (pilih == 1 || pilih == 2);
    }
}
