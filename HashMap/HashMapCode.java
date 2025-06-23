import java.util.*;

public class HashMapCode {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;
            Node next; // Adding 'next' for collision handling

            Node(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null; // Initialize next as null
            }
        }

        private int size; // Size of the hash table
        int N = 0; // Number of nodes
        private LinkedList<Node>[] buckets; // Buckets array

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 4;
            this.buckets = new LinkedList[4];

            // Initialize all the linked lists (buckets)
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            size = size * 2; // Double the size
            buckets = new LinkedList[size];

            // Reinitialize all the linked lists in the new bucket array
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Rehash the old nodes into the new buckets
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (Node node : ll) {
                    put(node.key, node.value); // Reinsert node into the new bucket
                }
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % size; // Return bucket index
        }

        // Find the node in the bucket linked list
        private Node findInLinkedList(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return node; // Return the node if found
                }
            }
            return null; // Return null if key is not found
        }

        public void put(K key, V value) // O(lambda) = constant time complexity
        {
            int bi = hashFunction(key); // Getting bucket index
            Node existingNode = findInLinkedList(key, bi);

            if (existingNode != null) {
                // Key exists, so update the value
                existingNode.value = value;
            } else {
                // Key doesn't exist, create a new node and insert it
                Node newNode = new Node(key, value);
                buckets[bi].add(newNode); // Add node to the linked list at index bi
                N++;
            }

            double lambda = (double) N / size; // Load factor

            if (lambda > 2.0) {
                rehash(); // Rehash if load factor exceeds 2
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // Getting bucket index
            Node node = findInLinkedList(key, bi);

            if (node == null) {
                return null; // Return null if key doesn't exist
            }
            return node.value; // Return the value if key is found
        }

        public int size() {
            return N;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            Node node = findInLinkedList(key, bi);

            if (node == null)
                return false;

            else {
                return true;
            }
        }

        public V removeKey(K key) {
            int bi = hashFunction(key);
            Node node = findInLinkedList(key, bi);

            if (node != null) {
                buckets[bi].remove(node);
                N--;
                return node.value;
            }

            else {
                return null;
            }
        }

           @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");

            // Iterate over all the buckets
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> bucket = buckets[i];
                for (Node node : bucket) {
                    sb.append(node.key).append(": ").append(node.value).append(", ");
                }
            }

            // Remove the last comma and space
            if (sb.length() > 1) {
                sb.setLength(sb.length() - 2); 
            }

            sb.append("}");
            return sb.toString();
        }

        public boolean isEmpty() {
            return (N > 0) ? false : true;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Sunday", 7);
        hm.put("Monday", 1);
        hm.put("Tuesday", 2);
        hm.put("Wednesday", 3);
        hm.put("Thrursday", 4);
        hm.put("Friday", 5);
        hm.put("Saturday", 6);
        System.out.println(hm.get("Monday")); // Should print 7
        System.out.println(hm.size());
        System.out.println(hm.containsKey("Sunday"));
        System.out.println(hm.removeKey("Monday"));
        System.out.println(hm.containsKey("Monday"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.toString());
    }
}
