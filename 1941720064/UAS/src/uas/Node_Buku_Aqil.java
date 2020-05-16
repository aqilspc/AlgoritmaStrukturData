/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Abdulloh Aqil
 */
public class Node_Buku_Aqil {
     Buku_Aqil data = new Buku_Aqil();
    Node_Buku_Aqil prev, next;

    public Node_Buku_Aqil(Node_Buku_Aqil prev, Buku_Aqil data, Node_Buku_Aqil next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
