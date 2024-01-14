/**
 * Problem: https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    public int lengthOfLastWord(String s) {
        // String[] words = s.split(" ");
        // return words[words.length - 1].length();
        int counter = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(counter == 0 && s.charAt(i) == ' ') continue;
            else if(s.charAt(i) == ' ') break;
            else counter++;
        }
        return counter;
    }
}
