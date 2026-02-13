package stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class MaleGood {

    public static void main(String args[]) {
        String s = "leEeTcOdE";
        System.out.println(makeGood(s));
    }
    public  static  String makeGood(String s) {

        Stack<Character> st= new Stack<>();
        char[] temp= s.toCharArray();

        for(int i=0;i<temp.length;i++){
            if(!st.isEmpty() && Math.abs(st.peek()-temp[i])==32){
                st.pop();
            }
            else{
                st.push(temp[i]);
            }

        }

        return st.stream().map(Object::toString)
                .collect(Collectors.joining(""));

    }
}
