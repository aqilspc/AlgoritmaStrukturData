/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Tugas5_node {
    int data, weight;
    Tugas5_node prev;
    Tugas5_node next;

    Tugas5_node(Tugas5_node prev, int data, int weight, Tugas5_node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
