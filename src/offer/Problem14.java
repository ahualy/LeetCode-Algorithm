package offer;

/**
 * 面试题 14:调整数组顺序使奇数位于偶数前面
 * 题目:输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有的偶数位于数组的后半部分。
 */
public class Problem14 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        order(array);
        for (int item : array) {
            System.out.println(item);
        }
    }

    private static void order(int[] array) {
        if (array == null || array.length == 0)
            return;
        int start = 0;
        int end = array.length - 1;
//        向后移动start指针，直到他指向偶数
        while (start < end && !isEven(array[start])) {
            start++;
        }
//        向前移动end指针，直到他指向奇数
        while (start < end && !isEven(array[end])) {
            end--;
        }
//        交换奇数和偶数的位置
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }
// 扩展函数
    private static boolean isEven(int n) {
        return n%2==0; }
}
