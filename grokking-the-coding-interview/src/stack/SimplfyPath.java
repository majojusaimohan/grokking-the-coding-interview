package stack;

import java.util.Stack;

public class SimplfyPath {
    public static void main(String args[]){
        String path="/a//b////c/d//././/..";
        String simplifiedPath=simplifyPath(path);
        System.out.println("Simplified Path: "+simplifiedPath);
    }

    public static String simplifyPath(String path){

        String parts[]=path.split("/");
        Stack<String> stack=new Stack<>();

        for(String part: parts){
            if(part.equals("") || part.equals(".")){
                continue;
            } else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        return "/"+String.join("/",stack);
    }
}
