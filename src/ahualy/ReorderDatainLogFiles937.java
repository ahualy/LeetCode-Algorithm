package ahualy;

import java.util.*;

/**
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that 
 * each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are 
 * ordered lexicographically ignoring identifier, with the identifier used in case of ties.  
 * The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 */
public class ReorderDatainLogFiles937 {
    public static void main(String[] args) {
        String[] logs = new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        String[] res = reorderLogFiles( logs );
        for (String re : res) {
            System.out.println(re);
        }
    }
    private static  String[] reorderLogFiles(String[] logs) {
        if(logs == null) {
            return null;
        }

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> bl = new ArrayList<>();

        for(int i = 0; i < logs.length; i++) {
            if(check(logs[i])) {
                al.add(logs[i]);
            } else {
                bl.add(logs[i]);
            }
        }

        Comparator cp = (Comparator<String>) (o1, o2) -> {
            int index1 = o1.indexOf(' ');
            int index2 = o2.indexOf(' ');
            String str1 = o1.substring(index1);
            String str2 = o2.substring(index2);
            int letRes = str1.compareTo(str2);
            if(letRes != 0) {
                return letRes;
            }
            String ar1 = o1.substring(0, index1);
            String ar2 = o2.substring(0, index2);
            return ar1.compareTo(ar2);
        };

        Collections.sort(al,cp);
        String res [] = new String[logs.length];
        for(int i = 0; i < res.length; i++) {
            if(i < al.size()) {
                res[i] = al.get(i);
            } else {
                res[i] = bl.get(i - al.size());
            }
        }

        return res;
    }

    private static boolean check(String str) {
        int index = str.indexOf(' ');
        char jud = str.charAt(index + 1);
        if(jud - '0' <= 9) {
            return false;
        }
        return true;
    }
}
