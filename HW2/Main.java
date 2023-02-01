package HW2;

public class Main {
    public static void main(String[] args) {
        // Create new Generic Stack object
        GenericStack<String> myStack = new GenericStack<String>();

        // Push items onto the stack
        myStack.push("Boston");
        myStack.push("Las Vegas");
        myStack.push("New York");
        myStack.push("Providence");

        // Print the stack to the console
        System.out.println(myStack.toString());
    }
}
