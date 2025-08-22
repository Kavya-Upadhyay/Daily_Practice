// Last updated: 7/31/2025, 12:22:14 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target = 1;
        for (int n : nums) {
            if (n > 0 && n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        return target;
    }
}