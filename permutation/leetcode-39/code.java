class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(0,0,candidates,new ArrayList<>(),target);
        return ans;
    }
    void helper(int index,int total,int[] c,List<Integer> temp,int t){
        if(total==t){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(total>t||index==c.length){
            return;
        }
        temp.add(c[index]);
        helper(index,total+c[index],c,temp,t);
        temp.remove(temp.size()-1);
        helper(index+1,total,c,temp,t);

    }
}
