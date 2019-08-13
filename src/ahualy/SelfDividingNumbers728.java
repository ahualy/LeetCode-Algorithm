package ahualy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public static void main(String args[]){

        int left = 1;
        int right = 22;
        List<Integer> res = selfDividingNumbers(left,right);
        System.out.println(res);

    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            boolean flag = true;
            int t = i;
            while (t > 0){
                int d = t % 10 ;
                if (d == 0 || i % d != 0) {
                    flag  = false;
                    break;
                }
                t /= 10;
            }
            if (flag)
                list.add(i);
        }
        return list;
    }
}
