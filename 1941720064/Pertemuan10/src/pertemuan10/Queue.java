/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author Abdulloh Aqil
 */
public class Queue {
    static int max;
    static int Q[];
    static int rear;
    static int size;
    static int front;
  public Queue (int n){
    max=n;
    Create();
}

    private void Create() {
       Q=new int[max];
       size = 0;
       front = rear -1;
    }
  public boolean IsEmpty(){
  if(size == 0){
  return true;
  }else{
  return false;
  }
  }
  public boolean IsFull(){
  if (size == max){
  return true;
  }else{
  return false;
  }
  }
  public void peek(){
  if (!IsEmpty()){
      System.out.println("Element ada di : "+ Q[front]);
  }else{
      System.out.println("Antrian kosonh");
  }
  }
  
  public void peek_rear(){
  if (!IsEmpty()){
      System.out.println("Data trakhir ada di : "+ Q[rear]);
  }else{
      System.out.println("Antrian kosonh");
  }
  }
  
  public void print(){
  if(IsEmpty()){
      System.out.println("Antrian Kosong");
  }else{
  int i = front;
  while (i != rear){
      System.out.println(Q[i]+" ");
      i = (i+1) % max;
  }
      System.out.println(Q[i]+" ");
      System.out.println("Jumlah Antrian = "+ size);
  }
  }
  public void Enqueue(int data){
  if (IsFull()){
      System.out.println("Antrian Penuh");
  }else{
      if(IsEmpty()){
      front = rear = 0;
      }else{
          if (rear == max -1){
          rear =0;
          }else {
          rear++;
          }
      }
      Q[rear] = data;
      size++;
  }
  }
  public int Dequeue(){
  int data =0;
  if (IsEmpty()){
      System.out.println("Anrian kosong");
  }else{
  data = Q[front];
  size--;
  if (IsEmpty()){
  front = rear = -1;
  }else{
      if (front == max -1){
      front =0;
      }else{
      front++;
      }
  }
  }
  return data;
  }
  
}
