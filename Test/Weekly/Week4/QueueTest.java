package Weekly.Week4;

public class QueueTest {
    public static void main(String[] args) {
        QueueDataStructure q = new QueueDataStructure(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeque());
        System.out.println(q.dequeque());
    }
}
