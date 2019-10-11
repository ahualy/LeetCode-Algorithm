package ahualy;

/**
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B
 * is a substring of it. If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 *
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B
 * is not a substring of A repeated two times ("abcdabcd").
 */
public class RepeatedStringMatch686 {
    public static void main(String[] args) {
        String A = "abcd";
        String B = "cdabcdab";
        int res = repeatedStringMatch(A,B);
        System.out.println(res);
    }
    private static int repeatedStringMatch(String A, String B) {
        for(int i=0,j=0;i<A.length();i++){
            for(j=0;j<B.length() && A.charAt((i+j)%A.length())==B.charAt(j);j++);
            if(j==B.length()) return (i+j)/A.length()+((i+j)%A.length()!=0?1:0);
        }
        return -1;
    }
}
