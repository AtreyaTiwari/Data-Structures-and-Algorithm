package LinkedList;

public class MyLinkedList {
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
    
    public MyLinkedList() {
        
    }
    
    public Node getNode(int index) {
        if(index<0 || index>=size){
            return null;
        }    
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void deleteNode(Node node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }    
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        if(size==0){
            tail=head;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(size==0){
            addAtHead(val);
        }else{
            tail.next=new Node(val);
            tail=tail.next;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return ;
        }else if(index==0){
            addAtHead(val);
        }else if(index==size){
            addAtTail(val);
        }else{
            Node temp=head;
            Node newNode=new Node(val);
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return ;
        else if(size==1){
            head=null;tail=null;
        }
        else if(index==0){
            head=head.next;
        }else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
                if(index==size-1){
                    tail=temp;
                }
        }
        size--;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        MyLinkedList obj=new MyLinkedList();
        obj.addAtHead(56);
        obj.addAtTail(24);
        obj.addAtIndex(1, 28);
        obj.display();
        obj.addAtTail(29);
        obj.addAtHead(78);
        obj.addAtIndex(3, 57);
        obj.display();
        obj.deleteAtIndex(2);
        obj.display();
        System.out.println(obj.get(2));
    }
}
