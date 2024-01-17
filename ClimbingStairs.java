// problem: https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        else if (n == 2) return 2;
        int first = 1;
        int second = 2;
        int next = 0;
        for(int i = 2; i < n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }
}
