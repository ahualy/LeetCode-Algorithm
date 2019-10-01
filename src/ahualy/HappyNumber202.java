package ahualy;

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will stay), or
 * it loops endlessly in a cycle which does not include 1. Those numbers for
 * which this process ends in 1 are happy numbers.
 *
 * 写一个算法来确定一个数字是否是“快乐的”。
 * 一个幸福数是由以下过程定义的一个数：从任何正整数开始，用数字的平方和来替换数字，
 * 并重复这个过程直到数字等于1（它将停留在哪里），或者它在一个不包括1的循环中无限循环。
 * 这个过程以1结尾的数字是快乐数字。
 * 4这个数字会一直循环下去，特殊处理
 */
public class HappyNumber202 {
    public static void main(String[] args) {
        int n = 2;
        boolean res = isHappy(n);
        System.out.println(res);
    }

    private static  boolean isHappy(int n) {
        int res = recursion(n);
        while (res!=1&&res!=4){
            res = recursion(res);
        }
        return res==1;
    }

    private static int recursion(int n) {
        String nStr = String.valueOf(n);
        int sum = 0;
        int[] a = new int[nStr.length()];
        for (int i = 0; i < nStr.length(); i++) {
            a[i] = nStr.charAt(i) - '0';
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i]*a[i];
        }
        return sum;
    }
}
