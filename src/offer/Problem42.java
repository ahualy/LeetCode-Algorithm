package offer;

/**
 * 面试题 42:翻转单词顺序 VS 左旋转字符串。
 * 题目一:输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。例如输入字符串“I am a student.”， 则输出“student. a am I”.
 */
public class Problem42 {
    public static void main(String[] args) {
        String str = "I am a student.";
        reverseSentence(str);
    }

    private static void reverseSentence(String sentence) {
        if (sentence == null)
            return;
        String[] str = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0 ; i--) {
            sb.append(str[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
