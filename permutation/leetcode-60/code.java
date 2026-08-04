class Solution {
    boolean found=false;
    String ans="";
    int count=0;
    public String getPermutation(int n, int k) {
        boolean[] v=new boolean[n];
        bt(n,v,new ArrayList<>(),k);
        return ans;
        


    }
    public void bt(int n,boolean[] v,List<Integer> temp,int k){
        if(found){
            return;
        }
        if(temp.size()==n){
            count++;
        }
        if(count==k){
            StringBuilder res=new StringBuilder();
            for(int i=0;i<temp.size();i++){
                res.append(String.valueOf(temp.get(i)));
            }
            ans=res.toString();
            found=true;
        }
        
        for(int i=1;i<=n;i++){
            if(v[i-1]){
                continue;
            }
            v[i-1]=true;
            temp.add(i);
            bt(n,v,temp,k);
            v[i-1]=false;
            temp.remove(temp.size()-1);
        }

        
    }
}
