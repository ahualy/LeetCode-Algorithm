package ahualy;

public class MergeSortedArray88 {
    public static void main(String args[]){

        //最后得到的新数据的长度和nums1[]相同
        int nums1[] = new int[]{1,2,3,7,8,9,10,11,12,13,14,15};
        int m = 8;
        int nums2[] = new int[]{2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);


    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1,j=n-1;
        while(i>=0&&j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while(i>=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        for (int l = 0; l < nums1.length; l++) {
            System.out.println("l==="+l+"===="+nums1[l]);
        }
    }
}
