package ahualy;

/**
 * 
 * 大数相加算法
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 */
public class AddStrings415 {
    public static void main(String[] args) {
        String num1 = "9";
        String num2 = "99";
        String res = addStrings(num1,num2);
        System.out.println(res);
    }

    private static String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() < 1 || num2.length() < 1)
            return "";
        StringBuilder sb = new StringBuilder();
        int idx1 = num1.length()-1,idx2 = num2.length()-1,carry=0;
        while (idx1 >= 0 || idx2 >= 0) {
            int x = (idx1 < 0) ? 0 : num1.charAt(idx1) - '0';
            int y = (idx2 < 0) ? 0 : num2.charAt(idx2) - '0';
            int sum = x + y + carry;
//          sum%10 每次的的个位数
            sb.append( sum%10 );
//          每次产生的进位
            carry = sum/10;
            idx1--;
            idx2--;
        }
        if (carry > 0) sb.append( carry );
        return sb.reverse().toString();
    } 
}
