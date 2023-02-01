package HW2;

import java.util.ArrayList;

public class GenericStack<T> extends ArrayList<T> {
    
    // View the item at the top of the stack
    public T peek() {
        return get(size() - 1);
    }

    // Add an item to the stack
    public void push(T i) {
        add(i);
    }

    // Remove the item at the top of the stack
    public T pop() {
        T i = get(size() - 1);
        remove(size() - 1);
        return i;
    }
 
    // Return a string that details the contents of the stack
    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
