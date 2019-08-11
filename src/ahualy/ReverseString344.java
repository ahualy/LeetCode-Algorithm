package ahualy;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args){
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s){

        int n = s.length;
        for (int i = 0; i < n / 2; ++i) {
            int j = n - 1 - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];

        }
        System.out.println(s);
    }

}
