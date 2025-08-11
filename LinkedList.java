public class LinkedList {
    public static class Node{
        //properties
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //methods for operations
    public void addFirst(int data){
        //step1-create a new node
        Node newNode=new Node(data);
        size++;
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
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        if(head==null){
            addFirst(data);
            return;
        }
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            return Integer.MIN_VALUE;//will not return any valid value 
        }
        else if(size==1){
        head=tail=null;
        size=0;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
    if(size==0){
        return Integer.MIN_VALUE;

    }
    else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    }
    
    Node prev=head;
    int val=prev.next.data;
    for(int i=0;i<size-2;i++){ //prev reache to just before last node
    prev=prev.next;
    }
    prev.next=null;
    tail=prev;
    size--;
    return val;
    }
    public int itrSearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
        temp=temp.next;
        i++;
        }
    return -1;
    } 
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
        
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//as curr is null so prev is head node
    }
    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){//nth from end means first from start
            head=head.next;//remove First
            return;
        }
        //sz-n
        int i=1;//as n is not haed
        int itoFind=sz-n;
        Node prev=head;
        while(i<itoFind){
        prev=prev.next;
        i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        //ll.removeFirst();
        //ll.print();
        //ll.removeLast();
        //ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(3,4);
        ll.print();
        //System.out.println("Size of LinkedList = "+ll.size);
        //System.out.println(ll.itrSearch(9));
        //System.out.println(ll.itrSearch(7));
        //System.out.println(ll.recSearch(4));
        //System.out.println(ll.recSearch(8));
        //ll.reverse();
        //ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
//Output :Node1(1)->Node2(2)->Node3(3)->Node4(4)->Null
