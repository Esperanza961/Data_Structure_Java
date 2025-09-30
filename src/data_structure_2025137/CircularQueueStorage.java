/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structure_2025137;

/**
 *
 * @author Esperanza
 */
public class CircularQueueStorage implements StorageUnit {
    private final int capacity = 8; //Declare a variable
    private FoodItem[] food; //the array
    private int front;
    private int rear;
    private int size;
    
    //constructor
    public CircularQueueStorage(){
        food = new FoodItem [capacity];
        front = 0;//Points to the first item so -1 is no item so nothint to point
        rear = -1;
        size = 0;
    }

//Methods to declare the two bolleans full and empty
    @Override
    public boolean isFull(){
        return size==capacity;
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    
    //Methods to declare the action of the object
    @Override
    public void addItem(FoodItem item){
        if(isFull()){
            System.out.println("STORAGE IS FULL!!. Cannot add more items.");
            System.out.println();
            return;
        }
        rear = (rear + 1) % capacity;
        food[rear]=item;
        size++;
        System.out.println(item.getName().toUpperCase()+" added to the queue.");
        System.out.println();
        }
    @Override
    public FoodItem removeItem(){
        if(isEmpty()){
            System.out.println("The storage is Empty.");
            System.out.println();
            return null;
        }
        FoodItem removed = food[front];
        food[front] = null; // remove the current front
        front = (front +1) %capacity;//the front will move anter it has been removed
        size--;//the size of this array decrease one
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
        System.out.println("The tray index is: ["+front+"]");
        System.out.println();
        return food[front];
    }
    @Override
    public void displayItem(){
        if(isEmpty()){
            System.out.println("The storage is empty.");
            System.out.println();
        }else{
            System.out.println("--------ITEMS IN CIRCULAR--------");
            for (int i =0; i<size; i++){
                int index=(front+i)%capacity;
                System.out.println("The index ["+index+"] ");
                food[index].displayInfo();
            }
        }
    }
}
