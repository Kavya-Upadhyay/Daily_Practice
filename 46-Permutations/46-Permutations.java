// Last updated: 7/31/2025, 12:22:10 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        back(list,new ArrayList<>(),nums);
        return list;
    }
    public void back(List<List<Integer>> list,List<Integer> temp ,int[] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                back(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}