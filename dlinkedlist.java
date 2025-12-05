class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class doublylinkedlistmethod {
    private Node head = null;
    private Node tail = null;

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void forwardtravels() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void backwardtraversal() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void deleteEndone(){
        if(tail==null){
            System.out.println("empty");
            return;
        }
        tail=tail.prev;
        if(tail!=null){
            tail.next=null;
        }
        else{
            head=null;
        }
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }else{
            tail=null;
        }
    }
}

public class dlinkedlist {
    public static void main(String args[]) {
        doublylinkedlistmethod d = new doublylinkedlistmethod();
        d.addEnd(10);
        d.addEnd(30);
     
        System.out.println("forward traversal");
        d.forwardtravels();  

        System.out.println("backward traversal");
        d.backwardtraversal();
         
         d.deletefirst(); 
        System.out.println("afetr delete first node:");
        d.forwardtravels();
       
        d.deleteEndone();
        System.out.println("afetr delete endone node:");
        d.backwardtraversal();

    }
}
