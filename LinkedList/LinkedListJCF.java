import java.util.LinkedList;

public class LinkedListJCF {

    public static void main(String[] args) {
        // create - objects - int , float, boolean ->Integer, Float, Boolean 
        LinkedList<Integer> ll = new LinkedList<>();

        //  add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(1,10);
        System.out.println(ll);
        
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        // System.out.println("Head is :"+ll.);

    }
}