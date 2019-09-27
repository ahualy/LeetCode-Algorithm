package ahualy;

import java.util.HashSet;
import java.util.Set;

/**
 * 处理邮箱格式，将邮箱中的@前面的.号以及+号后面的内容剔除掉，得到有效的邮箱账号
 * 先判断是否是@，如果是，直接跳出循环
 * 判断是否是.，如果是，就直接剔除掉
 * 判断是否是+，如果是，还得判断+号到@号的长度，然后剔除掉这个长度的字符串 ，注意j的重置
 * 最后通过set去重即可
 */

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