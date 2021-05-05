package LeetCode;

import java.util.ArrayList;
import java.util.List;

class WordSearch2 {
  public List<String> findWords(char[][] board, String[] words) {

    List<String> foundWords = new ArrayList<>(); //Add found words here, HashSet?
    for (String word : words) {
      boolean[][] visited = new boolean[board.length][board[0].length]; // Refresh visited 2D array
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
          if (word.charAt(0) == board[i][j] && dfs_search(i, j, 0, word, board, visited)) {
            if (!foundWords.contains(word)) {
              foundWords.add(word);
            }
          }
        }
      }
    }
    return foundWords;
  }


  public boolean dfs_search(int row, int col, int index, String word, char[][] board, boolean[][] visited) {
    if (index == word.length()) {
      return true;
    }

    if (row<0 || row>=board.length || col<0 || col>=board[0].length ||
        word.charAt(index) != board[row][col] || visited[row][col]) {
      return false;
    }

    visited[row][col] = true;

    if (dfs_search(row-1, col, index+1, word, board, visited) ||
        dfs_search(row+1, col, index+1, word, board, visited) ||
        dfs_search(row, col-1, index+1, word, board, visited) ||
        dfs_search(row, col+1, index+1, word, board, visited)) {
      return true;
    }
    visited[row][col] = false;
    return false;
  }
}
