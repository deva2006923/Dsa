class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public String getPermutation(int n, int k) {
        boolean[] v=new boolean[n];
        bt(n,v,new ArrayList<>());
        String res="";
        for(int i=0;i<ans.get(k-1).size();i++){
            int ele=ans.get(k-1).get(i);
            res+=String.valueOf(ele);
        }
        return res;


    }
    public void bt(int n,boolean[] v,List<Integer> temp){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=1;i<=n;i++){
            if(v[i-1]){
                continue;
            }
            v[i-1]=true;
            temp.add(i);
            bt(n,v,temp);
            v[i-1]=false;
            temp.remove(temp.size()-1);
        }

        
    }
}
