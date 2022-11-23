package P01StachsAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        ArrayDeque<Character> stack=new ArrayDeque<>();

        boolean isBalanced=true;
        for (int i = 0; i < input.length(); i++) {
            char current=input.charAt(i);

            if (current=='(' || current=='{' || current=='['){
                stack.push(current);
            }else {
                if (stack.isEmpty()){
                    isBalanced=false;
                    break;
                }
                char lastOpeningBracket=stack.pop();

                if (current==')' && lastOpeningBracket!='('){
                    isBalanced=false;
                    break;
                } else if (current==']' && lastOpeningBracket!='[') {
                    isBalanced=false;
                    break;
                } else if (current=='}' && lastOpeningBracket!='{') {
                    isBalanced=false;
                    break;
                }
            }
        }
        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
