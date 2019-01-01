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
}
