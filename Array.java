package com.company;
// Mostafa Esmail      20180275    #3 (+Biased)      Integrating the two classes together into ArrayList.
// Omar Abdelaziz      20180178    #1 (+2D Array)    Creating Class Account and its Derived Class aka Class Special Account.
// Youssef Gamal       20180340    #2 (+Queue)       Creating Class Client  and its Derived Class aka Class Commercial Account.
public class Array
{
    /**
     * Attributes for Class Array
     */
    protected int increment; // incremental number to be added
    protected int[] array; // actual array contents

    /**
     * Creating an array of a specific size
     * @param limit integer value indicates the size
     */
    Array(int limit) // constructor
        {
            increment = limit; // use increment for limit
            array = new int[limit]; // create actual array
        }

    /**
     * Creating a new array with a big size.
     * @param desiredSize an integer value indicates the new size.
     */
    void ensure(int desiredSize) // make sure size is at least desiredSize
     {
            if( desiredSize > array.length )
            {
                int[] newArray = new int[desiredSize]; // create new array
                for( int i = 0; i < array.length; i++ )
                    newArray[i] = array[i]; // copy elements

                array = newArray; // replace array with new one
            }
        }

    /**
     * Add element at specific index
     * @param index an integer value indicates the location of the value to be returned
     * @return array[index]
     */
    public int elementAt(int index) {
            if (index >= array.length || index<0) //edited
                throw new ArrayIndexOutOfBoundsException("Your position is out of range!");
            return array[index];
        }

    /**
     * Add element at specific index
     * @param index location
     * @param number value to be inserted
     */
        public void addElement(int index , int number) {
            if (index >= array.length || index <0)
                throw new ArrayIndexOutOfBoundsException("Your position is out of range!");
            else
                array[index]=number;
        }

        public int ArraySize(){return array.length;}

}
