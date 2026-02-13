package stack;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String args[]){
        String s="abbaca";
        String result=removeDuplicates(s);
        System.out.println("Resulting String: "+result);
    }

    public static String removeDuplicates(String s){
        Stack<Character> st= new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(!st.isEmpty() && st.peek()==c){
                st.pop();

            }
            else{
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
