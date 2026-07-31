
//count the number of nodes
//traverse c-n nodes point the temp to the n-1 th element
//then temp.next will be temp.next.next

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        } 
        if(c==n){
            //head.next=null;
            return head.next;
        }

        temp=head;
        for(int i=1;i<c-n;i++){
            temp=temp.next;
           
        }
        temp.next=temp.next.next;
        return head;
        
    }
}
