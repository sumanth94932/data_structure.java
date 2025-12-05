class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queuemethod{
    private Node front = null;
    private Node rear = null;

    public void enQueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue(){
        if(front == null){
            System.out.println("empty");
            return;
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
    }

    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void frontvalue(){
        if(front == null){
            System.out.println("empty");
        } else {
            System.out.println("element is: " + front.data);
        }
    }
}

class Queue {   // THIS MUST MATCH THE FILE NAME queue.java
    public static void main(String[] args){
        Queuemethod q = new Queuemethod();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.display();
        q.frontvalue();

        q.dequeue();
        q.display();
        q.frontvalue();
    }
}
