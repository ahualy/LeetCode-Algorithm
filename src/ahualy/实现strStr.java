package ahualy;

import java.util.Arrays;
import java.util.List;

public class 实现strStr {
    public static void main(String[] args){
        int res = strStr("aaaaa","bba");
        System.out.println(res);
    }
    private static int strStr(String haystack,String needle) {
        if(needle==null||needle.equals(""))
            return 0;
        int needlesize = needle.length();
        //每次从haystack中截取needlesize的长度的字符串进行比较
        for (int i=0;i<=haystack.length();i++) {
            if (i + needlesize <= haystack.length()) {
                String str = haystack.substring(i, needlesize + i);
                if (needle.equals(str))
                    return i;
                else
                    continue;
            }
        }
        return -1;
    }
}
