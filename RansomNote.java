// problem: https://leetcode.com/problems/ransom-note/

class Solution {
    private HashMap<Character,Integer> counter(HashMap<Character, Integer> hashMap, char element) {
        hashMap.merge(element, 1, Integer::sum);
        return hashMap;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dictRansomNote = new HashMap<>();
        HashMap<Character, Integer> dictMagazine = new HashMap<>();
        for(Character c : ransomNote.toCharArray()) dictRansomNote = counter(dictRansomNote, c);
        for(Character c : magazine.toCharArray()) dictMagazine = counter(dictMagazine, c);
        for(Character key : dictRansomNote.keySet()) if(dictRansomNote.getOrDefault(key, 0) > dictMagazine.getOrDefault(key, 0)) return false;  

        return true;
    }
}
