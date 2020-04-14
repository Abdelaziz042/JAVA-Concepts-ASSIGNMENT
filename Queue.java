package com.company;
// Youssef Gamal       20180340    #2 (+Queue)       Creating Class Client  and its Derived Class aka Class Commercial Account.

public class Queue {
    /**
     * Attributes for Class Queue
     * by composing/ using an object of class Array we did use.
     */
    public Array QueueArray;
    private int Rear;  //  last  element in the queue
    private int Front; //  first element in the queue
    private int Size;

    /**
     * Constructor to create a queue of a certain capacity.
     * @param Capacity an integer values specifies the size of the queue.
     */
    Queue(int Capacity)
    {
        QueueArray = new Array(Capacity);
        Size = Capacity;
        Rear = -1;
        Front = -1;
        // Queue is empty when both rear and front are -1
    }

    /**
     * Boolean function to check whether the Queue is full or not
     * @return boolean zero or one
     */
    public boolean IsFull()
    {
        if( (Rear + 1) % Size == Front) return true;
        else return false;
    }
    /**
     * Boolean function to check whether the Queue is empty or not
     * @return boolean zero or one
     */
    public boolean IsEmpty()
    {
        if( Front == -1 && Rear == -1) return true;
        else return false;
    }

    /**
     * Adding Elements to the queue
     * @param Value an integer values specifies the value to be inserted in the queue.
     */
    public void Queueing(int Value)
    {
        if(IsFull())
        {
            System.out.println("- Your Queue is Full !, You can't add new element. ");
            return; // to exit/break the function
        }

        else if(IsEmpty()) Front = Rear = 0 ;

        else Rear = (Rear + 1) % Size;

        QueueArray.addElement(Rear,Value);
    }
}
