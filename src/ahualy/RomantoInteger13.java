package ahualy;

import java.util.*;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomantoInteger13 {
    public static void main(String[] args) {
        int res = romanToInt("D");
        System.out.println(res);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char goal = s.charAt(i);
            list.add(map.get(goal));
        }
//      list中的数字是有顺序的，从左到右,前面的数字小于后面的数字，就需要做减法
        int res = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) < list.get(i+1)) {
                Integer eee = list.get(i+1)-list.get(i);
                res = res+eee;
                i++;
            }else{
                res = res+list.get(i);
            }
        }
        if (list.size()>=2){
            if (list.get(list.size()-1) <= list.get(list.size()-2)) {
                res = res+list.get( list.size()-1 );
            }
        } else {
            res = map.get(s.charAt(0));
        }
        return res;
    }
}



























