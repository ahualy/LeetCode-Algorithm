package offer;

import java.util.Arrays;

/**
 * 面试题 30:最小的 k 个数。
 * 题目:输入 n 个整数，找出其中最小的 k 个数。
 * 例如输入 4,5,1，6,2,7,3,8 这 8 个数字，则最少的 4 个数字是 1,2,3,4.
 */
public class Problem30 {
    public static void main(String[] args) {

        int[] array = {4,5,1,6,2,7,3,8};
        getLeastNumbers(array,7);
    }

    private static void getLeastNumbers(int[] array,int k) {
        if (array == null || k < 0 || k > array.length)
            return;
        int[] kArray = Arrays.copyOfRange(array,0,k);
        buildMaxHeap(kArray);
        for (int i = k; i < array.length; i++) {
            if (array[i] < kArray[0]) {
                kArray[0] = array[i];
                maxHeap(kArray,0);
            }
        }
        for (int i : kArray) {
            System.out.println(i);
        }
    }

    private static void buildMaxHeap(int[] kArray) {
        for (int i = kArray.length/2; i >= 0 ; i--) {
            maxHeap(kArray,i);
        }
    }

    private static void maxHeap(int[] kArray, int i) {
        int left = 2*i;
        int right = left + 1;
        int largest = 0;
        if (right < kArray.length && kArray[left] > kArray[i])
            largest = left;
        else
            largest = i;
        if (right < kArray.length && kArray[right] > kArray[largest])
            largest = right;
        if (largest != i) {
            int temp = kArray[i];
            kArray[i] = kArray[largest];
            kArray[largest] = temp;
            maxHeap(kArray,largest);
        }

    }
}
