/**
* Problem: https://leetcode.com/problems/find-all-anagrams-in-a-string/
*/
class Solution {
    public List<Integer> findAnagrams (String s, String p) { 
        int s_l = s.length(); int p_l = p.length();
        List<Integer> out= new ArrayList<>();
        char[] compareArray = p.toCharArray();

        Arrays.sort(compareArray);
        
        for (int i=0;i<s_l-p_l+1;i++) {
            String temp=s.substring (i,i+p_l); 
            char[] tempArray= temp.toCharArray();
            Arrays.sort(tempArray);
            if (Arrays.equals(tempArray, compareArray)) 
                out.add(i);
        }
        
        return out;
    }
}
