class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        Arrays.sort(nums);
        for(int n:nums){
            int s=outer.size();
            for(int i=0;i<s;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(n);
                if(!outer.contains(inner)){
                    outer.add(inner);
                }
            }
        }
        return outer;
        
    }
}
