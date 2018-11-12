package io.github.actar233;

import java.util.Stack;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < len; i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < len; i++) {
            if (!stack.pop().equals(str.charAt(i))) return false;
        }

        return true;
    }
}
