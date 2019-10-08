package ahualy;

/**
 * Given a non-empty string s, you may delete at most one character. 
 * Judge whether you can make it a palindrome.
 */
public class ValidPalindromeII680 {
    public static void main(String[] args) {
        String s = "aba";
        boolean res = validPalindrome( s );
        System.out.println(res);
    }
    

    private static  boolean validPalindrome(String s) {
        char[] cs = s.toCharArray();
        int lf = 0, rt = s.length() - 1;
        while (lf < rt) {
            if (cs[lf] != cs[rt]) return isPalindrome(cs, lf + 1, rt) || isPalindrome(cs, lf, rt - 1);
            lf ++;
            rt --;
        }
        return true;
    }

    private   static  boolean isPalindrome(char[] cs, int start, int end) {
        while (start < end) {
            if (cs[start++] != cs[end--]) return false;
        }
        return true;
    }
}
