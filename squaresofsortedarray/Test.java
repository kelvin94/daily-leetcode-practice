package squaresofsortedarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.math.*;
/**
 * Test
 */
public class Test {
  // public int[] sortedSquares(int[] A) {
    
  // }
  public static void main(String[] args) {
    int[] A = {-7,-3,2,3,11};


    int[] result = new int[A.length];
    // int i = 0, j = A.length -1;
    // for(int p = A.length -1; p>=0; p--) {
    //   if(Math.abs(A[i]) > Math.abs(A[j])){
    //     result[p] = A[i] * A[i];
    //     i++;
    //   } else {
    //     result[p] = A[j] * A[j];
    //     j--;
    //   }
    // }
    
    int indexOfSeparator = 0;

    for(int i = 1; i < A.length; i++) {
      if(A[i]>= 0 && A[i-1] < 0) {
        indexOfSeparator = i;// delimiter of negative and non-neg numbers
        i = A.length-1;
      }
    }
    int j = indexOfSeparator-1;
    int k = indexOfSeparator;
    int p = 0;
    for(; p< A.length && j>=0 && k < A.length; p++) {
      if(A[j]*A[j] > A[k]*A[k]){
        result[p] = A[k] * A[k];
        k++;
      } else {
        result[p] = A[j] * A[j];
        j--;
      }
    }
    if(j >=0 ) {
      for(; j>=0; j--, p++) {
        result[p] = A[j] * A[j];
      }
    }
    if(k < A.length) {
      for(; k<A.length; k++, p++) {
        result[p] = A[k] * A[k];
      }
    }
    // int i = A.length-1;
    // while(i>=0) {
    //   if(A[i]>=0){
    //     indexOfSeparator = i;
    //   }
    //   i--;
    // }
    // System.out.println(indexOfSeparator);
    // int q = indexOfSeparator-1; // index to loop through negative part
    // int j = indexOfSeparator; // index to loop through non-negative part of the array

    // // int tempNeg;
    // // int tempNonNeg;
    // int totalIndex = 0;
    // while(j < A.length && q >= 0) {
    // // for(int totalIndex = 0; totalIndex< A.length; totalIndex++ ){
    //   // tempNeg = A[j] * A[j];
    //   // tempNonNeg = A[q] * A[q];
    //   if((A[j] * A[j]) > (A[q] * A[q])) {
    //     result[totalIndex] = A[q] * A[q];
    //     q--;

    //   } else {
    //     result[totalIndex] = A[j] * A[j];
    //     j++;
    //   }
    //   totalIndex++;
    // }
    // if(q >= 0) {
    //   // System.out.println("should not be here");
    //   // todo: a< indexofseparator, append rest of the elements before indxofSeparator to result array
    //   for(;q>=0 ;q--) {
    //     result[totalIndex++] = A[q] * A[q];
    //   }
    // }
    // if(j < A.length) {

    //   // todo: append rest of the elements for the end of array A to result;
    //   for(;j < A.length ;j++) {
    //     result[totalIndex++] = A[j] * A[j];
    //   }
    // }
    for(int index = 0; index<result.length;index++) {
      System.out.println(result[index]);
    }
  }
}