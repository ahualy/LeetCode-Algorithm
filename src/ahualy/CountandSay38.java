package ahualy;

import java.util.LinkedList;
import java.util.List;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 * 
 * 解题思路：
 * 1.因为只给定了一个n，根据给定的n，生成n的字符串
 * 2.想到递归，上一次的结果是下一次的参数
 * 3.递归函数
 *   首先将字符串切分，从左到右，连续的字符串切成一个，保存到list中，不连续的单个的一个，也保存到list中
 *   比如11211
 *   将会切分成 11  2  11
 *   最后遍历list，读出切分后的子字符串，通过子串的长度+子串的字符，拼接处结果
 */
public class CountandSay38 {
    public static void main(String[] args) {
        String res = countAndSay(100);
        System.out.println(res);
    }
//  
    private static String countAndSay(int n) {
        int i = 1;
        String res = "1";
        while (i<n){
            res = recursion(res);
            i++;
        }
        return res;
    }
//  递归函数 
    private static String recursion(String res) {
        List<String> list = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < res.length()-1; i++) {
            if (res.charAt(i) == res.charAt(i+1)) {
                sb.append(res.charAt(i));
            }else{
                sb.append(res.charAt(i));
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
//      由于最后一个字符不能在for中处理，单独拿出来
        sb.append(res.charAt(res.length() - 1));
        list.add(sb.toString());
//      这里清空sb是为了返回结果的时候用到sb对象，为了节省空间
        sb.delete(0,sb.length());
        for (String e : list) {
            sb.append(e.length()).append(e.charAt(0));
        }
        return sb.toString();
    }
}
