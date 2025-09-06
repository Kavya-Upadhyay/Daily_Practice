// Last updated: 7/31/2025, 12:22:07 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>(Arrays.asList(word)));
            }
            else{
                map.get(sorted).add(word);
            }
        }
        return new ArrayList<>(map.values());
    }
}