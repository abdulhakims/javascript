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
public class Ageviri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Age:");
        int x = input.nextInt();
        
        if (x <= 17)
        {
        System.out.print("Unable to vote");
        }
        else if (x >= 18)
        {
        System.out.print("Able to Vote");
        }
        else
        {
        System.out.print("Pakulot kulot kaaa");
        }
    }

}