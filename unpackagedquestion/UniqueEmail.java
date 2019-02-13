package unpackagedquestion;
import java.util.HashSet;

import java.util.Set;
import java.util.*;

public class UniqueEmail {
//    ######################### 我的答案
    public static int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            int indexOfAt = emails[i].indexOf('@');
            String localname = emails[i].substring(0, indexOfAt);
            String domain = emails[i].substring(indexOfAt + 1);

            int indexOfPlus = localname.indexOf('+');
            if(indexOfPlus != -1) {
                while(indexOfPlus != -1) {
                    localname = localname.substring(0, indexOfPlus);
                    indexOfPlus = localname.indexOf('+');
                }
            }
            int indexOfDot = localname.indexOf('.');
            if(indexOfDot != -1) {
                while(indexOfDot != -1) {
                    if(indexOfDot < localname.length()) {
                        localname = localname.substring(0, indexOfDot) + localname.substring(indexOfDot + 1);
                    } else {
                        localname = localname.substring(0, indexOfDot);
                    }
                    indexOfDot = localname.indexOf('.');
                }
            }
            emails[i] = localname + '@' + domain;

            hs.add(emails[i]);
        }
        return hs.size();
    }

    //################### leetcode里面的大神的答案
//    public static int numUniqueEmails(String[] emails) {
//        Set<String> hs = new HashSet<>();
//        for(String email : emails) {
//            String[] arr = email.split("@");
//            String local = arr[0].substring(0,arr[0].indexOf('+')).replace(".", "");
//            hs.add(local+"@"+arr[1]);
//
//        }
//        return hs.size();
//    }

    public static void main(String[] args) {
//        String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] arr = {"fxggfzk.fo.q+e@uxbeyetxc.com","fxggfzk.fo.q+h@uxbeyetxc.com","uv+mw.lkw+ybe@yppz.com"};

        System.out.println(numUniqueEmails(arr));
    }
}


