public class Merge_Sorting {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void addFirst(int data){
        //step1-create a new node
        Node newNode=new Node(data);
        // Case1:empty linked list
        if(head==null){
            head=tail=newNode;
            return;
        }
        //Case2:not empty
        //step2-newNode next = head
        newNode.next=head;
        //step3-make newNode = head
        head=newNode;
    }
    public static Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergedLL.next;
        


    }
    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge_Sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);

        //merge sort left and right halves
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=merge_Sort(head);
        Node newRight=merge_Sort(rightHead);

        //merge both halves
        return merge(newLeft,newRight);
    }
    public static void main(String args[]){
        Merge_Sorting ll=new Merge_Sorting();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.merge_Sort(ll.head);
        ll.print();

    }
}
