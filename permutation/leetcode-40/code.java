class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        helper(index+1,total+c[index],c,temp,t);           //picking all the elements
        temp.remove(temp.size()-1);
        while(index+1<c.length&&c[index]==c[index+1]){     //skiping the identical elements..
            index++;
        }
        helper(index+1,total,c,temp,t);
    }
}
