package ahualy;

/**
 * Given a group of two strings, you need to find the longest uncommon
 * subsequence of this group of two strings. The longest uncommon
 * subsequence is defined as the longest subsequence of one of these strings
 * and this subsequence should not be any subsequence of the other strings.
 *
 * A subsequence is a sequence that can be derived from one sequence by
 * deleting some characters without changing the order of the remaining
 * elements. Trivially, any string is a subsequence of itself and an empty string is a
 * subsequence of any string.
 *
 * The input will be two strings, and the output needs to be the length of the
 * longest uncommon subsequence. If the longest uncommon subsequence
 * doesn't exist, return -1.
 *
 * 只需要判断两字符串是否相等，如果相等就返回-1，不相等就返回较长的字符串长度！
 */
public class LongestUncommonSubsequenceI521 {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        int res = findLUSlength(a,b);
        System.out.println(res);
    }
    private static int findLUSlength(String a, String b) {
        if (a==null||b==null){
            return -1;
        }
        int aLen = a.length();
        int bLen = b.length();
        return a.equals(b) ? -1 : aLen > bLen ? aLen : bLen;
    }
}
