package ahualy;


/**
 * 偶数位放偶数，奇数位放奇数
 *
 */
public class SortArrayByParityII922 {
    public static void main(String[] args) {

        int[] A = new int[]{4,2,5,7};
        int[] res = sortArrayByParityII(A);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }

    private static  int[] sortArrayByParityII(int[] A) {

        int N = A.length;
        int[] res = new int[N];

        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            res[t] = x;
            t += 2;
        }

        t = 1;
        for (int x: A) if (x % 2 == 1) {
            res[t] = x;
            t += 2;
        }

        return res;
    }
}
