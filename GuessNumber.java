/**
* Problem: https://leetcode.com/problems/guess-number-higher-or-lower/
*/

import java.lang.Math;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        double minPick = 0;
        int pick = 0;
        while(true) {
            pick = (int) Math.ceil((minPick + n) / 2);
            if (guess(pick) == -1) {
                n = pick;
            } else if(guess(pick) == 1) {
                minPick = pick;
            } else {
                break;
            }
        }
        return pick;
    }
}
