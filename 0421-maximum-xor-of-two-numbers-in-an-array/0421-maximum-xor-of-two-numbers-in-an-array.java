class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxsum=0;
        TreeNode obj=new TreeNode();
        for(int ele:nums){
            obj.insert(ele);
        }
        for(int ele:nums){
            maxsum=Math.max(maxsum,obj.getmaxxor(ele));
        }
        return maxsum;
        
    }
}
class TreeNode{
    class Node{
        Node one;
        Node zero;
    }
    Node root;
    public TreeNode(){
        root=new Node();
    }
    void insert(int nums){
        Node cur=root;
        for(int i=31;i>=0;i--){
            int bits=(nums>>i)&1;
            if(bits==0){
                if(cur.zero==null){
                    cur.zero=new Node();
                }
                cur = cur.zero;
            }
            else{
                if(cur.one==null){
                    cur.one=new Node();

                }
                cur=cur.one;
            }
        }
    }
    public int getmaxxor(int nums){
        int sum=0;
        Node cur=root;
        for(int i=31;i>=0;i--){
            int bits=(nums>>i)&1;
            if(bits==1){
                if(cur.zero!=null){
                    sum+=(1<<i);
                    cur=cur.zero;
                }
                else{
                    cur=cur.one;
                }
            }
            else{
                if(cur.one!=null){
                    sum+=(1<<i);
                    cur=cur.one;
                }
                else{
                    cur=cur.zero;
                }
            }
        }
        return sum;
    }
}