package stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveStars {


    public static void main(String args[]){
        String s="leet**cod*e";
        RemoveStars rs= new RemoveStars();
        String result= rs.removeStars(s);
        System.out.println("Resulting String: "+result);
    }

    public String removeStars(String s) {

        char schar[]= s.toCharArray();
        Stack<Character> st= new Stack<>();

        for(int i=0;i<schar.length;i++){
            if( !st.isEmpty() &&schar[i]== '*'){
                st.pop();
            }
            else{
                st.push(schar[i]);
            }
        }
        return st.stream().map(Object::toString)
                .collect(Collectors.joining(""));

    }
}
