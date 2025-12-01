package DSA;



public class StackArr {
    private int[] elements;
    private int top;

    public StackArr(int capacity) {
        elements = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        // capacity will exceed
        if(top == elements.length -1) {
            throw new IllegalStateException("Stack is full");
        }
        //top = top + 1;
        /*
            // Approach 1
            top++;
            elements[top] = value;
        */
        // Prefix
        elements[++top] = value;
    }

    public int pop() {
        if(top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        /*
            // Approach 1
            int value = elements[top];
            top--;
            return value;
         */

        return elements[top--];
    }

    // Implement: Peek in a Stack


    // toString -> iterate over each element,
    // and print the value at each index

}
