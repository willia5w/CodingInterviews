// "Given a string s, find the longest palindromic substring in s. 
// You may assume that the maximum length of s is 1000." 

// 1. Reiterate (Contract)
// 2. PseudoCode
// 3. Code - Brute force
// 4. Optimize

// Input: String "asasdfggfd"
// Output: String, Return the first one, 
// Bounds: Length of input string
// Edge Cases: No palindromes, return empty string

public class LongestPalindromicSubstring {
    
    public static void main(String[] args) {
        String s = "asasdffdgg";
        System.out.println(dpFn(s));
    }

    public static String fn(String s) {

        // Be building a substring up until the length of the input
        // Constantly check if it is equal to it's reverse
        // Keep track of longest palindrome so far
        String longest = "";
        int start = 0;
        int len = s.length();

        while (start < len) {
            for (int i = start; i < len; i++) {
                
                String sub = s.substring(i, len);
                String reversedSub = new StringBuilder(sub).reverse().toString();
            
                if (sub.equals(reversedSub)) {  // is palindrome
                    System.out.println(sub);

                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
            start++;
        }
        return longest;
    }


    public static String dpFn(String s) {
        // Dynamic Prog Solution - Bonicillo blind_curated_75_leetcode questions
        // 1.) Maintain a boolean table filled in a bottom up manner DP 2D Array
        // 2.) Value at DP(i, j) is True/1 if substring is palindrome
        // 3.) Calculate DP(i+1, j-1). If True and letter is the same at intersection DP(i, j)
        // 4.) Fill table previously 

        int len = s.length();
        int maxLen = 1;
        int start = 0;
        boolean dp[][] = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < len - 1; i++) {
            if (s.substring(i,i) == s.substring(i+1,i+1)) {
                dp[i][i+1] = true;
                start = i;
                maxLen = 2;
            }
        }


        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {


            }
        }


    }
}
