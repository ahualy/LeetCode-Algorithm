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
        boolean res = judgeCircle("UULLLRRRDD");
        System.out.println(res);
    }
    private static boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
//      判断上下字母个数是否一样，左右字母个数是否一样
        int h = 0;
        int w = 0;
        for (int i = 0;i<moves.length();i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    h++;
                    break;
                case 'D':
                    h--;
                    break;
                case 'L':
                    w++;
                    break;
                case 'R':
                    w--;
                    break;
                default:
                    break;
            }
        }
        return h == 0 && w == 0 ? true : false;
    }
}
