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
public class calcu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        
        System.out.println("Enter Arithmetics:");
        int x = input.nextInt();
        
        if (x == 1)
        {
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        
        System.out.print("The Sum of Two Number is: " + sum);
        }
        
        else if (x == 2)
        {
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        int diff = num1 - num2;
        
        System.out.print("The Difference of Two Number is: " + diff);
        }
        
        else if (x == 3)
        {
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        int prod = num1 * num2;
        
        System.out.print("The Product of Two Number is: " + prod);
        }
        
        else if (x == 4)
        {
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        int qou = num1 / num2;
        
        System.out.print("The Qoutient of Two Number is: " + qou);
        }
        
        else 
        {
        System.out.print("Ayusin mooo");
        }
    }

}