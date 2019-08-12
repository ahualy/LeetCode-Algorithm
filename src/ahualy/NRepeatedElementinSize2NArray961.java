package ahualy;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementinSize2NArray961 {
    public static void main(String args[]){
        int A[] = new int[]{5,1,5,2,5,3,5,4};
        int res = repeatedNTimes(A);
        System.out.println(res);
    }

    private static int repeatedNTimes(int[] a) {

        if (a==null)
            return 0;

        int N = a.length/2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(map.get(a[i])!=null){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           if (entry.getValue()==N)
               return entry.getKey();
        }
        return 0;
    }
}
