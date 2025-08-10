# Last updated: 7/31/2025, 12:22:28 PM
class Solution:
    def strStr(self, haystack,needle):
        for i in range(len(haystack)-len(needle)+1):
            if haystack[i:i+len(needle)]==needle:
                return i
        return -1        
        