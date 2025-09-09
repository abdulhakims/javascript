/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abdul;
import java.util.Scanner;

/**
 *
 * @author CL1-PC34
 */
public class Abdul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissor");
        System.out.println("Enter Player 1:");
        int x = input.nextInt();
        System.out.println("Enter Player 2:");
        int y = input.nextInt();

        if (x==1 && y ==1)
        {
        System.out.println("Draw");
        }
        else if (x==1 && y ==2)
        {
        System.out.println("Player 2 wins");
        }
        else if (x==1 && y ==3)
        {
        System.out.println("Player 1 wins");
        }
        else if (x==2 && y ==1)
        {
        System.out.println("Player 1 wins");
        }
        else if (x==2 && y ==2)
        {
        System.out.println("Draw");
        }
        else if (x==2 && y ==3)
        {
        System.out.println("Player 2 wins");
        }
        else if (x==3 && y ==1)
        {
        System.out.println("Player 1 wins");
        }
        else if (x==3 && y ==2)
        {
        System.out.println("Player 2 wins");
        }
        else if (x==3 && y ==3)
        {
        System.out.println("Draw");
        }
        
    }
}
