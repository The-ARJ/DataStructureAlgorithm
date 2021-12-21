package Weekly.Week4;

public class QueueDataStructure {
    int front,rare,size;
    int[] queue;

public QueueDataStructure(int n){
    this.front = this.rare=-1;
    this.size = n;
    queue = new int[n];

}
public void enqueue(int data){
    if(isFull()){
        System.out.println("Queue Overflow");
    }else {
        if(isEmpty()){
            front = rare=0;
        }
        queue[++rare] = data;
    }
}
public int dequeque(){
   if(isEmpty()){
       System.out.println("Queue under flow");
       return -9999;
   }
   else {
       int temp = front;
       if(front==rare){
           front=rare=-1;
       }
       else{
           front++;
       }
       return queue[temp];
   }
}
public boolean isEmpty(){
    return front == -1 && rare == -1;
}
public boolean isFull(){
    return rare == size-1;
}
public int peek(){
    return queue[front];
}
}

