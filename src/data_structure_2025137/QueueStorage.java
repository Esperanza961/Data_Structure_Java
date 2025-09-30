/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structure_2025137;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Esperanza
 */
public class QueueStorage implements StorageUnit {
    //Implements FIFO logic using a Queue
    private final int capacity = 8; //Declare a variable
    private FoodItem[] food; //the array
    private int front;
    private int rear;
    
    //constructor
    public QueueStorage(){
        food = new FoodItem [capacity];
        front = -1;
        rear = -1;
    }

//Methods to declare the two bolleans full and empty
    @Override
    public boolean isFull(){
        return rear ==capacity -1;
    }
    @Override
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    
    //Methods to declare the action of the object
    @Override
    public void addItem(FoodItem item){
        if(isFull()){
            System.out.println("STORAGE IS FULL!! Cannot add more items.");
            System.out.println();
        }else{
            if (front==-1){
                front=0;
            }
            rear++;
            food[rear]=item;
            System.out.println(item.getName().toUpperCase()+" added to the queue, tray number: " + rear);
            System.out.println();
        }
    }
    @Override
    public FoodItem removeItem(){
        if(isEmpty()){
            System.out.println("The storage is Empty!!");
            System.out.println();
            return null;
        }
        FoodItem removed = food[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front++;
            }
        System.out.println(removed.getName().toUpperCase()+" removed!");
        System.out.println();
        return removed;
    }
    @Override
    public FoodItem peekItem(){
        if(isEmpty()){
            System.out.println("The storage is Empty.");
            System.out.println();
            return null;
        }
        System.out.println("The front Tray is: ["+front+"]");
        return food[front];
    }
    @Override
    public void displayItem(){
        if(isEmpty()){
            System.out.println("The storage is empty.");
            System.out.println();
        }else{
            System.out.println("--------ITEMS IN QUEUE--------");
            for (int i =front; i<=rear; i++){
                System.out.println("Tray index ["+i+"]");
                food[i].displayInfo();
                System.out.println();
            }
        }
    }
}
