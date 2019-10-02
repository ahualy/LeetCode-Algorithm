package ahualy;

/**
 * Given a binary matrix A, we want to flip the image horizontally,
 * then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1
 * is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
public class FlippinganImage832 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(A);
        System.out.println(res);
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0, j = row.length - 1; i <= j; ++i, --j) {
                int tmp = row[i] ^ 1;
                row[i] = row[j] ^ 1;
                row[j] = tmp;
            }
        }

        return A;
    }
}
