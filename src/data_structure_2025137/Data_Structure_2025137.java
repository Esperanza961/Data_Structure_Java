/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data_structure_2025137;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Esperanza
 */
public class Data_Structure_2025137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //variables
        Scanner scanner = new Scanner(System.in); //calling the scaner object
        StorageUnit storage; //declaration of a variable named storage that can hold a reference to any object that implements the StorageUnit interface.
        int choice = 0;
        int option = 0;
        
        //******************FIRST MENU********************
        
        
        //Show the main OPTIONS of data structure
        while (choice < 1 || choice > 3 ){
            System.out.println("**********Choose storage mode**********"); // give to the chef the options
            System.out.println("1 for Stack (FILO)");
            System.out.println("2 for Queue (FIFO)");
            System.out.println("3 for Circular Queue (optional)");
            System.out.println("***************************************");
            System.out.println("Please make your choice.");
        
            // Check if input is an integer
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice <1 ||  choice > 3){
                    System.out.println("Invalid! Please enter 1,2 or 3.");
                    System.out.println();
                }
            }else{
                System.out.println("Invalid! Please enter a number");
                System.out.println();
                scanner.nextLine(); // discard invalid input
            }
        }
        
        
        // Assign the correct storage type
        if(choice==1){
            storage = new StackStorage();
            System.out.println("---TYPE: " + storage.getClass().getSimpleName().toUpperCase()+" ---");

        }else if(choice==2){
            storage = new QueueStorage();
            System.out.println("---TYPE: " + storage.getClass().getSimpleName().toUpperCase()+" ---");

        }else{
            storage = new CircularQueueStorage();
            System.out.println("---TYPE: " + storage.getClass().getSimpleName().toUpperCase()+" ---");

        }
        
        
        //create the main Method while if the option is ==choice
        while (true){
            System.out.println("**********Menu:**********");
            System.out.println("1. Add Food Item.");
            System.out.println("2. Remove Food Item.");
            System.out.println("3. Peek Top Item.");
            System.out.println("4. Display all Items.");
            System.out.println("5. Exit.");
            System.out.println("*************************");
            
            
            // Check if input is an integer
            if (scanner.hasNextInt()){
                option = scanner.nextInt();//Declare the variable option
                scanner.nextLine();
                if (option <1 ||  option > 5){
                    System.out.println("Invalid! Please select and option from the menu.");
                    System.out.println();
                }else{
                    switch (option){
                        case 1:
                            System.out.println("Enter food name (Burger, Pizza, Fries, Sandwich, Hotdog): ");
                            String name = scanner.nextLine();
                            System.out.println("Enter weight in grams: ");
                            double weight = scanner.nextDouble();

                            //(?i) makes it case-insensitive (so "burger" or "BURGER" both work)
                            if (weight <= 0 || !name.matches("(?i)Burger|Pizza|Fries|Sandwich|Hotdog")){
                                System.out.println("Invalid data! Try again.");
                                System.out.println();
                            }else{
                                FoodItem item = new FoodItem(name, weight);
                                storage.addItem(item);
                            }
                            break;

                        case 2:
                            FoodItem removed= storage.removeItem();
                            if (removed != null){
                                removed.displayInfo();
                            }
                            break;

                        case 3:
                            FoodItem top = storage.peekItem();
                            if (top != null){
                                top.displayInfo();
                            }
                            break;

                        case 4:
                            storage.displayItem();
                            break;

                        case 5:
                            System.out.println("Exiting application...");
                            return;
                        default:
                            System.out.println("Invalid option");
                    }
                }
                
            }else{
                System.out.println("Invalid! Please enter a number");
                scanner.nextLine(); // discard invalid input
            }
        }
  }
}
