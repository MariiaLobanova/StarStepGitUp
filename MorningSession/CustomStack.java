package Claas4.MorningSession;
//Create a custom stack class named CustomStack that operates on long data types. This stack should be implemented using an array and should provide basic stack operations.

//Requirements:
//
//Fields:
//    maxSize: An integer attribute to store the maximum size of the stack.
//    stackArray: A long array to store the elements of the stack.
//    top: An integer attribute to keep track of the top element's position in the stack.
//

//Constraints:
//    The push method should not push an element onto the stack if it's full.
//    The pop method should not pop an element from the stack if it's empty.
//    Assume that the maximum size of the stack will be a positive integer.
//
//Add proper exception handling to the push, pop, and peek methods.
// Throw exceptions like StackOverflowException when trying to push to a full stack
// and IllegalStateException when trying to pop from an empty stack.
public class  CustomStack <T>{
    int maxSize;
    Object[] stackArray;
    int top;

    //Constructor:
    ////    The constructor should accept an integer s, which indicates the maximum size of the stack.
    ////    Initialize maxSize with the value of s.
    ////    Initialize stackArray to a new long array with the size of maxSize.
    ////    Initialize top to -1, indicating that the stack is initially empty.

    public CustomStack(int s){
        maxSize =s;
        stackArray = new Object[maxSize];
        top =-1;
    }
    //Methods: Implement the following methods:
//    push(long j): Accepts a long value j and pushes it onto the top of the stack. Ensure that the stack does not overflow.
//    pop(): Removes and returns the top element of the stack. Ensure that the stack is not empty before popping.
//    peek(): Returns the top element of the stack without removing it.
//    isEmpty(): Returns true if the stack is empty, otherwise false.
//    isFull(): Returns true if the stack is full, otherwise false.

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public void push(T j) throws StackOverflowExeption {
        if (isFull()) {
            throw new StackOverflowExeption("Stack is full.");
        } else {
            stackArray[++top] = j;
        }
    }
    public T pop()throws IllegalStateException{
        if(isEmpty()){throw new IllegalStateException("Stack is empty");
    }else{
            T popedElement = (T) stackArray[top--];
            System.out.println("Popped element: " + popedElement);
            return popedElement;

        }
    }
    public T peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Top element is"+ stackArray[top]);
            return (T) stackArray[top];

        }
    }

    // Implement a size() Method:
    //    Add a method named size() that returns the current number of elements in the stack.

    public int size() {
        int sizeStack = top + 1;
        System.out.println("Size of stack:"+ sizeStack);
        return sizeStack;
    }

    // Add a toString Method:
    //    Override the toString method to return a string representation of the stack.
    //    The top of the stack should be on the right side of the output.
    //    For example, if the stack has elements [1, 2, 3] with 3 being the top,
    //    the method should return "1, 2, 3".

    @Override
    public String toString(){
        StringBuilder stackToString= new StringBuilder();
        for (int i = 0; i <=top; i++) {
            stackToString.append(stackArray[i]);
            if (i < top) {
                stackToString.append(", ");
            }
        }
        System.out.println(stackToString);
        return stackToString.toString();
    }
    public static void main(String[] args) throws StackOverflowExeption, IllegalStateException {

        CustomStack myStack = new CustomStack(5);
        CustomStack myStackName = new CustomStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.toString();

        myStackName.push("Maria");
        myStackName.push("Anton");
        myStackName.push("Eliza");
        myStackName.push("Leon");
        myStackName.toString();

        myStack.pop();
        myStack.pop();

        myStackName.pop();
        myStackName.pop();

        myStack.toString();
        myStackName.toString();






        myStack.peek();

        myStack.size();
        myStack.toString();


    }
}
