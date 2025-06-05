public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLinkedList();
        ll.insertAtLast("This");
        ll.insertAtLast("is");
        ll.insertAtLast("a");
        ll.insertAtLast("mouse.");
        ll.printLinkedList();
        ll.insertInBetween("xyz", 1);
        ll.printLinkedList();
        System.out.println("size is:" +ll.size );

        LinkedList ll2 = new LinkedList();
        // ll2.insertAtBeginning("Hii");
        // ll2.insertAtLast("i");
        // ll2.insertAtLast("am");
        // ll2.insertAtLast("Ayush");
        // ll2.printLinkedList();
        // System.out.println(ll2.size);

        // System.out.println(ll2.removeFirst());  // remove from starts
        // ll2.printLinkedList();
        // System.out.println(ll2.removeLast());  // remove from last 
        // ll2.printLinkedList();
        ll2.insertAtLast("am");
        ll2.insertAtLast("Inevitable");
        ll2.insertAtLast("Iron");
        ll2.insertAtLast("Man");
        ll2.printLinkedList();
        System.out.println(ll2.removeNthNode(3));
        System.out.println(ll2.size);
        ll2.insertAtBeginning("I");
        ll2.printLinkedList();
        System.out.println("Iterative Search: "+ll2.search("I"));
        System.out.println("Recursive Search: "+ll2.resursiveSearch("Inevitabl",ll2.head, 0));
        ll2.reverseLL();
    }
}

class LinkedList // represents ta single linked list
{
    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public  Node head; // creating a head node inside the linked list class
    public  Node tail;
    public int size;

    // method to add a new node at the begining
    void insertAtBeginning(String data) {

        // if linked list is empty
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if linked list consists of atleast one node
        newNode.next = head; // we will reference the next var of the new node with
        // the head node
        head = newNode;
    }

    void insertAtLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        tail = newNode;

        // tail.next = newNode;
        // tail = newNode;
    }

    void printLinkedList() {
        if (head == null) {
            System.out.println("Empty Linked List");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    void insertInBetween(String data, int idx) 
    {
        if (idx == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        int index = 0;
        Node currNode = head;

        while (index < idx - 1) {

            currNode = currNode.next; // currNode will point to the i-1th node
            index++;

        }

        newNode.next = currNode.next;
        currNode.next = newNode;

        // printLinkedList();
    }

    String removeFirst()
    {
        
        if(size==0)
        {
            System.out.println("Cannot remove an element from an empty linked list");
        }
        
        String val = head.data;
        head = head.next;
        size--;

        return val;
    }

    public String removeLast()
    {
        Node temp = head;

        while(temp.next.next != null) // this loop will give you thè second last node
        {
            temp = temp.next;
        } 
        
        String val = temp.next.data;
        temp.next = null; 
        tail = temp;
        size--;
        return val;
    }

    public String removeNthNode(int idx)
    {
    
        if(idx >= size)
        {
            System.out.println("Linked List index out of bounds");
            return "";
        }

        else if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.toString(Integer.MIN_VALUE);
        }

        else if(size == 1 && idx == 0)
        {
            String data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }

        Node tmp = head;
        size--;
        int index = 0;

        while(index<idx-1)
        {
            tmp = tmp.next;
            index++;
        }

        String data = tmp.next.data;
        tmp.next = tmp.next.next;
        return data;
    }

    public int search(String key)     // O(N) time complexity
    {
        // linearly search the data in the linked list and return the index if it is found
        Node temp = head;
        int idx = 0;

        while(temp != null)
        {
            if(temp.data.equals(key))
            {
                return idx;
            }

            idx++;
            temp = temp.next;
        }
        return -1;
    }

    public int resursiveSearch(String key, Node temp, int i)
    {
        if(temp == null || i==size)
        {
            return -1;
        }
         
        if(temp.data.equals(key))
        {
            return i;
        }

            return resursiveSearch(key, temp.next, ++i);
  
    }



    public void reverseLL()
    {
        Node next;
        Node previous = null;
        Node curr = tail = head;

        while(curr != null)
        {
            next = curr.next;
            curr.next=previous; 
            previous = curr;
            curr = next;
        }

        head = previous;

        this.printLinkedList();
    }
}