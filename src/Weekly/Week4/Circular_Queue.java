package Weekly.Week4;

public class Circular_Queue {
    int front;
    int rear;
    int size;
    int[]queue;
    Circular_Queue(int n){
        front = rear = -1;
        size = n;
        queue = new int[n];
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue OverFlow");
        }
        else{
            if(isEmpty()){
                front = rear = 0;
                queue[rear]=data;
            }
            else{
                rear = (rear + 1) % size;
                queue[rear] = data;
            }
        }
    }
    public int dequeue(){
        int temp = front;
        if (isEmpty()){
            System.out.println("Queue Under Flow");
            return -99999;
        }
        else if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1)%size;
        }
        return queue[temp];
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return (rear + 1 )% size == front;
    }
}
