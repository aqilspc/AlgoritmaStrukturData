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
public class Tugas4_graph {
    int vertex;
    Tugas4_linkedlists list[];
    static String jenis;

    public Tugas4_graph(int vertex) {
        this.vertex = vertex;
        list = new Tugas4_linkedlists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new Tugas4_linkedlists();
        }
    }

    public boolean graphType() {
        return jenis.equalsIgnoreCase("directed");
    }

    public void addEdge(int source, int destination) {
        if (graphType()) {
            //add edge directed
            list[source].addFirst(destination);
        } else {
            //add edge
            list[source].addFirst(destination);
            //add back edge (for undirected)
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        if (!graphType()) {
            //degree undirected graph
            System.out.println("degree vertex " + source + " : " + list[source].size());
        } else {
            //degree directed graph
            //inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                //outDegree
                for (k = 0; k < list[source].size; k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }

            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(list[source].getByValue(destination));
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tugas4_graph grph = new Tugas4_graph(6);
        char pilih = 'f';
        do {
            System.out.println("---Graph---");
            System.out.println("a. Jenis graph");
            System.out.println("b. Input jumlah vertex");
            System.out.println("c. addEdge");
            System.out.println("d. removeEdge");
            System.out.println("e. removeAllEdges");
            System.out.println("f. Keluar");
            System.out.print("Masukkan menu: ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            int source, dest;
            switch (pilih) {
                case 'a':
                    System.out.print("Masukkan jenis graph (directed/undirected): ");
                    grph.jenis = sc.nextLine();
                    break;
                case 'b':
                    System.out.print("Masukkan jumlah vertex: ");
                    int vertex = sc.nextInt();
                    grph = new Tugas4_graph(vertex);
                    break;
                case 'c':
                    System.out.print("Masukkan source: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan destination: ");
                    dest = sc.nextInt();
                    grph.addEdge(source, dest);
                    grph.printGraph();
                    break;
                case 'd':
                    System.out.print("Masukkan source: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan destination: ");
                    dest = sc.nextInt();
                    grph.removeEdge(source, dest);
                    grph.printGraph();
                    break;
                case 'e':
                    grph.removeAllEdges();
                    grph.printGraph();
                    break;
                case 'f':
                    System.out.println("Anda keluar program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }
            System.out.println("");
        } while (pilih != 'f');
    }
}