// import LinkedList.Node;

public class MergeSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(1);
        ll.addLast(51);
        ll.addLast(70);
        ll.addLast(30);
        ll.addLast(23);
        ll.addLast(13);
        ll.addLast(62);
        ll.addLast(95);
        ll.addLast(12);
        ll.addLast(0);

        System.out.println("Original Linked List:");
        ll.printLinkedList();

        ll.head = mergeSort(ll.head);

        System.out.println("Sorted Linked List: ");
        ll.printLinkedList();

        
    }

    public static Node mergeSort(Node head)
    {
        if(head == null || head.next==null)
            return head;
    
            Node leftHalfLast = mid(head);
            Node rightHead = leftHalfLast.next;
            leftHalfLast.next = null;  // splitting the left and right half
            
            
            Node leftSorted = mergeSort(head);
            Node rightSorted = mergeSort(rightHead);

            return merge(leftSorted, rightSorted);
    }

    public static Node merge(Node leftHead, Node rightHead)
    {
        Node dummy = new Node(-1); // stores the head of resultant sorted linked list
        Node curr = dummy;

        while(leftHead != null && rightHead != null)
        {
            if(leftHead.data<=rightHead.data)
            {
                curr.next = leftHead;
                leftHead = leftHead.next;
            }

            else{
                curr.next  = rightHead;
                rightHead = rightHead.next;
            }

            curr = curr.next;
        }

        //Attach remaining nodes

        if(leftHead!=null) curr.next = leftHead;
        if(rightHead!=null) curr.next = rightHead;

        return dummy.next;
    }

    public static Node mid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; // will contain the mid element
            fast = fast.next;

        }

        return slow;
    }
}


 class Node{
    int data; 
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
 class LinkedList
{

    public Node head;

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head ==null)
        {
            head = newNode;
        }

        else{
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }

            // we will get the last node in curr
            curr.next = newNode;
        }

    }

    public void printLinkedList()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

}