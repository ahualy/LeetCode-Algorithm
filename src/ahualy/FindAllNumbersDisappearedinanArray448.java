package ahualy;


import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray448 {
    public static void main(String args[]) {

        int[] nums = new int[]{1,5,4,2,3,1};
        List res = findDisappearedNumber(nums);
        System.out.println(res);
    }

    private static List<Integer> findDisappearedNumber(int[] nums) {
        ArrayList ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            //Math.abs()获取绝对值
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