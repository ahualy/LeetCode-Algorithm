package algorithm;

public class Shell {
    public static void main(String args[]) {
        String[] a = new String[]{"1","3","2","6"};

        String[] res = sort(a);
        for (String i : res) {
            System.out.print(i+" ");
        }
    }
    private static String[] sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3)
            h = 3*h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j= i; j >= h && less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h = h/3;
        }
        return (String[]) a;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

