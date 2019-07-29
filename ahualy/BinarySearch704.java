package ahualy;


/**
 * Given a sorted (in ascending order)给定的数组是有序的 integer array nums of n elements and a target value, write a function to
 * search target in nums. If target exists, then return its index, otherwise return -1.
 */
public class BinarySearch704 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int res = search(nums,target);
        System.out.println("res "+res);
    }


    private static int search(int[] nums, int target) {

        //通过二分查找
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return -1;
    }
}
