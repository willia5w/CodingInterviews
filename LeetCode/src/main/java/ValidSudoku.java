/*
You are working on a logic game made up of a series of puzzles. The first type of puzzle you settle on is "sub-Sudoku", a game where the player has to position the numbers 1..N on an NxN matrix.

Your job is to write a function that, given an NxN matrix, returns true if  every row and column contains the numbers 1..N

The UI for the game does not do any validation on the numbers the player enters, so the matrix can contain any signed integer.

Examples:

[[1, 2, 3],
 [3, 1, 2],
 [2, 3, 1]]         -> True

[[1, 2, 3],
 [1, 2, 3],
 [1, 2, 3]]        -> False

[[1, 1, 1],
 [2, 2, 2],
 [3, 3, 3]]        -> False

[[1000, -1000, 6],
 [   2,     3, 1],
 [   3,     1, 2]] -> False

[[0]]              -> False

[[3, 2, 3, 2],
 [2, 3, 2, 3],
 [3, 2, 3, 2],
 [2, 3, 2, 3]] 	-> False

[[2, 3, 4],
 [3, 4, 2],
 [4, 2, 3]]        -> False

[[-1,-2,-3],
 [-2,-3,-1], 
 [-3,-1,-2]]       -> False

[[1,1,1],
 [1,1,2],
 [1,2,3]]          -> False

n: The number of rows/columns in the matrix
*/
import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] argv) {
    /*
    
    int n = input[0].size
    
    for i in range (1 , n) = [1, 2, 3]
    
    for each item in the row or col, ensure it appears exactly once in the range, else    False
    
    walk through, for each item in each row, for each item in each col
    
    
    */
    
    
    // True
    int[][] grid1 = {
      {1,2,3},
      {3,1,2},
      {2,3,1}
    };
    
    // False
    int[][] grid2 = {
      {1,2,3},
      {1,2,3},
      {1,2,3}
    };
    // False
    int[][] grid3 = {
      {1,1,1},
      {2,2,2},
      {3,3,3}
    };
    // False
    int[][] grid4 = {
      {1000,-1000,6},
      {2,3,1},
      {3,1,2}
    };
    // False
    int[][] grid5 = {{0}};
    // False
    int[][] grid6 = {
      {3, 2, 3, 2},
      {2, 3, 2, 3},
      {3, 2, 3, 2},
      {2, 3, 2, 3}
    };
    // False
    int[][] grid7 = {
      {2,3,4},
      {3,4,2},
      {4,2,3}
    };
    // False
    int[][] grid8 = {
      {-1,-2,-3},
      {-2,-3,-1},
      {-3,-1,-2}
    };
    // False
    // [1, 2, 3]
    
    int[][] grid9 = {
      {1,1,1},
      {1,1,2},
      {1,2,3}
    };
    
    System.out.println(validate(grid1));

  }
  
  
  public static boolean validate(int[][] board) {
    
    int n = board[0].length;
    int numRows = board.length;
    
    List<Integer> targets = new ArrayList<>();
    
    for (int i = 1; i < n + 1; i++) {
      targets.add(i);
    }
    
;

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < n; j++) {

        int count = Collections.frequency(Arrays.asList(board[0]), board[i][j]);
       
        if (count != 1) {
          
          System.out.println(board[i][j]);
          System.out.println(count);
          return false;
        }
        
      }
    }
    
    System.out.println("rows good");
    
    
    
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < n; j++) {
        int count = Collections.frequency(targets, board[j][i]);
        if (count != 1) {public class ValidSudoku {
            
        }
        
          return false;
        }
      }
    }
    
    System.out.println("cols good");

    return true;
  }
}
