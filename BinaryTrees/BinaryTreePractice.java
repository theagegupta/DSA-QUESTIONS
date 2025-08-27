import java.util.*;
public class BinaryTreePractice {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree {
        Node root;

        BinaryTree(int nodes[]) {
            this.root = createTree(nodes);
        }

        // method to create a binary tree - this will return the root node.
        int i = -1;

        Node createTree(int nodes[]) {
            i++;

            if (nodes[i] == -1) {
                return null;
            }

            Node curr = new Node(nodes[i]);
            curr.left = createTree(nodes);
            curr.right = createTree(nodes);

            return curr;
        }

        Node getRoot() {
            return root;
        }

        void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");

            preOrder(root.left);
            preOrder(root.right);
        }

        void inOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        void postOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        void LevelOrderTraversal()
        {
            Queue<Node> q= new LinkedList<Node>();

            q.add(root);

            while(!q.isEmpty())
            {
                Node curr = q.poll();
                System.out.print(curr.data+" ");

                // if(curr == null)
                // {
                //     System.out.print(-1+" ");
                // }

                // else{

                    if(curr.left != null)
                    {
                        q.add(curr.left); 
                    }

                    if(curr.right != null)
                    {
                        q.add(curr.right); 
                    }
                // }
            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree bt = new BinaryTree(nodes);
        Node root = bt.getRoot();
        bt.preOrder(root);
        System.out.println();
        bt.inOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
        bt.LevelOrderTraversal();
    }
}
