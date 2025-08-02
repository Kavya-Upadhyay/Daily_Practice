// Last updated: 7/31/2025, 12:22:55 PM
class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        StringBuilder arr[] = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i] = new StringBuilder();
        }
        int index = 0 ;
        while(index<n){
            for(int i=0;i<numRows && index<n;i++){
                arr[i].append(s.charAt(index++));
            }
            for(int i=numRows-2;i>0 && index<n;i--){
                arr[i].append(s.charAt(index++));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder i:arr){
            sb.append(i);
        }
        return sb.toString();
    }
}