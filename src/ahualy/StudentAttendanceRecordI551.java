package ahualy;

/**
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his attendance record.
 */
public class StudentAttendanceRecordI551 {
    public static void main(String[] args) {
        String s = "PPAA";
        boolean res = checkRecord(s);
        System.out.println(res);

    }
    private static  boolean checkRecord(String s) {
        int numOfA = 0;
        int numOfL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='A') numOfA++;
            if (s.charAt(i)=='L') numOfL++;
            else numOfL = 0;
            if (numOfA > 1 || numOfL > 2)
                return false;
        }
        return true;
    }
}
