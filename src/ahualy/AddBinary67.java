package ahualy;

public class AddBinary67 {
    public static void main(String args[]){

        String a = "111";
        String b = "11";
//      数字和数字字符进行运算
//        System.out.println(('0'-'0')+1);
//        System.out.println('0'+1);
        String res = addBinary(a,b);
        System.out.println(res);

    }

    private static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
//              j--巧妙用法, -'0'的目的就是为了将数字字符转化为数组
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            System.out.println(sum);
//          核心算法
            sb.append(sum % 2);
//          更新进位
            carry = sum / 2;
        }
//       最后判断是不是有进位
        if (carry != 0)
            sb.append(carry);
//       最后将字符串做一个反转即可
        return sb.reverse().toString();

    }
}
