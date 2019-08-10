package ahualy;

public class NimGame292 {

    public static void main(String[] args) {

        System.out.println(canWinNim(1));

    }

    private static boolean canWinNim(int n) {


        return n % 4 == 0 ? false : true;
    }
}
