package ahualy;

/**
 * Given a string S that only contains "I" (increase) or "D" (decrease),
 * let N = S.length.
 *
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 *
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 *
 * 题目的意思是，将字符串与数组一一对应，因为数组多一位，不考虑这一位。
 * 剩下的位置，如果字符串写的是‘I’，那么该位置上的数应该比右边所有的数都小。
 * 而如果是‘D’，则是比右边的都大。现在需要找到其中任意一组。
 */
public class DIStringMatch942 {

    public static void main(String[] args){

        String S = "IDID";
        //String S = "III";
        //String S = "DDI";
        int[] res =  diStringMatch(S);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }



    }

    private static int[] diStringMatch(String S) {
        int low = 0;
        int N = S.length();
        int high = N;
        int res[] = new int[N+1];
        for (int i = 0; i < N ; i++) {
            char c = S.charAt(i);
            if(c=='I')
                res[i] = low++;//先把low赋值给res[i],然后做++操作，存入的值为0+1
            else
                res[i] = high--;//先把high赋值给res[i],然后做++操作，存入的值为4-1,
            //要保证字符串为D时，这个位置上面的数字大于右边的，就从最大值里面去做减法
            System.out.println("第"+i+"次  low=="+low);
            System.out.println("第"+i+"次  high=="+high);
        }
        res[N] = low;//最后一位，确保是小值，所以就将low给res[N]

        return res;
    }

}
