package unpackagedquestion;
import java.util.*;

public class ReverseString {
    public String reverseString(String s) {
        String result = "";

        if(s.length() < 1) return s;
        char[] arr = s.toCharArray();
        for(int i = arr.length-1; i >= 0; i--) {
            result += arr[i];
        }
        return result;
    }
    // ################ Leetcode上面的答案
//    public String reverseString(String s) {
//        char[] word = s.toCharArray();
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//            char temp = word[i];
//            word[i] = word[j];
//            word[j] = temp;
//            i++;
//            j--;
//        }
//        return new String(word);
//    }
}
