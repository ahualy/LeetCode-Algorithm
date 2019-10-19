package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 20:顺时针打印矩阵
 * 题目:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class Problem20 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        printClockwise(array);
    }

    private static void printClockwise(int[][] array) {
        List<Integer> resList = new ArrayList<>();
        if (array == null)
            return;
        int start = 0;
        while (array[0].length > start*2 && array.length > start*2) {
            printOneCircle(array,start);
            start++;
        }
    }

    private static void printOneCircle(int[][] array, int start) {
        for (int i = start; i < array[0].length - start; i++) {
            System.out.println(array[start][i]);
        }
        if (array.length-1-start > start) {
            for (int i = start+1; i < array.length-start-1; i++) {
                System.out.println(array[i][array[0].length-1-start]);;
            }
        }
        if(array[0].length-start-1>start && array.length-start-1>start) {
            for(int i=array.length-start-1;i>start;i--) {
                System.out.println(array[array.length-start-1][i]);;
            }
        }
        if(array.length-1-start>start && array[0].length-1-start>start) {
            for(int i=array.length-start-1;i>start;i--) {
                System.out.println(array[i][start]);;
            }
        }
    }
}
