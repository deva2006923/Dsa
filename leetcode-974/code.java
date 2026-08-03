class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int ele:nums){
            sum+=ele;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            c+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
        
    }
}
