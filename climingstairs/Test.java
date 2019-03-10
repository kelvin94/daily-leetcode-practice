package climingstairs;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    int input = 5;
    int onestepbefore = 1;
    int twostepbefore = 2;
    int currentSum = 0;
    for (int i = 2; i < input; i++) {
      currentSum = onestepbefore + twostepbefore;
      onestepbefore = twostepbefore;
      twostepbefore = currentSum;
    }
    System.out.println(currentSum); 
  }
}