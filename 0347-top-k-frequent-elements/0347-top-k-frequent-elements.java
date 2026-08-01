class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);

        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int e:map.keySet()){
            q.add(e);
        }
        int s=q.size();
        while(s>k){
            q.poll();
            s--;
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll();
        }
        return res;

        
    }
}