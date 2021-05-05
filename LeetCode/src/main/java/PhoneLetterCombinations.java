package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Description */
class PhoneLetterCombinations {
  public List<String> letterCombinations(String digits) {

      List<String> output = new ArrayList<>();

      if (digits == null || digits.length() == 0) {
        return output;
      }

      Map<Integer, String> numLetters = new HashMap<>();
      numLetters.put(0, "");
      numLetters.put(1, "");
      numLetters.put(2, "abc");
      numLetters.put(3, "def");
      numLetters.put(4, "ghi");
      numLetters.put(5, "jkl");
      numLetters.put(6, "mno");
      numLetters.put(7, "pqrs");
      numLetters.put(8, "tuv");
      numLetters.put(9, "wxyz");

      combinations(output, digits, "", 0, numLetters);
      return output;
    }

    public void combinations(List<String> output, String digits, String cur, int index, Map<Integer, String> numLetters) {
      if (index == digits.length()) {
        output.add(cur);
        return;
      }
      String letters = numLetters.get(Integer.parseInt(Character.toString(digits.charAt(index))));

      for (int i = 0; i<letters.length(); i++) {
        combinations(output, digits, cur + letters.charAt(i), index+1, numLetters);
      }
    }
}
