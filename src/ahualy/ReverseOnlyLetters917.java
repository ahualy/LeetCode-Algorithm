package ahualy;

/**
 * Given a string S, return the "reversed" string where all characters that 
 * are not a letter stay in the same place, and all letters reverse their positions.
 * 
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * 
 * 对字符串进行逆序排序，要求只把字母的顺序翻转，而其他字符原地不动。
 * 先把所有的字母保存下来，然后再次对字符串进行遍历，如果源字符串的某个位置是字母，
 * 那么把字母列表中最后一个元素换过来，否则就还是原来的字符。
 */
public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        
        String S = "Test1ng-Leet=code-Q!";
        String res = reverseOnlyLetters( S );
        System.out.println(res);
        
    }

    private static String reverseOnlyLetters(String S) {
        
        if (S.length()==0||S==null){
            return "";
        }
       
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt( i ) >= 65 && S.charAt( i ) <= 90 || S.charAt( i ) >= 97 && S.charAt( i ) <= 122) {
                sb.append( S.charAt( i ) );
            }
        }
        
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt( i ) >= 65 && S.charAt( i ) <= 90 || S.charAt( i ) >= 97 && S.charAt( i ) <= 122) {
                res +=sb.substring(sb.length()-1,sb.length());
                sb = sb.delete(sb.length()-1,sb.length());
            }else {
                res += S.charAt(i);
            }
        }
        
        return res;
    }
        
}
