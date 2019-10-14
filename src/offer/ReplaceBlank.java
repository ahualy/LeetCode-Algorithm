package offer;

/**
 * 面试题 4:替换空格
 * 题目:请实现一个函数，把字符串中的每个空格替换成“%20”。
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceBlank(s));
    }

    private static String replaceBlank(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append('%');
                sb.append('2');
                sb.append('0');
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
