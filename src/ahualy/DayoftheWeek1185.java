package ahualy;

/**
 * Given a date, return the corresponding day of the week for that date.
 *
 * The input is given as three integers representing the day, month and year respectively.
 *
 * Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
 */
public class DayoftheWeek1185 {
    public static void main(String[] args) {
        int day = 15;
        int month = 8;
        int year = 1993;
        String res = dayOfTheWeek(day,month,year);
        System.out.println(res);
    }

    private static String dayOfTheWeek(int day, int month, int year) {
        String week[] = new String[]{"Thursday", "Friday", "Saturday","Sunday","Monday", "Tuesday", "Wednesday"};
        int days = 0;
        int[] mothdays = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1971; i < year ; i++) {
            if ((i%4==0 && i/100 != 0) || i%400 == 0)
                days += 366;
            else
                days += 365;
        }

        for (int i = 0; i < month - 1; i++) {
            days += mothdays[i];
        }
        days += day;

        if (((year%4 == 0 && year%100 !=0) || year%400 == 0) && month >2)
            ++ days;
        return week[days%7];
    }
}
