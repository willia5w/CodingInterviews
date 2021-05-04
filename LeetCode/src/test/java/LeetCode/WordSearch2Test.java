package LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class WordSearch2Test {

  WordSearch2 testSearch = new WordSearch2();

  @Test
  public void findWords() {
    char[][] board = {{'a','a'}};
    String[] words = {"a"};
    List<String> result = testSearch.findWords(board, words);

    System.out.println(result);


  }

  @Test
  public void dfs_search() {}
}