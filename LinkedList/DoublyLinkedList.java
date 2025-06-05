// package DSA QUESTIONS.LinkedList;

public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // now add the newnode at last

        tail = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }

    public void printDL() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

        System.out.println("null");

    }

    public int remvoveLast() {
        if (size == 0 || head == null) {
            System.out.println("Can't delete an element from an empty linked list");
            return -1;
        }

        else if (size == 1) {
            size--;
            int data = head.data;
            head = tail = null;
            return data;
        }
        
        size--;
        Node curr = head;
        while (curr.next.next != null) // reaches till last second node
        {
            curr = curr.next;
        }
        int data = curr.next.data;
        curr.next.prev = null;
        curr.next = null;
        return data;

    }

    public int removeFirst() {
        if (head == null) // can't remove from a empty ll
        {
            System.out.println("Cannot remove from a doubly linked list");
            return -1;
        }

        else if (size == 1) {
            size--; // becz a node is getting deleted
            int data = head.data;
            head = tail = null;
            return data;
        }

        // when size is greater than 1

        size--;
        int data = head.data;
        head = head.next;
        head.prev = null;
        return data;

    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(45);
        dl.printDL();
        dl.addLast(32);
        dl.printDL();
        dl.addFirst(24);
        dl.addLast(93);
        System.out.println("Size:" + size + " Head:" + head.data + " Tail:" + tail.data);
        System.out.println("Removed node: " + dl.removeFirst() + " size: " + size + " New head: " + head.data);
        DoublyLinkedList.head = null;
        System.out.println("Removed element from last: "+dl.remvoveLast());
    }
}
