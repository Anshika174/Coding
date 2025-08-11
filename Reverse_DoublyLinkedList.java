public class Reverse_DoublyLinkedList{
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
    public static void addFirst(int data){
       Node newNode=new Node(data);
       if(head==null){
        head=tail=newNode;
        return;
       }
       newNode.next=head;
       head.prev=newNode;
       head=newNode;
       size++;
    }
    public static void print(){
        if(head==null){
            System.out.print("null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
    public static void main(String args[]){
    Reverse_DoublyLinkedList dll=new Reverse_DoublyLinkedList();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.print();
    dll.reverse();
    dll.print();
    }
}
        

