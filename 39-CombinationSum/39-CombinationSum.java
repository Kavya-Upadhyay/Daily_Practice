// Last updated: 7/31/2025, 12:22:18 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        CoinCombination(candidates, target, ll, ans, 0);
        return ans;
    }

    public static void CoinCombination(int[] coin, int amount, List<Integer> ll, List<List<Integer>> ans, int idx) {
        if (amount == 0) {
            ans.add(new ArrayList<>(ll)); // Copy the list
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]); // Choose the coin
                CoinCombination(coin, amount - coin[i], ll, ans, i); // Recursive call with the same index
                ll.remove(ll.size() - 1); // Backtrack
            }
        }
    }
}
