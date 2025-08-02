// Last updated: 7/31/2025, 12:22:50 PM
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        for(int i=x;i>0;i=i/10){
            int rem=i%10;
            sum=sum*10+rem;
        }
        if(sum==x)
        return true;
        else
        return false;
        
    }
}