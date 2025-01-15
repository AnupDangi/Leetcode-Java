
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge=new ListNode(0);
        ListNode temp=merge;
        while(list1!=null &&list2!=null){
            //if less than or equal list2 val append to temp node and update node ptr
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{//else append to list2 and update node ptr
                temp.next=list2;
                list2=list2.next;
            }
            //update temp node
            temp=temp.next;
        }
        if(list1!=null){//if list is not emptyremaining elements are in list1 add to temp
            temp.next= list1;
        }else{//else they might be in list2
            temp.next= list2;
        }

        return merge.next;
    }
}