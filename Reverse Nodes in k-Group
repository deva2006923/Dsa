class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        ListNode newhead=null;
        ListNode prevtail=null;
        ListNode temp=head;
       
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        while(c>=k){
            ListNode prev=null;
            ListNode grouphead=cur;

            for(int i=0;i<k&&cur!=null;i++){
                ListNode nex2=cur.next;
                cur.next=prev;
                prev=cur;
                cur=nex2;
            }
            if(newhead==null){
                newhead=prev;
            }
            
            if(prevtail!=null){
                prevtail.next=prev;
            }
            prevtail=grouphead;
            c=c-k;
        }    
        if(cur!=null){
            prevtail.next=cur;
        }
        return newhead;
        
    }
}
