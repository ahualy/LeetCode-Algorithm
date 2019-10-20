package offer;

/**
 * 面试题 42:翻转单词顺序 VS 左旋转字符串。
 * 题目一:输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。例如输入字符串“I am a student.”， 则输出“student. a am I”.
 *
 *
 * 题目二:字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如输入字符串“abcdefg”和 数字 2.该函数左旋转 2 位得到的结果“cdefgab".
 */
public class Problem42 {
    public static void main(String[] args) {
        String str = "I am a student.";
        reverseSentence(str);
        String str1 = "abcdefg";
        leftRotateString(str1,7);
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

    public static void leftRotateString(String sentence,int index){
        if(sentence==null||index>sentence.length()||index<0){ return;
        }
        String[] splitString={sentence.substring(0,index),
                sentence.substring(index,sentence.length())}; StringBuffer resultbBuffer=new StringBuffer(); for(String s:splitString){
            resultbBuffer.append(reverse(s)); }
        System.out.println(reverse(resultbBuffer.toString()));

    }
    public static String reverse(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return String.valueOf(array);
    }
}
