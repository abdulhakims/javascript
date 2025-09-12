/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.abdul;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class cafteria_easymode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int hot = 25;
        int sio = 14;
        int coke = 20;
        int zest = 15;

        double snackTotal = 0;
        double drinkTotal = 0;
        
        boolean ordering = true;
        
        while (ordering){
        System.out.println("CAFETERIA");
        System.out.println("Menu!");
        System.out.println("[Snacks]");
        System.out.println("[1] Hotdog [25.00]");
        System.out.println("[2] Siomai [14.00]");
        System.out.print("Enter your snack choice: ");
        int snackChoice = input.nextInt();

        // Snacks
        if (snackChoice == 1) {
            System.out.print("Enter Quantity for Hotdog: ");
            int quan = input.nextInt();
            snackTotal = quan * hot;
        } else if (snackChoice == 2) {
            System.out.print("Enter Quantity for Siomai: ");
            int quan = input.nextInt();
            snackTotal = quan * sio;
        }

        // Ask for drinks
        System.out.println("\nWould you like a drink?");
        System.out.println("[1] Coke [20.00]");
        System.out.println("[2] Zest-O [15.00]");
        System.out.println("[0] No drink");
        System.out.print("Enter your choice: ");
        int drinkChoice = input.nextInt();

        if (drinkChoice == 1) {
            System.out.print("Enter Quantity for Coke: ");
            int quan = input.nextInt();
            drinkTotal = quan * coke;
        } else if (drinkChoice == 2) {
            System.out.print("Enter Quantity for Zest-O: ");
            int quan = input.nextInt();
            drinkTotal = quan * zest;
        }
        
         // Ask if they want to order again
        System.out.println("\nDo you want to order again?");
        System.out.println("[1] Yes");
        System.out.println("[0] No, proceed to payment");
        System.out.print("Enter choice: ");
        int again = input.nextInt();
        
        if (again == 0){
            ordering = false;
        }
        }

        // Compute total
        double subtotal = snackTotal + drinkTotal;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Tax 12%: " + vat);
        System.out.println("Total: " + total);

        // Payment
        System.out.print("Enter your cash: ");
        int csh = input.nextInt();
        while (csh < total) {
            System.out.println("Insufficient cash. Please enter again:");
            csh = input.nextInt();
        }

        double change = csh - total;
        System.out.println("Your change is: " + change);
        System.out.println("Thank you for your order!");
    }

    }

    

