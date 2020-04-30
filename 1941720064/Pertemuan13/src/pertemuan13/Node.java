/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author Abdulloh Aqil
 */
public class Node {
     int data;
    Node prev, next;

    public Node(Node prev, int data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
