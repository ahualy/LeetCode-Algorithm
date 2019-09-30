package ahualy;

/**
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 * 大数相乘
 */
public class MultiplyStrings43 {
    public static void main(String[] args) {
        String num1 = "9133";
        String num2 = "0";
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
        int[] res = new int[idx1+idx2+2];
        for (int i = idx1; i >=0; i--) {
            for (int j = idx2; j >=0; j--) {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int sul = x * y;
                int cur = i + j;
                int pre = cur + 1;
                int sum = sul + res[pre];
                res[cur] += sum / 10;
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
