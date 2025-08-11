public class CircularQueue {
    static class CQueue{
          static int rear;
          static int []arr;
          static int size;
          static int front;
        CQueue(int n){
            rear=-1;
            front=-1;
            arr=new int[n];
            size=n;
        }
        public static boolean isEmpty(){
        return rear==-1 && front==-1;
        }
        
        public static boolean isFull(){
        return (rear+1)%size==front;
        }
        public static void add(int data){
        if(isFull()){
            return;
        }
        if(front==-1){
        front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
        }
        public static int remove(){
        if(isEmpty()){
        return -1;
        }
        int result=arr[front];
        //last element
        if(rear==front){
        rear=front=-1;
        }
        else{
        front=(front+1)%size;
        }
        return result;
        }
        public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
        }

    }
    public static void main(String args[]){
        CQueue q=new CQueue(8);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        System.out.println(q.peek());
        
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }        
        
    }
}
