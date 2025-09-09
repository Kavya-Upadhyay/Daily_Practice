// Last updated: 7/31/2025, 12:22:03 PM
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> lst = new ArrayList<>();
        
        // Handle edge case where matrix is empty
        if (arr == null || arr.length == 0) {
            return lst;
        }
        
        int minc = 0;
        int minr = 0;
        int maxc = arr[0].length - 1;
        int maxr = arr.length - 1;

        while (minr <= maxr && minc <= maxc) { 
            // Traverse from left to right along the top row
            for (int i = minc; i <= maxc; i++) {
                lst.add(arr[minr][i]);
            }
            minr++;
            
            // Traverse down the rightmost column
            for (int i = minr; i <= maxr; i++) {
                lst.add(arr[i][maxc]);
            }
            maxc--;
            
            // Traverse from right to left along the bottom row (only if still within bounds)
            if (minr <= maxr) {
                for (int i = maxc; i >= minc; i--) {
                    lst.add(arr[maxr][i]);
                }
                maxr--;
            }
            
            // Traverse up the leftmost column (only if still within bounds)
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    lst.add(arr[i][minc]);
                }
                minc++;
            }
        }
        
        return lst;
    }
}
