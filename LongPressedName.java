// problem: https://leetcode.com/problems/long-pressed-name/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] nameArray = name.toCharArray();
        char[] typedArray = typed.toCharArray();
        if(nameArray.length > typedArray.length) return false;
        int typedIndex = 0;
        for (int i = 0; i < nameArray.length; i++) {
            if(typedIndex >= typedArray.length) return false;
            if (nameArray[i] != typedArray[typedIndex])
                return false;
            int c1 = 0;
            int c2 = 0;
            while ((typedIndex < typedArray.length) && (nameArray[i] == typedArray[typedIndex])) {
                typedIndex++;
                c1++;
            }
            while ((i < nameArray.length - 1) && (nameArray[i + 1] == typedArray[typedIndex - 1])) {
                i++;
                c2 = c2 + 1;
                if (c2 >= c1)
                    return false;
            }
        }
        while((typedIndex < typedArray.length) && (nameArray[nameArray.length - 1] == typedArray[typedIndex]))
            typedIndex++;
        if (typedIndex < typedArray.length)
            return false;

        return true;
    }
}
