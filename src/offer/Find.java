package offer;

/**
 * 面试题 3:二维数组中的查找
 * 题目描述:一个二维数组，每一行从左到右递增，每一列从上到下递增.
 * 输入一个二维数组和一个整数，判断数组中是否含有整数。
 */
public class Find {
    public static void main(String[] args) {
        int array[][] = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean res = find(array,12);
        System.out.println(res);
    }

    private static boolean find(int[][] array, int number) {
        if (array == null) return false;
        int column = array[0].length - 1;
        int row = 0;
        while (row < array.length && column >= 0) {
            if (array[row][column] == number) {
                return true;
            }
//            满足这个条件，说明该number可能在这一行
            if (array[row][column] > number) {
                column--;
//              否则的话说明也许在下一行，不在这一行
            } else {
                row++;
            }
        }
        return false;
    }
}
