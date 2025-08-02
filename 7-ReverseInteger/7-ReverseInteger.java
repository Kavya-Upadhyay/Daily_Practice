// Last updated: 7/31/2025, 12:22:53 PM
class Solution {
    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
            // Check for overflow
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) ans;
    }
}
