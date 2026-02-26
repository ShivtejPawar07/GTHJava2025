/*2) Valid Parentheses 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if 
the input string is valid. 
A string is valid if: 
 Open brackets are closed by the same type. 
 Open brackets are closed in the correct order. 
Example 
Input: "()[]{}" → true 
Input: "(]" → false */

import java.util.Scanner;
import java.util.Stack;

class ValidParentheses {
    public static void main(String[] x) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets:");
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else {
                if (stack.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    System.out.println("False");
                    return;
                }
            }
        }

        if (stack.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
