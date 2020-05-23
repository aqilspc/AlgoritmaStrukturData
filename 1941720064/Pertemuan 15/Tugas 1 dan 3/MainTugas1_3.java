/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class MainTugas1_3 {
    static Scanner sc = new Scanner(System.in); 
    static int pilih, type; 
    static boolean tipe = true; 
    static Tugas1_3 grph = new Tugas1_3(6); 
 
    public static void main(String[] args) throws Exception { 
        grph.addEdge(0, 1); 
        grph.addEdge(0, 4); 
        grph.addEdge(1, 2); 
        grph.addEdge(1, 3); 
        grph.addEdge(1, 4); 
        grph.addEdge(2, 3); 
        while (true) { 
            menu(); 
        } 
    }  
    public static void menu() throws Exception { 
        System.out.println("Menu"); 
        System.out.println("======================="); 
        System.out.println("1. Jenis Graph"); 
        System.out.println("2. Input jumlah vertex"); 
        System.out.println("3. AddEdge"); 
        System.out.println("4. RemoveEdges"); 
        System.out.println("5. RemoveAlledges"); 
        System.out.println("6. Exit"); 
        System.out.println("======================="); 
        System.out.print("Masukkan pilihan : "); 
 
        pilih = sc.nextInt(); 
        switch (pilih) { 
            case 1: 
                if (tipe == true) { 
                    System.out.print("Input Graph type (0=directed, 1=undirected) : "); 
                    type = sc.nextInt(); 
                    System.out.println(grph.graphType(type)); 
                    tipe = false; 
                } else { 
                    System.out.println(grph.graphType(type)); 
                } 
                break; 
            case 2: 
                System.out.print("Input : "); 
                int input = sc.nextInt(); 
                grph = new Tugas1_3(input); 
                break; 
            case 3: 
                String pil; 
                do { 
                    System.out.println("Input : <source> <destination>"); 
                    int source = sc.nextInt(); 
                    int destination = sc.nextInt(); 
                    grph.addEdge(source, destination); 
                    do { 
                        System.out.print("Another one (y/n) : "); 
                        pil = sc.next(); 
                        if (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) { 
                            System.out.println("Input False"); 
                        } 
                    }while(!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")); 
                } while (pil.equalsIgnoreCase("y")); 
                grph.printGraph(); 
                break; 
            case 4: 
                System.out.print("Remove <source> <destination> : "); 
                int source = sc.nextInt(); 
                int destination = sc.nextInt(); 
                grph.removeEdge(source, destination); 
                break; 
            case 5: 
                grph.removeAllEdge(); 
                break; 
            case 6: 
                System.exit(1); 
        } 
    } 
}
