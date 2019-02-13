package converstringtolowercase;

public class ConverStringToLowerCase {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
    //######### 另一种解法就是直接用java String class built-in method: toLowerCase();
}
