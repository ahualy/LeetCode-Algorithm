package ahualy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers arr, write a function that returns true if and only
 * if the number of occurrences of each value in the array is unique.
 */
public class UniqueNumberofOccurrences1207 {
    public static void main(String[] args) {

        int arr[] = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            set.add(m.getValue());
        }
        return set.size()== map.size();
    }
}
