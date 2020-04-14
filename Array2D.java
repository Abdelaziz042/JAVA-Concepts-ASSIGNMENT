package com.company;

public class Array2D
{
    /**
     * Attributes for Class Array2D
     * by composing/ using an object of class Array we did use.
     */
    private Array ArrayTwoDiemensional;
    private int row;
    private int column;

    /**
     * Parameterized Constructor to initialize a 2d array
     * @param r an integer value to set the number of rows of the array
     * @param c an integer value to set the number of columns of the array
     */
    public Array2D(int r, int c){
        this.ArrayTwoDiemensional= new Array(r*c);
        row=r;
        column=c;
    }

    /**
     * Replace/Add a value at certain location.
     * @param r an integer value indicates the row location
     * @param c an integer value indicates the column location
     * @param number an integer value to put in the Array
     */
    public void add(int r, int c , int number) {
        int index = r* column+ c;
        ArrayTwoDiemensional.addElement(index,number);
    }

    /**
     * Utility function to add elements in 2D array as 1D array by following  Row Major Order
     * @param index integer value of the location
     * @param number integer value to be added
     */
    public void addAs1D(int index ,int number){
        ArrayTwoDiemensional.addElement(index,number);
    }

    /**
     *
     * @param r an integer value indicates the row location
     * @param c an integer value indicates the column location
     * @return the value at location index
     */
    public int Fetch(int r ,int c) {
        int index = r* column+ c;
        return ArrayTwoDiemensional.elementAt(index);
    }
}
