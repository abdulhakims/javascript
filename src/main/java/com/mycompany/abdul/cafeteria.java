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
public class cafeteria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("cafeteria!");
        System.out.println("Menu!");
        System.out.println("[Snacks]");
        System.out.println("[1] Hotdog [25.0]");
        System.out.println("[2] Siomai [14.00]");
        System.out.println("Drinks");
        System.out.println("cafeteria!");
        System.out.println("cafeteria!");
        System.out.println("Enter your choice:");

        int Snacks = input.nextInt();
        int hot = 25;

        if (Snacks == 1) {
            System.out.println("Hotdog price is [25] pesos");
            System.out.println("Enter Quantity:");
            int quan = input.nextInt();
            int quan1 = quan * hot;

            System.out.println("Subtotal: " + quan1);
            System.out.println("Tax 12%");
            double vat = quan1 * 0.12;
            double total = vat + quan1;

            System.out.println("Total: " + total);
            System.out.println("Enter your cash: ");
            int csh = input.nextInt();

            while (csh < total) {
                System.out.println("Insufficient cash. Please enter again:");
                csh = input.nextInt();
            }

            double change = csh - total;
            System.out.println("Your change is: " + change);
        }
    
    }

}