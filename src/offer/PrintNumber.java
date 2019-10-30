package offer;

/**
 * @author ahualy-01
 * @date 2019/10/30
 * 
 * 通过递归打印数字
 */
public class PrintNumber {
    public static void main(String[] args) {
//        printNumber(5);
        printNumber2(5);
    }

    private static void printNumber(int n) {
        int i=0;
        if (n == 0)
            return;
        while (i<n){
            System.out.print(n+" ");
            i++;
        }
        System.out.println();
        printNumber(n-1);
    }
    private static void printNumber2(int n) {
        int i;
        if (n == 0)
            return;
        //确定如何让n变化，每次输出n就行了
        if (n == 1) {
            System.out.print(n);
        } else {
            printNumber2(n-1);
            for (i = 0; i < n; i++) {
                System.out.print(n+" ");
            }
        }
        System.out.println();
    }
}
