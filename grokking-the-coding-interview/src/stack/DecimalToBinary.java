package stack;

import java.util.Stack;

public class DecimalToBinary {

    public static void main(String args[]){
        int i=7;

        String binary=decimalTOBinary(i);
        System.out.println("Binary of "+i+" is: "+binary);
    }

    private static String decimalTOBinary(int i){
        StringBuilder binary = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        while(i>0){
            int rem= i%2;
            stack.push(rem);
            i=i/2;
        }
        for(Integer bit : stack){
            binary.append(bit);
        }
        return binary.toString();

    }

}
