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
public class Tugas2 {
    int vertex;
    LinkedLists list[];

    public Tugas2(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i=0; i <vertex ; i++){
            list[i]= new LinkedLists();
        }
    }
    
    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back edge (for undirected)
        list[destination].addFirst(source);
    } 
    
    public void degree (int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        //degree directed graph
            //inDegree
        int k,totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
        for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j)==source) 
                    ++totalIn;
                
            }
        for (k = 0; k < list[source].size(); k++) {
            list[source].get(k);
        }
        totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("degree vertex "+source +" : "+(totalIn+totalOut));
    }
    
    public void removeEdge (int source,int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (1==destination) {
                list[source].remove(destination);                
            }
        }
    }
    
    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                System.out.print("vertex "+ i + " terhubung dengan: ");
            for (int j = 0; j < list[i].size(); j++) { 
                System.out.print(list[i].get(j) + " ");  
            }
            System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public boolean graphType(int num) { 
        if (num == 0) { 
            return false; 
        } else if (num == 1) { 
            return true; 
        } else { 
            return true; 
        } 
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tugas2 grph = new Tugas2(6);
        System.out.print("Input Graph type (0=directed, 1 = undirected): ");
        int pill = sc.nextInt();
        System.out.println(grph.graphType(pill));
        grph.addEdge(0, 1);
        grph.addEdge(0, 4);
        grph.addEdge(1, 2);
        grph.addEdge(1, 3);
        grph.addEdge(1, 4);
        grph.addEdge(2, 3);
        grph.addEdge(3, 4);
        grph.addEdge(3, 0);
        grph.printGraph();
        grph.degree(2);
        grph.removeEdge(1, 2);
        grph.printGraph();
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
            } while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
        } while (pil.equalsIgnoreCase("y"));
        grph.printGraph();
    }
}
