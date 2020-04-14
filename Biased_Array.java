package com.company;

class Biased_Array extends Array{

    private int bias;
    private int upperLimit;

    /** Constructor that takes two integer parameters
     *  @param size declare the size of the array
     * @param bias to declare the beginning of the array
     */

    public Biased_Array(int size , int bias) {
        super(size);
        this.bias = bias;
        upperLimit=bias+size;
    }

    /** overriding the method (elementAt)
     *  Add element at specific index
     * @param index an integer value indicates the location of the value to be returned
     * @return array[location-bias]
     */
@Override

public int elementAt(int index) {
    int realIndex=index-bias;
    if (index >= upperLimit || index < bias)
        throw new ArrayIndexOutOfBoundsException("Your position is out of range!");
    else return array[realIndex];
}

    /** Add element at specific index
     * @param index an integer value indicates the location of the value to inserted
     * @param number an integer value to be inserted
     */

    @Override
    public void addElement(int index, int number){
        int realIndex=index-bias;
        if (index >= upperLimit || index < bias )
            throw new ArrayIndexOutOfBoundsException("Your position is out of range!");
        else
            array[realIndex] = number;
    }
}