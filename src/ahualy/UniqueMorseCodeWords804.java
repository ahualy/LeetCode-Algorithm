package ahualy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, 
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * 
 * 
 */
public class UniqueMorseCodeWords804 {

    public static void main(String[] args) {
        
        String words[] = new String[]{"gin", "zen", "gig", "msg"};
        int res = uniqueMorseRepresentations(words);
        System.out.println(res);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        if (words==null || words.length==0) {
            return 0;
        }
        Map<String,String> map = new HashMap<>();
        Map<String,String> resMap = new HashMap<>();
        map.put("a",".-");
        map.put("b","-...");
        map.put("c","-.-.");
        map.put("d","-..");
        map.put("e",".");
        map.put("f","..-.");
        map.put("g","--.");
        map.put("h","....");
        map.put("i","..");
        map.put("j",".---");
        map.put("k","-.-");
        map.put("l",".-..");
        map.put("m","--");
        map.put("n","-.");
        map.put("o","---");
        map.put("p",".--.");
        map.put("q","--.-");
        map.put("r",".-.");
        map.put("s","...");
        map.put("t","-");
        map.put("u","..-");
        map.put("v","...-");
        map.put("w",".--");
        map.put("x","-..-");
        map.put("y","-.--");
        map.put("z","--..");
        for (String str : words) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                sb.append(map.get(String.valueOf(str.charAt(i))));
            }
            resMap.put(str,sb.toString());
        }
        Set<String> set = new HashSet<>();
        for (Map.Entry<String,String> eee : resMap.entrySet()) {
            set.add(eee.getValue());
        }
        return set.size();
    }
}
