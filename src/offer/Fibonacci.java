package offer;

/**
 * 面试题 9:斐波那契数列
 * 写一个函数，输入 n，求斐波那契数列的第 n 项。
 */
public class Fibonacci {
    public static void main(String args[]) {
        int n = 1000;
        long res = fibonacci(n);
        System.out.println(res);
    }

    private static long fibonacci(int n) {

        long res = 0;
        long preOne = 0;
        long preTwo = 1;
        if (n == 0){
            return preOne;
        }
        if (n == 1) {
            return preTwo;
        }
        for (int i = 2;i<=n;i++){
            res = preOne + preTwo;
            preOne = preTwo;
            preTwo = res;
        }
        return res;
    }
}
