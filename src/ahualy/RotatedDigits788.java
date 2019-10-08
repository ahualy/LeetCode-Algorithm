package ahualy;

import java.util.HashMap;
import java.util.Map;

/**
 * X is a good number if after rotating each digit individually by 180 degrees, 
 * we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.
 *
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 
 * rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, 
 * and the rest of the numbers do not rotate to any other number and become invalid.
 *
 * Now given a positive number N, how many numbers X from 1 to N are good?
 */
public class RotatedDigits788 {
    public static void main(String[] args) {
        int N = 2;
        int res = rotatedDigits(N);
        System.out.println(res);
    }

    private static int rotatedDigits(int N) {
//        方法一
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(8, 8);
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(9, 6);
        for (int i = 1; i < N; i++) {
            int number = i;
            int newNumber = 0;
            int m = 1;
            
            while (number > 0) {
                int digit = number % 10;
                if (map.containsKey( digit )) {
                    newNumber = map.get( digit )*m + newNumber;
                    number /= 10;
                    m *= 10;
                } else {
                    break;
                }
            }
            
            if (number == 0 && i != newNumber) count++;
        }
        return count;
//      方法二
        /*int[] dp = new int[N+1];
        int count = 0;
        for (int i = 0; i <= N; ++i) {
            if (i < 10) {
                if (i == 0 || i == 1 || i == 8) dp[i] = 1;
                if (i == 2 || i == 5 || i == 6 || i == 9) {
                    dp[i] = 2;
                    count++;
                }
            } else {
                int a = dp[i/10], b = dp[i%10];
                if (a == 1 && b == 1) dp[i] = 1;
                else if (a >= 1 && b >= 1) {
                    dp[i] = 2;
                    count++;
                }
            }
        }
        return count;*/
    }
}
