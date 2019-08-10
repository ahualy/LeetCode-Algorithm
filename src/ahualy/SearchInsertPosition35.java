package ahualy;


/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition35 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};//给定的数组是有序的
        int target = 4;
        int res = searchInsert(nums, target);
        System.out.println(res);

    }

    private static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] >= target) return i;
        }
        return nums.length;

    }
    }

