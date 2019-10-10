package ahualy;

/**
 * Given a string and an integer k, you need to reverse the first k characters 
 * for every 2k characters counting from the start of the string. If there are less 
 * than k characters left, reverse all of them. If there are less than 2k but 
 * greater than or equal to k characters, 
 * then reverse the first k characters and left the other as original.
 */
public class ReverseStringII541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String res = reverseStr(s,k);
        System.out.println(res);
    }
    private static String reverseStr(String s, int k) {
        if (s.length() <= k)
            return new StringBuffer(s).reverse().toString();
        else if (s.length() <= 2*k)
            return new StringBuffer(s.substring( 0,k )).reverse().toString() + s.substring(k);
        String res = "";
        while (s.length() >2*k){
            res += reverseStr(s.substring(0,2*k),k);
            s = s.substring(2*k);
        }
        res += reverseStr(s,k);
        return res;
    }
}
