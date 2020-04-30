/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Abdulloh Aqil
 */
public class DoubleLikedListMain {
      public static void main(String[] args){
     try {
            DoubleLikedList oyi = new DoubleLikedList();
//            oyi.addLast(50);
//            oyi.addLast(40);
//            oyi.addLast(10);
//            oyi.addLast(20);
            oyi.print();
            System.out.println("Size: "+oyi.size());
            System.out.println("=================================================");
            oyi.addFirst(3);
            oyi.addLast(4);
            oyi.addFirst(7);
            oyi.removeFirst();
            oyi.print();
            System.out.println("Size: "+oyi.size());
            System.out.println("=================================================");
            oyi.add(40, 1);
            oyi.removeLast();
            oyi.print();
            System.out.println("Size: "+oyi.size());
            System.out.println("=================================================");
            //oyi.clear();
//            oyi.remove(1);
//            oyi.print();
//            System.out.println("Size: "+oyi.size());
            System.out.println("Data awal pada Linked list adalah: "+oyi.getFirst());
            System.out.println("Data akhir pada Linked list adalah: "+oyi.getLast());
            System.out.println("Data index ke-1 pada Linked list adalah: "+oyi.get(1));
        } catch (Exception ex) {
            Logger.getLogger(DoubleLikedListMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
