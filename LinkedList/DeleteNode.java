package LinkedList;

public class DeleteNode {
    private static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    public static void main(String[] args) {
        MyLinkedList ml=new MyLinkedList();
        ml.addAtHead(52);
        ml.addAtHead(4);
        ml.addAtTail(43);
        ml.get(2);
        ml.display();
        ml.deleteNode(ml.getNode(1));
        ml.display();

    }
    //similar code is generated in MyLinkedList file and it is called here by it's object just to reduce repetitveness
    // public static void deleteNode(Node node) {
    //     node.val=node.next.val;
    //     node.next=node.next.next;
    // }
    
}
