// Last updated: 7/31/2025, 12:21:59 PM
class Solution {
    public boolean isNumber(String s) {
        boolean digitSeen=false,eSeen=false,dotSeen=false;
        int c=0;
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch)) digitSeen=true;
            else if(ch=='+'||ch=='-'){
                if(c==2) return false;
                if(i>0&&s.charAt(i-1)!='E'&&s.charAt(i-1)!='e') return false;
                if(i==s.length()-1) return false;
                c++;
            }
            else if(ch=='.'){
                if(eSeen||dotSeen) return false;
                if(i==s.length()-1&&!digitSeen)return false;
                dotSeen=true;
            }
else if (ch == 'E' || ch == 'e') {
                if (eSeen || !digitSeen || i == s.length() - 1) {
                    return false; // Cannot have multiple 'e/E', must follow a number, must not be last
                }
                eSeen = true;
            }
            // Invalid character case
            else {
                return false;
            }
        }
        return true;
    }
}