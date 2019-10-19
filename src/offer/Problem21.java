package offer;

import java.util.Stack;

/**
 * 面试题 21:包含 min 函数的栈
 * 题目:定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min 函数。
 * 在该栈中，调用min、push及pop的时间复杂度都是O(1)
 *
 * peek 和 pop的区别
 * peek只会返回栈顶顶元素，不会将其删掉
 * pop直接会做元素顶出栈操作，将会把元素从栈中删除掉
 */

class MyStack<T>{
    Stack<Integer> data = new Stack<Integer>(); //存放元素栈
    Stack<Integer> min = new Stack<Integer>(); //辅助栈，data栈中每次进入一个元素，min辅助栈就存放当前data栈中的最小元素
    //data栈和min栈进入元素
    public void stackWithMinPush(int item){
        data.push(item);
        if(min.size() == 0 || item < min.peek()){
            min.push(item);
        }else{
            min.push(min.peek());
        }
    }
    //data栈和min栈弹出元素
    public void stackWithMinPop(){
        if(data.size() > 0 && min.size() > 0){
            data.pop();
            min.pop();
        }
    }
    //data栈的栈顶元素
    public int stackWithDataTop(){
        if(data.size() > 0){
            return data.peek();
        }
        return 0;
    }
    //min栈的栈顶元素，栈顶元素为data栈中现有元素的最小元素
    public int stackWithMinMin(){
        if(data.size() > 0 && min.size() > 0){
            return min.peek();
        }
        return 0;
    }
}

public class Problem21 extends MyStack<Integer> {

    public static void main(String[] args) {
        Problem21 p = new Problem21();
        p.stackWithMinPush(4);
        p.stackWithMinPush(5);
        p.stackWithMinPush(3);
        p.stackWithMinPush(2);
        p.stackWithMinPush(7);
        System.out.println(p.stackWithMinMin());
        p.stackWithMinPop();
        p.stackWithMinPop();
        System.out.println(p.stackWithMinMin());
    }
}
