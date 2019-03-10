package removeduplicatesfromsortedarray;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    // int  j = -1;
    int lastSeenInt = 1;
    int j = 1;
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] != lastSeenInt) {
        // System.out.println(lastSeenInt);
        nums[j++] = nums[i];
        lastSeenInt = nums[i];
        // j = i;
      } 
    }

    for(int iterator : nums) {
      System.out.println(iterator);
    }
  }
}