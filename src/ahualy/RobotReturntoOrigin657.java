package ahualy;

import java.util.HashMap;
import java.util.Map;

/**
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. 
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after 
 * it finishes all of its moves, return true. Otherwise, return false.
 * 
 * if (map.get(moves.charAt(i))!=null) {
 *     map.put(moves.charAt(i),map.get(moves.charAt(i))+1);
 *   } else {
 *     map.put(moves.charAt(i),1);
 *  }
 */
public class RobotReturntoOrigin657 {
    public static void main(String[] args) {
        boolean res = judgeCircle("UL");
        System.out.println(res);
    }
    private static boolean judgeCircle(String moves) {
        if (moves==null || moves.length()==0){
            return true;
        }
//      判断上下字母个数是否一样，左右字母个数是否一样
        Map<String,Integer> map = new HashMap<>();
        int s = 1;int z = 1;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i)=='U'||moves.charAt(i)=='D'){
                map.put("UD",s);s++;
            }
            else if (moves.charAt(i)=='L'||moves.charAt(i)=='R'){
                map.put("LR",z);z++;
            }
        }
        return false;
    }
}
