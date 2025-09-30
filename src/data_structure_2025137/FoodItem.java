/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structure_2025137;

import java.time.LocalDate;

/**
 *
 * @author Esperanza
 */
//This class defines what every food item should have: a name, weight, and best-before date.
public class FoodItem {
    //declare data as a private to encapsulate it, this will protect the internal data, usesing just in this class
    private String name;
    private double weight; //in grams
    private LocalDate BestBeforeDate;
    private LocalDate DatePlaced;
    
    //Contructor and this is Public so that other classes can create objects from it
    public FoodItem(String name, double weight){
        this.name=name;
        this.weight=weight;
        this.DatePlaced= LocalDate.now();
        this.BestBeforeDate = DatePlaced.plusWeeks(2); // 2 weeks later
    }
    
    // Validation Method: check if still valid today
    public boolean isValid() {
        return !LocalDate.now().isAfter(BestBeforeDate);
    }
    
    //Define the Methods Getters
    public String getName(){
    return name;
    }
    public double getWeight(){
    return weight;
    }
    public LocalDate getDatePlaced(){
    return DatePlaced;
    }
    public LocalDate getBestBeforeDate(){
    return BestBeforeDate;
    }
    
    
    // Display method
    public void displayInfo() {
        System.out.println("️--------Food Tray Details--------");
        System.out.println("Name        : " + name);
        System.out.println("Weight      : " + weight + "g");
        System.out.println("Best Before : " + BestBeforeDate);
        System.out.println("Time Placed : " + DatePlaced);
        System.out.println("Valid Tray  : " + isValid());
        System.out.println("----------------------------------");
        System.out.println();
    }
}

