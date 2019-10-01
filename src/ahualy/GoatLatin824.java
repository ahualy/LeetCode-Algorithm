package ahualy;

import java.util.HashSet;
import java.util.Set;

/**
 * A sentence S is given, composed of words separated by spaces. Each word consists of
 * lowercase and uppercase letters only.
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 *
 * 一遍AC
 */
public class GoatLatin824 {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        String res = toGoatLatin(S);
        System.out.println(res);

    }

    private static String toGoatLatin(String S) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');
        set.add('i');set.add('o');
        set.add('u');
        set.add('A');set.add('E');
        set.add('I');set.add('O');
        set.add('U');

        StringBuilder resStr = new StringBuilder();
        String[] strS = S.split(" ");
        for (int i = 0; i < strS.length; i++) {
          char firstChar = strS[i].charAt(0);
          int index = i;
          if (set.contains(firstChar)) {
              splicing(resStr, strS, index);
          }else {
//            将第一个字符拼接到该字符串的最后一位，构造出新的字符串
              strS[i]  = strS[i].substring(1)+firstChar;
              splicing(resStr, strS, index);
          }
        }

        return resStr.toString().trim();
    }

    private static void splicing(StringBuilder resStr, String[] strS, int index) {
        String s = strS[index]+"ma";
        while (index+1>0) {
            s+="a";
            index--;
        }
        resStr.append(s+" ");
    }
}
