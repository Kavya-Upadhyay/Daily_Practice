// Last updated: 7/31/2025, 12:22:01 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        String x = s.trim();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                l = 0;
            else
                l++;
        }
        return l;

    }
}