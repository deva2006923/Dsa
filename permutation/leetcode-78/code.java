class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int n:nums){
            int s=outer.size();
            for(int i=0;i<s;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }

        }
        return outer;
        
    }
}
