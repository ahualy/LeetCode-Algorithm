package ahualy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseInteger7 {

    public static void main(String[] args) {

        int d =  1534236469;
        int max= 2147483647;
        //int c = 9646324531;
        int x = 2147483647;
        int res = reverse(x);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(res);
    }


    private  static int reverse(int x) {


        /**
         * if(x == 0)
         *             return 0;
         *         int result = 0;
         *
         *         while(x != 0){
         *             if(result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10)
         *                 return 0;
         *             result = result * 10 + x % 10;
         *             x /= 10;
         *         }
         *
         *         return result;
         */

        if (x == 0) return x;
        long res = 0;
        boolean flag = false;
        if (x < 0) {
            x = 0 - x;
            flag = true;  //标记x为负数，为后面输出做标记
        }

        Integer s = new Integer(x);

        char[] c = s.toString().toCharArray();

        Stack<Character> stack = new Stack<>();

        // 如果最有一个字符为0，就不进行入栈操作
        //并且，如果是负数，需要进行绝对值计算。
        for (char ch: c) {
            stack.push(ch);
        }
        //如果最后一位是0，就先给pop掉
        if (c[c.length-1]=='0'){
            stack.pop();
        }
        System.out.println(stack);

        String str = String.valueOf(stack.pop()); //把第一个先pop给str初始化
        int len = stack.size() ;
        for (int i = 0; i < len; i++) {
            str += stack.pop();
        }
        if (flag == true) {
            // 就需要给记过加-号
            str = '-'+str ;
        }
       // System.out.println("str "+str);

        res = Long.valueOf(str);

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE )
            return 0;


        return (int)res;
    }
}
