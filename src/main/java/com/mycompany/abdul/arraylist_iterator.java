/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.abdul;

/**
 *
 * @author CL1-PC32
 */
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist_iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       	// Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while(it.hasNext()) {
      System.out.println(it.next());
      
    }
    }
}
