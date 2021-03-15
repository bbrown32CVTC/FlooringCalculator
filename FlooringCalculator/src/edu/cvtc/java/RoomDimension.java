package edu.cvtc.java;

// Author: Bruce Brown
// Date: 2/24/2021
// Purpose: This class will set the length and
// width of the room using information provided
// by the user before calculating the area.



public class RoomDimension {

    //Attributes
    private double length;
    private double width;


    //Default Constructor
    public RoomDimension() {
        this.length = 0.0;
        this.width = 0.0;
    }

    //Overloaded Constructor
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }


    //Methods
    public double getLength(){

        return length;
    }

    public double getWidth() {

        return width;
    }

    public double getArea () {

        return length * width;
    }


    //toString Override Method
    @Override
    public String toString() {

        String retVal = "Length: " + length +
                "\nWidth: " + width +
                "\nArea: " + getArea();

        return retVal;
    }
}
