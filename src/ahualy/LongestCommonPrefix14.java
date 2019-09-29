package ahualy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 * 
 * 解题思路：
 * 遍历第一个字符串
 *    for循环里面遍历剩余的字符串，从左到右比较同样长度的字符串是否相等，如果相等 flag = true,
 *    不相等 flag = false,
 *    在遍历剩余字符串之前，需要判断遍历的子串是否满足长度，不满足直接return
 */

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
//        String input[] = new String[]{"flower","flow","flight"};
//        String input[] = new String[]{"d1og","d1ogo","d1oreg"};
        String input[] = new String[]{"a","abc","aaa"};
        
        String res = longestCommonPrefix(input);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
//      注意特殊字符串的处理
        if (strs == null||strs.length==0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuffer sb = new StringBuffer();
        String firstStr = strs[0];
            for (int i = 0; i <= firstStr.length()-1; i++) {
                String goal = firstStr.substring(0,i+1);
                boolean flag = false;
                for (int j = 1; j < strs.length; j++) {
                    if (i+1 > strs[j].length()){
                        return sb.toString();
                    } else {
                        if (goal.equals(strs[j].substring(0,i+1)))
                            flag = true;
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    sb.delete(0,sb.length());
                    sb.append(goal);
                }
            }
        return sb.toString();
    }
}
