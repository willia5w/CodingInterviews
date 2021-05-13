package src.main.java;
import java.io.*;
import java.util.*;

public class BinaryPathSum {

/* 

TODO: Write a DFS solution
Recursively continue to the right or left as long as the sum of the path so far has not exceed the target
TODO: Write a InLine (queue) solution

 Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 A leaf is a node with no children.

 Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22

               [0,1,2,3,  4,   5,6,7,8,9    ,10 , 11, 1]

         5
       4, 8 
   11, null, 13, 4
 7, 2, null, null, null, 1

        0
      1, 2
    3, 4, 5, 6
 Algorithm
 left = prev * 2 + 1
 right = prev * 2 + 2

 Target Traversal: [5,4,11,2, null]
 In Order Traversal: 


 If sum == target, return true
*/



  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }
  }
  
  public static boolean trav(int[] nodes, int targ) {
    
    List<Integer> allPathSums = new ArrayList<>();
    allPathSums.add(nodes[0]);
    
    boolean notFound = true;
    int start = 1;
    int end = start * 2;

    while (notFound) {
   
      for (int i = 0; i < end +1; i++) {
        // store values from last level in array (running sums)
        
        Integer newTotal = allPathSums.get(i-1/2) += i;
      }
    }
    return false;
  } 
}
