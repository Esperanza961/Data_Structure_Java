/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structure_2025137;

import java.util.Stack;

/**
 *
 * @author Esperanza
 */
public class StackStorage implements StorageUnit {
    //Implements FILO logic using a Stack
    private final int capacity = 8; // declare a variable that would be the limit. FINAL the value cannot be change
    private FoodItem[] food; //the array
    private int top;    //stack pointer
    
    //constructor
    public StackStorage(){
        food = new FoodItem [capacity];
        top = -1;
    }
        
    //Methods to declare the two bolleans full and empty
    @Override
    public boolean isFull(){
        return top == capacity -1;
    }
    @Override
    public boolean isEmpty(){
        return top == -1;
    }
    
    //Methods to declare the action of the object
    @Override
    public void addItem(FoodItem item) {
        if (isFull()){ //calling a method in this class
            System.out.println("STORAGE IS FULL!! Cannot add more items.");
        }else{
            food[++top] = item;
            System.out.println(item.getName().toUpperCase()+" added to the storage.");
            System.out.println();
        }
    }
    @Override
    public FoodItem removeItem() {   //the "FoodItem" is the type or retur
        if (isEmpty()){
            System.out.println("The Storage is Empty.");
            System.out.println();
            return null;
        }
        FoodItem removed = food[top--];// Remove and update top
        System.out.println(removed.getName().toUpperCase()+" removed!");
        System.out.println();
        return removed;
    }
    @Override
    public FoodItem peekItem(){
        if (isEmpty()){
            System.out.println("The Storage is Empty.");
            System.out.println();
            return null;
        }
        System.out.println("The top Tray is: ["+top+"]");
        System.out.println();
        return food[top];
    }
    @Override
    public void displayItem(){
        if (isEmpty()){
            System.out.println("The storage is Empty.");
            System.out.println();
        }else{
            System.out.println("--------ITEMS IN STACK--------");
            for (int i =0; i<=top;i++ ){
                System.out.println("Tray index ["+i+"]");
                food[i].displayInfo();
                System.out.println();
            }
        }
    }
}
