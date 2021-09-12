package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class PizzaParty
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("How many people? ");
        int numPeople = input.nextInt();  // Read user input
        System.out.print("How many pizzas do you have? ");
        int numPizzas  = input.nextInt();  // Read user input
        System.out.print("How many slices per pizza? ");
        int numSlices  = input`                                                             q.nextInt();  // Read user input
        int totalSlices = numPizzas *  numSlices;
        int slicesGiven = totalSlices / numPeople;
        int leftOverSlices =  totalSlices % numPeople;
        String output1 = String.format("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.", numPeople, numPizzas, totalSlices, slicesGiven, leftOverSlices);
        System.out.println(output1);
        input.close();
    }
}
