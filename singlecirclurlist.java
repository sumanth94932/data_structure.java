class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class singlecircularlistmethod {
    private Node head = null;

    public void insertbyposition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            insertatfirst(data);
            return;
        }

        Node temp = head;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            if (temp == head) {  
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertatend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void insertatfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        if (head.next == head) {  
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) { 
            temp = temp.next;
        }

        head = head.next;   
        temp.next = head;   
    }
     public  void deletelast(){
          if (head == null) {
            System.out.println("empty");
            return;
        }

        if (head.next == head) {  
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) { 
            temp = temp.next;
        }
        temp.next = head;
        

    }
    public void  deletebyposition(){
        
    }

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }
   
}

public class singlecirclurlist {
    public static void main(String args[]) {
        singlecircularlistmethod n = new singlecircularlistmethod();
        n.insertatend(10);
        n.insertatend(20);
        n.insertatend(40);

        n.display();

        n.deletefirst();
        System.out.println("After deleting first:");
        n.display();
        n.deletelast();
        System.out.println("After deleting last:");
        n.display();
    }
}
