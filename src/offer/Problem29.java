package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 29:数组中出现次数超过一半的数字
 * 题目:数组中有一个数字出现次数超过数组长度的一半，请找出这个数字。
 * 例如 输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。2出现的次数超过数组长度的 一半，因此输出2.
 */
public class Problem29 {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4,2,2,2,2};
        Integer res = moreThanHalfNum(array);
        System.out.println(res);
    }

    private static Integer moreThanHalfNum(int[] array) {
        if (array == null)
            return null;
        int arrayLength = array.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int arr : array) {
            if (map.get(arr)!= null) {
                if (map.get(arr) > arrayLength)
                    return arr;
                else {
                    map.put(arr, map.get(arr) + 1);
                    if (map.get(arr) > arrayLength)
                        return arr;
                }
            }
            else {
                map.put(arr,1);
            }
        }
        return null;
    }
}
