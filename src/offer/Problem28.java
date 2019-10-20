package offer;

/**
 * 面试题 28:字符串的排列
 * 题目:输入一个字符串，打印出该字符串中字符的所有排列。
 * 全排列
 */
public class Problem28 {
    public static void main(String[] args) {
        permutation("123");
    }
    private static void permutation(String str) {
        int count = 0;
        if (str == null)
            return;
        char[] chs = str.toCharArray();
        int point = 0;
        System.out.println(chs);
        System.out.println(" ");
        count++;
        char temp1 = chs[point];
        chs[point]=chs[++point];
        chs[point]=temp1;
        while(!String.valueOf(chs).equals(str)){
            System.out.print(chs);
            System.out.print(" ");
            count++; if(point==chs.length-1){
                char temp=chs[point];
                chs[point]=chs[0];
                chs[0]=temp;
                point=0;
            }else{
                char temp=chs[point];
                chs[point] = chs[++point];
                chs[point]=temp;
            } }
        System.out.println(count);
    }
}
