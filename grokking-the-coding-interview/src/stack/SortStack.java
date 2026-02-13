package stack;

import java.util.Stack;

public class SortStack {
    public  static void main(String[] args) {
        // You can implement the sort stack logic here
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(12);
        inputStack.push(5);
        inputStack.push(8);
        inputStack.push(1);
        inputStack.push(3);
        System.out.println("Original Stack: " + inputStack);
        sortStack(inputStack);
    }

    public static  void sortStack(Stack<Integer> st) {
        // Sorting logic to be implemented
        Stack<Integer> tempStack = new Stack<>();
        while(!st.isEmpty()){
            int curr=st.pop();
            while(!tempStack.isEmpty() && tempStack.peek()>curr){
                st.push(tempStack.pop());
            }
            tempStack.push(curr);
        }
        System.out.println("Sorted Stack: " + tempStack);
    }
}
