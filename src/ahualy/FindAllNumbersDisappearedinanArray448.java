package ahualy;


import java.util.ArrayList;

public class FindAllNumbersDisappearedinanArray448 {
    public static void main(String args[]) {

        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList res = findDisappearedNumber(nums);
    }

    private static ArrayList findDisappearedNumber(int[] nums) {
        ArrayList ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if((nums[Math.abs(nums[i])-1])>0) {
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*(-1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
            if(nums[i]>0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}