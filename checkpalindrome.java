public class checkpalindrome {
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

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void print(){
        if(head==null){
            System.out.print("LinkedList is null");
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node findMidNode(Node head){
        Node slow=head;//+1
        Node fast=head;//+2
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
    //step1:find midnode of linked list
    Node mid=findMidNode(head);

    //step2:Reverse 2nd Half of linked list
    Node prev=null;
    Node curr=mid;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;

    //Step3: Check if Left half==right half
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;


    }
    public static void main(String args[]){
        checkpalindrome ll=new checkpalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.print(ll.checkPalindrome());



    }
}
