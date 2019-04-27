package ahualy;

import java.util.Arrays;

public class SortanArray912 {
    public static void main(String[] args) {

        int nums[] = new int[]{5,2,3,1};
        int[] res = sortArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(res[i]);
        }

    }

    private static int[] sortArray(int[] nums) {

         Arrays.sort(nums);

        return nums;

    }
}
