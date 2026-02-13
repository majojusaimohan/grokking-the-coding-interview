package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr1[] = {4, 5, 2, 25};
        int arr2[] = {1, 4, 5, 2, 9, 25, 45};

        int[] ans = extGreaterElement(arr1, arr2);
        for (int val : ans) {
            System.out.print(val + " ");
        }

    }

    public static int[] extGreaterElement(int[] arr1, int[] arr2) {
        int[] result = new int[arr2.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr2.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                result[i] = -1;
                stack.push(arr2[i]);
                continue;
            }

            while ( !stack.isEmpty() && stack.peek() <= arr2[i]) {
                stack.pop();
            }

            if (stack.peek() > arr2[i]) {
                result[i] = stack.peek();
            }

            stack.push(arr2[i]);

        }
    int j=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==arr1[j]){
                arr1[j++]=result[i];

            }
        }

        return arr1;

    }
}
