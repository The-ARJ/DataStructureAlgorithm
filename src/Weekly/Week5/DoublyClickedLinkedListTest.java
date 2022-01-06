package Weekly.Week5;

public class DoublyClickedLinkedListTest {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node head=null;
        Node tail=null;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        public void addNode(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=tail=newnode;
            }
            else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }

    }

    }

}
