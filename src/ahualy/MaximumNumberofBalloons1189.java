package ahualy;


/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 *
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * 
 * 找最小，五种字母，找其中个数自小的一个即可
 */
public class MaximumNumberofBalloons1189 {
    public static void main(String[] args) {
        String text = "nlaebolko";
        int res = maxNumberOfBalloons( text );
        System.out.println(res);
    }

    private static int maxNumberOfBalloons(String text) {
        
        if (text == "" || text.length() < 7) {
            return 0;
        }
        int len = text.length();
        int[] arr = new int[26];
        for (int i = 0;i< len; i++) {
            arr[text.charAt( i ) - 'a']++;
        }
        int min = Math.min( arr[0],arr[1] ); // a b
        min = Math.min( min,arr[13] ); // n
        min = Math.min( min,arr[11]/2 ); // l
        min = Math.min( min,arr[14]/2 ); // 0
        return min;
    }
}
