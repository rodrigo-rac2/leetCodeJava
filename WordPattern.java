/**
 * problem: https://leetcode.com/problems/word-pattern/
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s_split = s.split(" ");

        if (pattern.length() != s_split.length) return false;

        HashMap<Character, String> pattern_s = mapPattern(pattern, s_split);
        
        if (!hasExclusiveValues(pattern_s)) return false;

        for(int i = 0; i < s_split.length; i++)
            if(!pattern_s.get(pattern.charAt(i)).equals(s_split[i])) return false;

        return true;
    }

    public HashMap<Character, String> mapPattern(String pattern, String[] s_split) {
        HashMap<Character, String> res = new HashMap<>();

        for (int i = 0; i < s_split.length; i++)
            res.put(pattern.charAt(i), s_split[i]);

        return res;
    }

    public boolean hasExclusiveValues(HashMap<Character, String> map) {
        Set<String> values = new HashSet<>();
        for(String word : map.values()) {
            if(values.contains(word)) return false;
            values.add(word);
        }
        return true;
    }
}
