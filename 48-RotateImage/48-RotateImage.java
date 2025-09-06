// Last updated: 7/31/2025, 12:22:08 PM
class Solution {
    public void rotate(int[][] num) {
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;
            }
        }
        for(int k=0;k<n;k++){
            int l=0,r=n-1;
            while(l<r){
                int temp=num[k][l];
                num[k][l]=num[k][r];
                num[k][r]=temp;
                l++;
                r--;
            }
        }
    }
}