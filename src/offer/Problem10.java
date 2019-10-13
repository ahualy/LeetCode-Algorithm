package offer;

/**
 * 面试题 10:二进制中 1 的个数
 * 题目:请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * 例如 把 9 表示成二进制是 1001;有 2 位是 1，因此如果输入 9，函数输出 2.
 */
public class Problem10 {
    public static void main(String[] args) {
        int n = 9;
        //int res = numberOf1(n);
        //System.out.println(res);
        System.out.println(Integer.toBinaryString(7));
        System.out.println(3&4);
    }
    private static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
//            & 就是按位于，先把两边的十进制转换成二进制，然后按位相与运算
            n = (n - 1) & n;
        }
        return count;
    }
}
