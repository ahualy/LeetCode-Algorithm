package ahualy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * You are given an array A of strings.
 *
 * Two strings S and T are special-equivalent if after any number of moves, S == T.
 *
 * A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].
 *
 * Now, a group of special-equivalent strings from A is a non-empty subset S of A such that any string not 
 * in S is not special-equivalent with any string in S.
 *
 * Return the number of groups of special-equivalent strings from A.
 * 
 * 解题思路，任意两个字符串，交换奇数位和偶数为的字符的位置，如果交换后他们相等，那就是属于同一组的
 * 
 * 使用暴力的解法，拿到字符串所有奇数位和偶数位的字符，对他们分别进行排序，然后拼接，通过set去重
 */
public class GroupsofSpecialEquivalentStrings893 {
    public static void main(String[] args) {
        String[] A = new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"}; 
        int res = numSpecialEquivGroups(A);
        System.out.println(res);
    }
    private static int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String a : A) {
//          从s中取出所有的奇数位和所有的偶数位
            int l = a.length();
            char[] first = new char[l - l/2];
            char[] second = new char[l/2];
            for (int i = 0; i < l; i++) {
                if (i % 2 == 0)
                    first[i/2] = a.charAt( i );
                else 
                    second[i/2] = a.charAt( i );
            }
            Arrays.sort(first);
            Arrays.sort(second);
            
            String temp = new String(first)+new String(second);
            set.add( temp );
        }
        return set.size();
    }
}


