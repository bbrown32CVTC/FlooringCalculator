package edu.cvtc.java;

// Author: Bruce Brown
// Date: 2/24/2021
// Purpose: Application will calculate the price
// of flooring for rectangular rooms using the
// information provided by the user.

import java.util.Scanner;

public class FlooringCalculatorProgram {

    public static void main(String[] args) {

        // Declare variables
        double length;
        double width;
        double cost;
        RoomDimension roomSize;
        RoomFlooring room;

        // Create Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display message to user
        System.out.print("To get the price of flooring for your room, you must input the room's dimensions");

        // Prompt for information
        System.out.print("\nEnter the length of room: ");
        length = keyboard.nextDouble();

        System.out.print("\nEnter the width of room: ");
        width = keyboard.nextDouble();

        System.out.print("\nEnter the cost per square foot: ");
        cost = keyboard.nextDouble();

        // Assign objects
        roomSize = new RoomDimension(length, width);
        room = new RoomFlooring(roomSize, cost);

        // Display the room and cost information
        System.out.println();
        System.out.println(room);

        // Close the keyboard object
        keyboard.close();

    }

}
