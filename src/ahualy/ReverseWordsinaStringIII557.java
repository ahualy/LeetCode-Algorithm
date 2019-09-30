package ahualy;
/**
 * Given a string, you need to reverse the order of characters in
 * each word within a sentence while still preserving whitespace and initial word order.
 */
public class ReverseWordsinaStringIII557 {
    public static void main(String[] args) {
        String s = "hehe hehe hehe hehe";
        String res = reverseWords(s);
        System.out.println(res);
    }

    public static String reverseWords(String s) {
        if (s.length()==0||s==null) {
            return "";
        }
        String[] res = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String s1 : res) {
            sb.append(new StringBuffer(s1).reverse());
            sb.append(" ");
            
        }
        return sb.toString().trim();
    }
}
