/**
 * 
 * Problem: https://leetcode.com/problems/valid-parentheses/
 *
 */

class Solution {
    public boolean isValid(String s) {
        Stack characters = new Stack<Character>();
        for(Character c : s.toCharArray()) {
            switch(c) {
                case '}': 
                    if (characters.empty() || (char) characters.peek() != '{') return false;
                    else characters.pop();
                    break;
                case ']':
                    if (characters.empty() || (char) characters.peek() != '[') return false;
                    else characters.pop();
                    break;
                case ')':
                    if (characters.empty() || (char) characters.peek() != '(') return false;
                    else characters.pop();
                    break;
                default: 
                    characters.push(c);
                    break;
            }
        }
        return characters.empty();
    }
}
