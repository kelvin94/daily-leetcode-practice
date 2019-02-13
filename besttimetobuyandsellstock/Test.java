package besttimetobuyandsellstock;

public class Test {
  // Question: best-time-to-buy-and-sell-stock
  // Same as finding maximum subarray.
  // https://leetcode.com/problems/best-time-to-buy-and-sell-stock
  public static int maxDifference(int[] prices) {
    int min = prices[0];
    int maxdiff = 0;
    for(int i = 1; i < prices.length; i++) {
      if(prices[i] - min > maxdiff) {
        maxdiff = prices[i] - min;
      }
      if(prices[i] < min) { min = prices[i]; }
    }
    return maxdiff;
  }

  public static int maxDifference2(int[] prices) {
    // this is the solution of the variation of the best time to buy and sell stock problem.
    // 变化点： 允许多次买卖
    // 出处： http://hanslen.me/2017/10/15/Best-Time-to-Buy-and-Sell-Stock-series-with-Dynamic-Programming-in-Java/
    int maxDiff = 0;
    for(int i =1; i< prices.length; i++) {
      int temp = prices[i] - prices[i-1];
      if(temp > 0) {
        maxDiff+=temp;
      }
    }
    return maxDiff;
  }
  public static void main(String[] args) {
    System.out.println("test222");
    int[] testData = {7,1,5,3,6,4};
    System.out.println(maxDifference(testData));
  }
}