package LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PhoneLetterCombinationsTest {

  PhoneLetterCombinations test = new PhoneLetterCombinations();

  @Test
  public void letterCombinations() {
    List<String> output = test.letterCombinations("23");
    List<String> expected = new ArrayList<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    assertTrue(output.equals(expected));
    System.out.println(output);
  }
}