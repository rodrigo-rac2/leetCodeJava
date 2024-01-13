/*
* Problem: https://leetcode.com/problems/first-unique-character-in-a-string/
*/

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> letterCounter = count(s);
        for(int i = 0; i < s.length(); i++) {
            if(letterCounter.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    private HashMap<Character,Integer> count(String input) {
        HashMap<Character,Integer> counter = new HashMap<>(); 
        for(Character c: input.toCharArray()) {
            if(counter.containsKey(c)) counter.put(c, counter.get(c) + 1);
            else counter.put(c,1);
        }
        return counter;
    }
}
