package ahualy;

public class PeakIndexinaMountainArray852 {


    public static void main(String[] args) {

        int[] A = new int[]{0,2,1,0};
        int res = peakIndexInMountainArray(A);
        System.out.println("res "+res);
    }

    private static  int peakIndexInMountainArray(int[] A) {

        if(A.length < 3) {
            return -1;
        }

        for (int i = 0; i < A.length-1; i++) {
            if (A[i]>A[i+1])
                return i;
        }

        return -1;
    }
}
