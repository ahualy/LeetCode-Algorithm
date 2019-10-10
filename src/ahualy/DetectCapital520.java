package ahualy;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class DetectCapital520 {
    public static void main(String[] args) {
        String word = "GoWDle";
        boolean res = detectCapitalUse(word);
        System.out.println(res);
    }

    private static boolean detectCapitalUse(String word) {
        if (word.length() < 2)
            return true;
//       如果全是大写字母
        if (word.toUpperCase().equals(word))
            return true;
        if (word.substring(1).toLowerCase().equals(word.substring(1)))
            return true;
        return false;
    }
}
