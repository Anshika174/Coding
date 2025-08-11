public class Zig_Zag {
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
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void zig_zag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //2nd half reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //alternate merge
        Node left =head;
        Node right=prev;
        Node nextLeft;
        Node nextRight;
        while(left!=null && right!=null){
        //merge 
            nextLeft=left.next;
            left.next=right;
            nextRight=right.next;
            right.next=nextLeft;
        //update
            left=nextLeft;
            right=nextRight;

        }

    }
    public static void main(String args[]){
        Zig_Zag ll=new Zig_Zag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zig_zag();
        ll.print();

    }

}
