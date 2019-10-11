package ahualy;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 */
public class ReverseVowelsofaString345 {
    public static void main(String[] args) {
        String s = "hello";
        String res = reverseVowels(s);
        System.out.println(res);
    }

    private static String reverseVowels(String s) {
        String vowels = "aoeiuAOEIU";
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length -i -1;
        while (i < j) {
            while (i < j && !vowels.contains(a[i] + "")){
                i++;
            }
            while (i < j && !vowels.contains(a[j] + "")){
                j--;
            }
            if (i < j) {
                char c = a[i];
                a[i++] = a[j];
                a[j--] = c;
            }
        }
        return new String(a);
    }
}
