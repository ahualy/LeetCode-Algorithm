package ahualy;

/**
 * Given an array of characters, compress it in-place.
 *
 * The length after compression must always be smaller than or equal to the original array.
 *
 * Every element of the array should be a character (not int) of length 1.
 *
 * After you are done modifying the input array in-place, return the new length of the array.
 */
public class StringCompression443 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        int res = compress(chars);
        System.out.println(res);
    }
    private static int compress(char[] chars) {
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            int end = i;
            while (end < chars.length && chars[end] == chars[i]) {
                end++;
            }
            if (end == i + 1) {
                chars[start++] = chars[i];
            } else {
                chars[start++] = chars[i];
                char[] count = String.valueOf(end - i).toCharArray();
                for (int l = 0; l < count.length; l++) {
                    chars[start++] = count[l];
                }
            }
            i = end - 1;
        }
        return start;
    }
}
