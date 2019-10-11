package ahualy;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
    private static boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            while (left < right && !Character.isLetterOrDigit(chs[left]))
                left++;
            while (left < right && !Character.isLetterOrDigit(chs[right]))
                right--;
            if (Character.toLowerCase(chs[left++]) != Character.toLowerCase(chs[right--]))
                return false;
        }
        return true;
    }
}
