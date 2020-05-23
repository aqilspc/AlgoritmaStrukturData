/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Tugas6_node<T> {
    T data;
    Tugas6_node<T> prev;
    Tugas6_node<T> next;

    Tugas6_node(Tugas6_node prev, T data, Tugas6_node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
