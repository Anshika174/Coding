public class DoublyLinkedList{
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
    //remove first
    public static int removeFirst(){
        if(head==null){
            System.out.print("LL is empty");
            return Integer.MAX_VALUE;
        }
    int val=head.data;
    head=head.next;
    head.prev=null;
    return val;
    }
    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
    }
}