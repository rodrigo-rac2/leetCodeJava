/**
* Problem: https://leetcode.com/problems/roman-to-integer/
*/

class Solution {
    public int romanToInt(String s) {
        char[] number = s.toCharArray();
        int total = 0;
        for(int i = 0; i < number.length; i++) {
            switch (number[i]) {
                case 'I':
                    if((i < number.length - 1) && (number[i+1] == 'V')) {
                        total = total + 4;
                        i++;
                    }
                    else if((i < number.length - 1) && (number[i+1] == 'X')) {
                        total = total + 9;
                        i++;
                    }
                    else total = total + 1;
                    break;
                case 'V':
                    total = total + 5;
                    break;
                case 'X':
                    if((i < number.length - 1) && (number[i+1] == 'L')) {
                        total = total + 40;
                        i++;
                    }
                    else if((i < number.length - 1) && (number[i+1] == 'C')) {
                        total = total + 90;
                        i++;
                    }
                    else total = total + 10;
                    break;
                case 'L':
                    total = total + 50;
                    break;
                case 'C':
                    if((i < number.length - 1) && (number[i+1] == 'D')) {
                        total = total + 400;
                        i++;
                    }
                    else if((i < number.length - 1) && (number[i+1] == 'M')) {
                        total = total + 900;
                        i++;
                    }
                    else total = total + 100;
                    break;
                case 'D':
                    total = total + 500;
                    break;
                case 'M':
                    total = total + 1000;
                    break;
            }
        }

        return total;
    }
}
