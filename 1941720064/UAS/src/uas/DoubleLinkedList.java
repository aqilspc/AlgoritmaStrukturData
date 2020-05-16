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
public class DoubleLinkedList {
    int size;
    Node_Buku_Aqil head;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Buku_Aqil data) {
        if (isEmpty()) {
            head = new Node_Buku_Aqil(null, data, null);
        } else {
            Node_Buku_Aqil newNode = new Node_Buku_Aqil(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Buku_Aqil data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node_Buku_Aqil current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node_Buku_Aqil newNode = new Node_Buku_Aqil(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Buku_Aqil data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Kode indeks di luar batas");
        } else {
            Node_Buku_Aqil current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node_Buku_Aqil newNode = new Node_Buku_Aqil(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node_Buku_Aqil newNode = new Node_Buku_Aqil(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print(Buku_Aqil data) {
        if (!isEmpty()) {
            Node_Buku_Aqil tmp = head;
            while (tmp != null) {
                System.out.println("==========================");
                System.out.println("Kode \t: " + tmp.data.kode);
                System.out.println("Judul \t: " + tmp.data.judul);
                System.out.println("Penerbit: " + tmp.data.penerbit);
                System.out.println("Stock \t: " + tmp.data.stock);
                System.out.println("Rusak \t: " + tmp.data.rusak);
                System.out.println("==========================");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node_Buku_Aqil current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("kode indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node_Buku_Aqil current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
     public void buku_keluar(int index) throws Exception {
        
            Node_Buku_Aqil current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
                current.data.stock--;
            }
            
            size--;
        }
     
      public void buku_rusak(int index,int jumlah) throws Exception {
        
            Node_Buku_Aqil current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
                current.data.rusak +=jumlah;
            }
            
            size--;
        }
    
    

    public void get(String judul) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node_Buku_Aqil tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (judul.equals(tmp.data.judul)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data : " + judul + " ditemukan pada indeks ke: " 
                    + i + " dengan kode " + tmp.data.kode);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void cek_buku_penerbit(String penerbit) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node_Buku_Aqil tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (penerbit.equals(tmp.data.penerbit)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Penerbit buku : " + penerbit + " dengan judul " + tmp.data.judul);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
     public void cek_buku_kode(int kode) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node_Buku_Aqil tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (kode==tmp.data.kode) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Buku dengan kode : " + tmp.data.kode + "Sudah Ada: " 
                 + " dengan judul " + tmp.data.judul);
            
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void sort() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node_Buku_Aqil tmp;
        int swap;
        do {
            swap = 0;
            tmp = head;

            while (tmp.next != null) {
                if (tmp.data.kode < tmp.next.data.kode) {
                    Buku_Aqil temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                    swap = 1;
                }
                tmp = tmp.next;
            }
            tmp = null;
        } while (swap != 0);
    }
}
