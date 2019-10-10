package ahualy;

/**
 * You are given an array of strings words and a string chars.
 *
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 *
 * Return the sum of lengths of all good strings in words.
 */
public class FindWordsThatCanBeFormedbyCharacters1160 {
    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        int res = countCharacters(words,chars);
        System.out.println(res);
    }

    private static int countCharacters(String[] words, String chars) {
        int res = 0;
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (count(word,word.charAt(i)) > count(chars,word.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += word.length();
            }
        }
        return res;
    }
    
    private static int count(String str,char c){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) 
                res++;
        }
        return res;
    }
}
