package Data_Structure;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String>  stack = new Stack<String>();

        stack.push("Mine Craft");
        stack.push("Sky");
        stack.push("Doom");
        stack.push("BorderLands");
        stack.push("FFVII");

        String myFavGame = stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.search("BorderLands"));
    }
}
