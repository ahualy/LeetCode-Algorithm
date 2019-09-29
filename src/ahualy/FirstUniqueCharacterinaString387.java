package ahualy;

import java.util.HashMap;
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

//        int res = firstUniqChar("112233445566");
//        int res = firstUniqChar2("loveleetcode");
        int res = firstUniqChar3("112233445566");
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
//  第二种方法  对上一种方法进行优化(效率更低)
    public static int firstUniqChar2(String s) {
        Map<Character,Map<Integer,Integer>> map = new LinkedHashMap<>();
        char goal = '\0';
        for (int i = 0; i < s.length(); i++) {
            goal = s.charAt(i);
//          说明该字符已经重复
                if (map.get(goal) != null) {
                    Map<Integer,Integer> map1 = new HashMap<>();
                    Integer key=0;
                    for (Map.Entry<Integer, Integer> str: map.get(goal).entrySet()) {
                       key =  str.getKey()+1;
                    }
                    map1.put(key,i);
                    map.put(goal,map1);
                } else {
                    Map<Integer,Integer> map1 = new HashMap<>();
                    map1.put(1,i);
                    map.put(goal,map1);
                }
        }
        if (map.size()!=0){
            for (Map.Entry<Character,Map<Integer,Integer>> res : map.entrySet())
                for (Map.Entry<Integer,Integer> sout : res.getValue().entrySet()) {
                    if (sout.getKey() == 1) {
                        return sout.getValue();
                    }
                }
        }
        return -1;
    }
//    第三种方法
    public static int firstUniqChar3(String s) {
        Map<Character,int[]> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char goal = s.charAt(i);
            if (map.get(goal) != null) {
                map.get(goal)[0] = map.get(goal)[0]+1;
                map.get(goal)[1] = i;
                map.put(goal,new int[]{map.get(goal)[0],map.get(goal)[1]});
            } else {
                map.put(goal,new int[]{1,i});
            }
        }
        
        if (map.size() != 0) {
            for (Map.Entry<Character,int[]> res : map.entrySet()) {
                if (res.getValue()[0] == 1) {
                    return res.getValue()[1];
                }
            }
        }
        return -1;
    }
}
