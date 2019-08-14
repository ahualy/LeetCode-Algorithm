package ahualy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
    public static void main(String args[]){
        String emails[] = new String[]{"test.email+alex@leetcode.com" ,"test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int res = numUniqueEmails(emails);
        System.out.println(res);
    }
    private static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                //判断该字符串是不是@
                if (emails[i].charAt(j) != '@') {
                    if (emails[i].charAt(j) == '.') {
                        //删除该字符
                        emails[i]  = emails[i].substring(0,j) + emails[i].substring(j+1);
                    }
                    if (emails[i].charAt(j) == '+') {
                         //如果是+号，就看+后面有几个字符就是@
                        int m = j;
                        while(emails[i].charAt(j)!='@'){
                            j++;
                        }
                        emails[i] = emails[i].substring(0,m)+emails[i].substring(j);
                        //将j重置为初始的值，不然j++这个值将会直接导致循环跳过@，影响后面的.号
                        j = m - 1;
                    }
                }else{
                    break;
                }
            }
            set.add(emails[i]);
        }
        return set.size();
    }
}