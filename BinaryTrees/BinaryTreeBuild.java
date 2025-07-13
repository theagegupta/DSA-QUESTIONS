// package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeBuild {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1; // to track the index of the nodes array

        public Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) 
            {
                Node curr = q.remove();

                if (curr == null) {
                    System.out.println();
                
                    if (q.isEmpty()) {
                        break;
                    }

                    else {
                        q.add(null);
                    }
                }

                else {
                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }

                    System.out.print(curr.data + " ");
                }

            }
        }

        public int height(Node root)
        {
            if(root == null)
            {
                return 0; 
            }

            int currHeight = Math.max(height(root.left), height(root.right)) + 1; 
            return currHeight; 
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        // System.out.println(root.data);
        bt.preOrder(root);
        System.out.println();
        bt.inOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
        bt.levelOrder(root);
        System.out.println("Height of the tree is : "+bt.height(root));
    }
}
