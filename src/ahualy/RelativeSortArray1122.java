package ahualy;

import java.util.Arrays;

public class RelativeSortArray1122 {
    public static void main(String args[]){
        int arr1[] = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = new int[]{2,1,4,3,9,6};
        int[] res = relativeSortArray(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr2 == null){
            Arrays.sort(arr1);
            return arr1;
        }

        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {

                }
            }
        }


        for (int i=0;i<sum;i++){

        }
        Arrays.sort(arr1);
        return arr1;
    }
}