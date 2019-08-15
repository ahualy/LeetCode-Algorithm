package ahualy;

public class AddBinary67 {
    public static void main(String args[]){

        String a = "111";
        String b = "11";
        String res = addBinary(a,b);
        System.out.println(res);

    }

    private static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();

    }
}
