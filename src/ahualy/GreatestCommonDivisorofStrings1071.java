package ahualy;

/**
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T 
 * (T concatenated with itself 1 or more times)
 *
 * Return the largest string X such that X divides str1 and X divides str2.
 */
public class GreatestCommonDivisorofStrings1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String res = gcdOfStrings(str1,str2);
        System.out.println(res);
        
    }
    private static String gcdOfStrings(String str1, String str2) {
        return GCD(str1,str2);
    }
    private static String GCD(String a,String b) {
        if (a.length() > b.length()) {
            for (int i=0;i<b.length();i++) {
                if (b.charAt(i) != a.charAt(i)) {
                    return "";
                }
            }
            String temp = a.substring(b.length());
            return GCD(temp,b);
        } else if (b.length() > a.length()){
            return GCD(b,a);
        } else {
            return a.equals(b) ? a : "";
        }
    }
}
