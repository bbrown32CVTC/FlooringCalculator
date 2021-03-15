package edu.cvtc.java;

// Author: Bruce Brown
// Date: 2/24/2021
// Purpose: This class will calculate the cost
// of the room based on the room dimensions and
// the price per square foot provided by the user.



import java.text.DecimalFormat;

public class RoomFlooring {

    // Declare variables
    private double squareFootCost;
    private RoomDimension roomDimension;


    // Overloaded Constructor
    public RoomFlooring(RoomDimension roomDimension, double squareFootCost) {

        this.roomDimension = roomDimension;
        this.squareFootCost = squareFootCost;

    }

    // Methods
    public double getTotalCost() {

       return roomDimension.getArea() * squareFootCost;

    }


    //toString Override Method
    @Override
    public String toString() {

        DecimalFormat dollar = new DecimalFormat(("#,##0.00"));

        String retVal = "Room dimensions:\n" + roomDimension +
                "\nCost per square foot: $" + dollar.format(squareFootCost) +
                "\nFlooring cost: $" + dollar.format(getTotalCost());

        return retVal;
    }


}
