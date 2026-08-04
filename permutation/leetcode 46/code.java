class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] v=new boolean[nums.length];
        bt(nums,v,new ArrayList<>());
        return ans;
        
    }
    public void bt(int[] nums,boolean[] v,List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(v[i]){
                continue;
            }
            v[i]=true;
            temp.add(nums[i]);
            bt(nums,v,temp);
            v[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}
