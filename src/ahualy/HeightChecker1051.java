package ahualy;

import java.util.Arrays;

/**
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 *
 * Return the minimum number of students not standing in the right positions.
 * (This is the number of students that must move in order for all students to be
 * standing in non-decreasing order of height.)
 */
public class HeightChecker1051 {
    public static void main(String[] args) {
        int[] heights = new int[]{1,1,4,2,1,3};
        int res = heightChecker(heights);
        System.out.println(res);
    }
    public static int heightChecker(int[] heights) {
//      如果直接int [] a = heights;这样a同样指向的是heights,当使用排序函数的时候，a也会是指向排序后的
        int[] a = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            a[i] = heights[i];
        }
//      heights = sort(heights);
        Arrays.sort(heights);
        int res = 0;
        for (int i = 0; i < a.length; i++)
           if(heights[i] != a[i])
               res++;
        return res;
    }

    private static int[] sort(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            int temp = 0;
            for (int j = i+1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;
                }
            }
        }
        return heights;
    }
}
