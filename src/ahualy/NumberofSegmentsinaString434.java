package ahualy;


/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 */
public class NumberofSegmentsinaString434 {
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        int res = countSegments(s);
        System.out.println(res);
    }

    private static int countSegments(String s) {
        if (s.length()==0 || s==null)
            return 0;
        int count=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && flag){
                flag=false;
            } else if(s.charAt(i) != ' ' && !flag){
                flag=true;
                count++;
            }
        }

        return count;
    }
}
