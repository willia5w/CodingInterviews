public 
import java.io.*;
import java.util.*;

/*
 * Question: 
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 
 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 
 // Greedy
 // Does adding the current increase the overall Max?
 
  int curIndex, be abandoning all prev indices if next is preferable (increases total sum so       far) === reset Sum so Far
  

  Output: 6
  Explanation: [4,-1,2,1] has the largest sum = 6.
 */

class Solution {
  public static void main(String[] args) {

    int[] in = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    int[] in2 = new int[]{5,4,-1,7,8};
    int[] in3 = new int[]{1};
    
    System.out.println(greedySum(in3));
  }
  
  public static int greedySum(int[] nums) {
  
    int highestVal = Integer.MIN_VALUE;
    int sumSoFar = 0;
    
    if (nums.length == 0) {  // neg first num case
      return highestVal;
    }
        
    for (int i = 0; i < nums.length; i++) {
     
      System.out.println(sumSoFar);
      
      sumSoFar += nums[i];
      
      if (sumSoFar > highestVal) { 
        highestVal = sumSoFar;
      } 
      
      if (sumSoFar < 0) {
        sumSoFar = 0;
      }
    }
    return highestVal;
  }
}class MaxSubarraySum {
    
}
