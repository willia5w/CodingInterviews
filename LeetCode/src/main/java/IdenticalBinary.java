package src.main.java;
import java.util.*;

   /*
   Problem: Check if 2 binary trees are identical or not

             1
            2, 2
          3, 4, 3, 4

              1
            2, 2
          3, 4, 3, 4

   I; 2 Node Objects
   O: Boolean for identical or not
   E:
   "Is Identical"
   "Check(Node n)"
    */

public class IdenticalBinary {

    // Definition for a Node.
    public static class Node {
        public int val;
        public Node left;
        public Node right;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        /*
                    15
                    10, 20
                8, 12, 16, 25

                    15
                    10, 20
                9, 12, 16, 25
        */
        
        Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);

        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(20);
        y.left.left = new Node(9);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(25);
    
        System.out.println(worker(x, y));
    }

    public static boolean worker(Node n1, Node n2) {
        
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) {
            return false;
        }
        
        if(!checker(n1, n2)) {
            return false;
        }

        return worker(n1.left, n2.left) && worker(n1.right,  n2.right);
    }

    public static boolean checker(Node n1, Node n2) {
        if (n1.val == n2.val) {
            return true;
        }
        return false;
    }
}





    