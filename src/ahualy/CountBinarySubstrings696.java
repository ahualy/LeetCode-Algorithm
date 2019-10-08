package ahualy;

/**
 * Give a string s, count the number of non-empty (contiguous) substrings 
 * that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 * 
 * 假设num1个连续出现的0与num2个连续出现的1相邻，则这个字符串的中子串的数量就是num1与num2的较小值。
 * 比如00111的子串大小就是2和3中的较小值。之前的解法重复计算了连续0或1的个数。
 */
public class CountBinarySubstrings696 {
    public static void main(String[] args) {
        String s = "10101";
        int res = countBinarySubstrings(s);
        System.out.println(res);
    }
    private static int countBinarySubstrings(String s) {
        int num1 = 1;
        int num2 = 0;
        int sum = 0;
        int i = 1;
        char[] sArray = s.toCharArray();
        if (sArray.length==1) return 0;
        char judge  = sArray[0];
        for ( ; i < sArray.length && sArray[i] == judge ; ++i) {
            ++ num1;
        }
        for ( ; i <sArray.length; ++i){
            if (sArray[i] != judge) num2++;
            if (sArray[i] == judge && sArray[i-1] != judge) {
                sum += Math.min( num1,num2 );
                num1 = num2;
                num2 = 1;
                judge = sArray[i-1];
            }
            if (i == sArray.length - 1) sum += Math.min( num1,num2 );
        }
        return sum;
    }
}
