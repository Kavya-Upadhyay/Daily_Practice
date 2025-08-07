// Last updated: 7/31/2025, 12:22:35 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1=new ArrayList<>();
        parentheses(n,0,0,"",l1);
        return l1;
    }
    public static void parentheses(int n,int closed,int open,String ans,List<String> l1) {
		if(open==n && closed==n) {
			l1.add(ans);
			return;
			
		}
		if(open>n || closed>open) {
			return;
		}
		parentheses(n,closed,open+1,ans+"(",l1);
		parentheses(n,closed+1,open,ans+")",l1);
	}
}