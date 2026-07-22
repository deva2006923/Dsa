class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0||lists==null){
            return null;
        }
        ListNode n=lists[0];
        
        for(int i=1;i<lists.length;i++){
            n=merge(n,lists[i]);

        }
        return n;
        
    }
    public ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null&&b!=null){
            if(a.val>b.val){
                tail.next=b;
                b=b.next;
            }
            else{
                tail.next=a;
                a=a.next;
            }
            tail=tail.next;
        }
        tail.next=(a!=null)?a:b;
        return dummy.next;
    }
}
