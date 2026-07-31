

//create new listnode then traverse each node from both the l1 and l2 node then add the of it and create a new node for that value and join it to the new listnode that we created


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int c=0;
        while(l1!=null||l2!=null){
            
           // ListNode carry=new ListNode(c);
            int n1=(l1==null)?0:l1.val;
            int n2=(l2==null)?0:l2.val;
            
            int sum=n1+n2+c;
            tail.next=new ListNode(sum%10);
            c=sum/10;
            //tail.next=new ListNode(sum%10);
            
            tail=tail.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }
        if(c!=0){
            tail.next=new ListNode(c);
        }
        return dummy.next;

        
    }
