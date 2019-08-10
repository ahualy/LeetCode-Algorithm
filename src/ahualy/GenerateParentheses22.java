package ahualy;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    public static void main(String[] args) {

        int n = 3;
        List<String> res = generateParenthesis(n);
        System.out.println(res);

    }


    private static List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        generateOneByOne("",list,n,n);

        return list;
    }

    private static void generateOneByOne(String sublist, List<String> list, int left, int right) {

        if (left == 0 && right == 0) {
            list.add(sublist);
            return;
        }
        if (left > 0) {
            generateOneByOne(sublist + "(", list, left - 1, right);
        }

        if (left < right) {
            generateOneByOne(sublist + ")", list, left, right - 1);
        }


    }

}
