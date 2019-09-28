package ahualy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character
 * in it and return it's index. If it doesn't exist, return -1.
 *
 * 给定一个字符串，找出第一个非重复字符，并返回其索引，如果不存在，返回-1
 */
public class FirstUniqueCharacterinaString387 {

    public static void main(String[] args) {

        int res = firstUniqChar("112233445566");
        System.out.println(res);
    }

//  第一种解法，效率太低
    public static  int firstUniqChar(String s) {
//      首先找出哪个字符在该字符串中只出现了一次。
//      其实就是统计哪一种字符的个数是1
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i <=s.length()-1;i++) {
            char goal = s.charAt(i);
            if (map.get(goal)!=null){
                map.put(goal,map.get(goal)+1);
            } else {
                map.put(goal,1);
            }
        }
        char index = '\0';
        for (Map.Entry<Character,Integer> res : map.entrySet()) {
            if (res.getValue() == 1) {
                index = res.getKey();
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == index) {
                return i;
            }
        }
        return -1;
    }
}
