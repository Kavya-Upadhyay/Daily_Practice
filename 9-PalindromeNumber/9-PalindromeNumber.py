# Last updated: 7/31/2025, 12:22:56 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
           return False

        reversed_num=0
        temp=x

        while temp!=0:
            digit=temp%10
            reversed_num=reversed_num*10+digit
            temp//=10
        return reversed_num==x        