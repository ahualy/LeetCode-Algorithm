package ahualy;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {

    public static void main(String[] args) {

        int[] A = new int[]{3,4,15,2,9,4};
        int res = largestPerimeter(A);
        System.out.println("res "+res);


    }


    private static int largestPerimeter(int[] A) {


        //首先进行排序
        Arrays.sort(A);

        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }
}
