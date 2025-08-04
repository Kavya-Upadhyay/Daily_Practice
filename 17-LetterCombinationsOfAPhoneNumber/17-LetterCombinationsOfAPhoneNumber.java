// Last updated: 7/31/2025, 12:22:42 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result; // Edge case: empty input
        generateCombinations(digits, "", result);
        return result;
    }

    private void generateCombinations(String digits, String ans, List<String> result) {
        if (digits.isEmpty()) {
            result.add(ans);
            return;
        }

        char ch = digits.charAt(0);
        String getString = key[ch - '0'];

        for (int i = 0; i < getString.length(); i++) {
            generateCombinations(digits.substring(1), ans + getString.charAt(i), result);
        }
    }
}
