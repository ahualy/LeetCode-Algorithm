package ahualy;

/**
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 * 大数相乘
 */
public class MultiplyStrings43 {
    public static void main(String[] args) {
        String num1 = "23";
        String num2 = "23";
        String res = multiply(num1,num2);
        System.out.println(res);
    }

    private static String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() < 1 || num2.length() < 1)
            return "0";
        if (num1.equals("0" )|| num2.equals("0")) 
            return "0";
        int idx1 = num1.length()-1,idx2 = num2.length()-1;
        StringBuffer result = new StringBuffer();
//      两个数相乘,结果的位数是这两个因数的位数之和
        int[] res = new int[idx1+idx2+2];
        for (int i = idx1; i >=0; i--) {
            for (int j = idx2; j >=0; j--) {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int sul = x * y;
//              cur记录的就是相乘的两个数的位置，
                int cur = i + j;
//              后一位进位的位置是，该位置就是目前运算的两位的值的位置，如果一个是1位，另一个也是1位，那他两的值放在1+1+1的位置，也是pre
//              pre位置存的也就是上一个数字比如是一个2位，一个1位，他们的进位在3的位置，在保存在了2+1+1的位置。
                int pre = cur + 1;
//              该位置的值等于成绩+后一位的进位
                int sum = sul + res[pre];
//              res[cur]保存进位 本位两个数的成绩的结果放在下标为3的位置的话，那它的进位就在下标为2的位置
                res[cur] += sum / 10;
//              保存结果
                res[pre] = sum % 10;
            }
        }
        for (int i=0; i<res.length; ++i){
            if (i==0 && res[i]==0) continue;
            result.append(res[i]);
        }
        return result.toString();
    }
}
