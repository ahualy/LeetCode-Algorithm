package ahualy;

/**
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c,
 * the key might get long pressed, and the character will be typed 1 or more times.
 *
 * You examine the typed characters of the keyboard.  Return True if it is possible that
 * it was your friends name, with some characters (possibly none) being long pressed.
 */
public class LongPressedName925 {
    public static void main(String[] args) {
        String name = "vtkgn";
        String typed = "vttkgnn";
        boolean res = isLongPressedName(name,typed);
        System.out.println(res);
    }

    private static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        char pre = ' ';
        int indexOfName = 0;
        for (int i = 0; i < typed.length(); ++i) {
            if (name.charAt(indexOfName) != typed.charAt(i) && pre == ' ')
                return false;
            if (name.charAt(indexOfName) == typed.charAt(i)) {
                pre = name.charAt(indexOfName);
                indexOfName++;
            } else {
                if (pre == typed.charAt(i))
                    continue;
                else
                    return false;
            }
        }
        if (indexOfName != name.length()) return false;
        return true;
    }
}
