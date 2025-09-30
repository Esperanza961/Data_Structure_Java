/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data_structure_2025137;

/**
 *
 * @author Esperanza
 */
public interface StorageUnit {
    //Interface contains static constants and abstract methods. So we will creat Method that would be as standars for other classes
    //This is like a contract for any storage or class that have to implement them
    //These methods no need body, the body will be in the class
    
    void addItem(FoodItem item); //void means it doesn't return anything—it just performs the action.
    FoodItem removeItem(); // It returns the FoodItem that was removed.
    FoodItem peekItem();
    void displayItem();
    boolean isFull();
    boolean isEmpty();
}
