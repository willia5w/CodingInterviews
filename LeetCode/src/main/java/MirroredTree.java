package src.main.java;

import java.util.*;

public class MirroredTree {
    public static void main(String[] args) {
   
        int[] tree = new int[]{1,2,2,3,4,4,3};
    /*
      0
      1, 2
      3, 4, 5, 6
     
      prev start = 0;
      start = prev start * 2 + 1
      end = start * 2
    */
    
      System.out.println(mirrored(tree));
    }

      public static boolean mirrored(int[] tree) {
        
        if (tree[1] != tree[2]) {
          return false;
        }
        
        boolean mir = true;
        int prevStart = 0; // 3  
        int start = 0; // 3
        
        
        while(mir) {
          
          start = prevStart * 2 + 1;
          
          if (start >= tree.length) {
            return true;
          }
          
          prevStart = start;
          int end = start * 2;
          
          Deque<Integer> forward = new ArrayDeque<>();
          Deque<Integer> backward = new ArrayDeque<>();
          
          for (int i = start; i < end + 1; i++) { // Until i is not less than 7
            forward.offerLast(tree[i]);  // [3, 4, 3, 4]
            backward.offerFirst(tree[i]); // [4, 3, 4, 3]
          }
          
          for (int i = 0; i < forward.size(); i++) {
            Integer fPop = forward.pop(); // 3
            Integer bPop = backward.pop(); // 4
           
            // System.out.println(fPop);
            // System.out.println(bPop);
            
            if (!fPop.equals(bPop)) {
              mir = false;  
              return false;
            } 
          }
        }
        return true;
      }
}
