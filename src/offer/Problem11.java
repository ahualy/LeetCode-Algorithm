package offer;

/**
 * 面试题 11:数值的整数次方
 * 题目:实现函数 double Power(double base，int exponent)，求 base 的 exponent 次方。
 * 不得使用库函数
 * 同时不需要考虑大数问题。
 */
public class Problem11 {
    public static void main(String[] args) throws Exception {
        double base = 1.1;
        int exponent = 10;
        double res = power(base,exponent);
        System.out.println(res);
    }
    public static double power(double base,int exponent) throws Exception {
        double res = 0.0;
        if (equal(base,0.0) && exponent < 0) {
            throw new Exception("0的负数次幂没有意义");
        }
        if (exponent < 0) {
            res = 1.0/powerWithExponent(base,-exponent);
        } else {
            res = powerWithExponent(base,exponent);
        }
        return res;
    }

    private static double powerWithExponent(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    private static boolean equal(double number1, double number2) {
        if (number1 - number2 > -0.0000001 && number1 - number2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }
}
