package Claas4.MorningSession;

import java.util.ArrayList;

public class CustomQueue<T> {
    //Initialize Variables:
    //  queueLength: Set the default size of the queue to 3.
    //  items: An integer array that will store the elements of the queue.
    //  front and back: Pointers to help manage the queue's front and back, whose default value is -1. (indexes of front and back elements)

    private int queueLength;
    private ArrayList<T> elements;
    private int front;
    private int back;

    public CustomQueue(int size) {
        queueLength = size;
        elements = new ArrayList<>(queueLength);
        front = -1;
        back = -1;
    }

   // Define Helper Functions:
    //  isEmpty(): Checks if the queue is empty. Returns true if it is, otherwise returns false.
    //  isFull(): Checks if the queue is full. Returns true if it is, otherwise returns false.
    public boolean isEmpty(){
        return front ==-1;
    }
    public boolean isFull(){
        return (back== queueLength-1)&&(front==0);
    }
    //ueue Operations:
    //  enQueue(int itemValue): Adds an item to the back of the queue.
    //  If the queue is full, it should display a message "Queue is full".
    //  deQueue(): Removes the front item from the queue.
    //  If the queue is empty, it should display a message "Queue is empty. Nothing to dequeue".

    public void enQueue(T elementValue){
        if(isFull()){
            System.out.println("Queue is full" + elementValue);
        }else{
            if (front == -1) {
                front = 0;
            }
            elements.add(elementValue);
            back++;

            System.out.println("Enqueued: " + elementValue);
        }
    }
    public T  deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue");
            return null;
        }else {
            T removedElement = elements.get(front);
            if (front == back) {
                front = back = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued" + removedElement);
            return  removedElement;
        }
    }
    //Display and Access Functions:
    //  display(): Displays all the items present in the queue from front to back.
    //  peak(): Displays the front item of the queue without removing it.
    public  void display() {
        if (isEmpty()){
            System.out.println("Nothing here");
        }else {
            System.out.println("Elements of Queue are ");
            for (int i = front; i < back+1; i++) {
                System.out.println(elements.get(i));
            }
        }
    }
    public T peek(){
        System.out.println("Front elemets"+ elements.get(front));
        return elements.get(front);
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue=new CustomQueue<>(5);

        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(15);
        queue.display();
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.display();


        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();


        queue.display();

        queue.peek();

       ;
    }
}
