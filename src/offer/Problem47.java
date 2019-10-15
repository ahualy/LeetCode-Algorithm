package offer;

/**
 * 面试题 47:不用加减乘除做加法
 * 题目:写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则 运算符号。
 */
public class Problem47 {
    public static void main(String[] args) {
        System.out.println(add(8,16));
    }

    public static int add(int a,int b) {
        int sum,carray;
        do {
            sum = a^b;
            carray = (a&b)<<1;
            a = sum;
            b = carray;
        }while (b!=0);
        return a;

    }
}
