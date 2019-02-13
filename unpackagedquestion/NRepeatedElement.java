package unpackagedquestion;
import java.util.*;

import java.util.HashSet;
import java.util.Set;
public class NRepeatedElement {
    public int repeatedNTimes(int[] A) {
        Set<Integer> hs = new HashSet<Integer>();
        int[] arr = new int[10000];
        for(int i = 0; i < A.length; i++) {
            if(hs.add(A[i]) == false) {
                arr[A[i]] += 1;
            } else {
                arr[A[i]] = 1;
            }
        }
        int max = 0;
        int position = 0;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                position = i;
                if(max == A.length / 2) {
                    return position;
                }
            }
        }
        return position;
    }
    // ############# 更好的一个解法是用

}
