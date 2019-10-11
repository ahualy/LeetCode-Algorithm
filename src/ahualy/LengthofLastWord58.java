package ahualy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class LengthofLastWord58 {
    public static void main(String[] args) {
        String s = "a dddd0000 ";
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }
    private static int lengthOfLastWord(String s) {
        int result = 0,len = s.length();
        for( int i = 0;i<len;i++){
            if( s.charAt(i) == ' '){
                while( i<s.length() && s.charAt(i) == ' ')
                    i++;
                if( i!= len)
                    result = 1;
            }
            else
                result++;
        }
        return result;
    }
}
