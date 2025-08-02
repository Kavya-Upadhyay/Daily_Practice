// Last updated: 7/31/2025, 12:22:59 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int mlen=0;
        HashSet<Character> charSet=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            mlen=Math.max(mlen,right-left+1);
        }
        return mlen;
    }
}