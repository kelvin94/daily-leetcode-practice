package maxsubarray;

/**
 * Leetcode: 53. Maximum Subarray
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class Test {
  public static void main(String[] args) {
    int[] A = {-2,1,-3,4,-1,2,1,-5,4};
    int max = 0;
    int currentSum = 0;
    for (int num : A) {
      if( currentSum < 0) {
        currentSum = num;
      } else {
        currentSum += num;
      }
      max = Math.max(max, currentSum);

    }
    System.out.println(max);
  }
  
}