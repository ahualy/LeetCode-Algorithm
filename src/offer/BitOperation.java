package offer;

/**
 * @author ahualy-01
 * @date 2019/11/1
 * 
 * java位运算
 */
public class BitOperation {
    public static void main(String[] args) {
//      注意Java中二进制存的都是反码
//      两个为0，结果为0，否则为1
        int a = 1;
        a |= 2;
        System.out.println(a);
//      两个为1，结果为1，否则为0
        int b = 1;
        b &= 2;
        System.out.println(b);
//      两个相同，结果为0，否则为1
        int c = 1;
        c ^= 2;
        System.out.println(c);
//      取反即可
        int d = 1;
        System.out.println(~d);
    }
}
