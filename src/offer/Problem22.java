package offer;

import java.util.Stack;

/**
 * 面试题 22:栈的压入、弹出序列
 * 题目:输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是 否为该栈的弹出序列。
 * 假设压入栈的所有数字均不相等。例如压栈序列为 1、2、 3、4、5.序列 4、5、3、2、1 是压栈序列对应的一个弹出序列，但 4、3、5、1、 2 却不是。
 */
public class Problem22 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,3,4,5,5};
        boolean res = isPopOrder(array1,array2);
        System.out.println(res);
    }

    private static boolean isPopOrder(int[] array1, int[] array2) {
        if (array1==null || array2== null)
            return false;
        int point1 = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array2.length; i++) {
            if (!stack.isEmpty() && stack.peek()==array2[i]) {
                stack.pop();
            } else {
                if (point1 == array1.length) {
                    return false;
                } else {
                    do {
                        stack.push(array1[point1++]);
                    } while (stack.peek() != array2[i] && point1 != array1.length);
                    if (stack.peek() == array2[i])
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return true;
    }
}
