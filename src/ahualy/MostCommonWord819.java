package ahualy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words. 
 * It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 *
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the
 * paragraph are not case sensitive.  The answer is in lowercase.
 */
public class MostCommonWord819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
//      被禁止的单词
        String[] banned = new String[]{"hit"};
        String res = mostCommonWord(paragraph,banned);
        System.out.println(res);
    }
    
    private static String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String,Integer> wordMap = new HashMap<>();
        int mcwCount = -1;
        String res = "";
//      把banned的单词存入set集合
        HashSet<String> set = new HashSet<>();
        for (String str : banned) {
            set.add(str);
        }
        String[] wordsArr = paragraph.toLowerCase().split(" |!|\\?|'|,|;|\\.");
        for (String s : wordsArr) {
            if (!set.contains(s) && !s.equals("")){
                wordMap.put(s,wordMap.getOrDefault(s,0)+1);
                int count = wordMap.get(s);
                if (count > mcwCount) {
                    res = s;
                    mcwCount = count;
                }
            }
        }
        return res;
    }
}
