package ahualy;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ...,
 * (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class ArrayPartitionI651 {
    public static void main(String args[]){

        int[] nums = new int[]{1,4,3,2};
        int res = arrayPairSum(nums);
        System.out.println(res);
    }

    //这是一个有2n个数字的数组
    private static int arrayPairSum(int[] nums) {
        if (nums==null)
            return 0;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
           res+=nums[i];
        }
        return res;
    }
}
