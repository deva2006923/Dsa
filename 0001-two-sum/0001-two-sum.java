class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> ans=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int val=target-nums[i];
        if(ans.containsKey(val)){
            return new int[]{ans.get(val),i};
        }
        ans.put(nums[i],i);
       }
        return new int[]{0,0};
    }
}    
    