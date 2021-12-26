package Weekly.Week5;

public class Test {
    public static  void main(String[] args){

        LinkedListTest list=new LinkedListTest();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.printList();
        System.out.println("getting data at any pos");
        System.out.println(list.getDataAtAnyPos(2));
        System.out.println("after removing data");
        list.removeDataAtAnyPos(2);
        list.printList();
    }
}
