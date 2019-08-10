package ahualy;


/**
 * 牛顿迭代法
 * float InvSqrt (float x){
 *     float xhalf = 0.5f*x;
 *     int i = *(int*)&x;
 *     i = 0x5f3759df - (i>>1);
 *     x = *(float*)&i;
 *     x = x*(1.5f - xhalf*x*x);
 *     return x;
 * }
 */
public class Sqrt69 {
    public static void main(String[] args) {

        int x = 8;
        double jd = 10e-9;
        double res = mySqrt(x,jd);
        System.out.println("res "+res);
    }


    private static double mySqrt(int x, double jd) {

        if (x == 0 || x == 1)  return x;
        int l = 1, r = x;
        double res = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (m == x / m) {
                return m;
            } else if (m > x / m) {
                r = m - 1;
            } else {
                l = m + 1;
                res = m;
            }
        }


        return res;
    }
}
