package unpackagedquestion;
import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                arrayList.add("FizzBuzz");
            } else if(i % 3 == 0) {
                arrayList.add("Fizz");
            } else if(i % 5 == 0) {
                arrayList.add("Buzz");
            } else {
                arrayList.add(String.valueOf(i));
            }
        }
        return arrayList;
    }
    // ###################### Leetcode上面的答案
    public List<String> fizzBuzz2(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}
