/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Tugas4_node {
    int data;
    Tugas4_node prev;
    Tugas4_node next;

    Tugas4_node(Tugas4_node prev, int data, Tugas4_node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
