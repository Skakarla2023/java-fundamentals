import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    static void inorder(TreeNode n) {
        if (n == null) {
            return;
        }
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }

    static void preorder(TreeNode n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preorder(n.left);
        preorder(n.right);
    }

    static void postorder(TreeNode n) {
        if (n == null) {
            return;
        }
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data + " ");
    }

    static void levelorder(TreeNode n) {
        if (n == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(n);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    static int height(TreeNode n) {
        if (n == null) {
            return 0;
        }
        return 1 + Math.max(height(n.left), height(n.right));
    }

    static int minnode(TreeNode n) {
        if (n == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(n.data, Math.min(minnode(n.left), minnode(n.right)));
    }

    static int maxnode(TreeNode n) {
        if (n == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(n.data, Math.max(maxnode(n.left), maxnode(n.right)));
    }

    static void mirror(TreeNode n) {
        if (n == null) {
            return;
        }

        TreeNode temp = n.left;
        n.left = n.right;
        n.right = temp;

        mirror(n.left);
        mirror(n.right);
    }

    static boolean isBalanced(TreeNode n) {
        if (n == null) {
            return true;
        }

        int lh = height(n.left);
        int rh = height(n.right);

        if (Math.abs(lh - rh) > 1)
            return false;

        return isBalanced(n.left) && isBalanced(n.right);
    }

    static boolean search(TreeNode n, int target) {
        if (n == null) {
            return false;
        }
        if (n.data == target) {
            return true;
        }
        return search(n.left, target) || search(n.right, target);
    }

    static void insert(TreeNode n, int val) {
        if (n == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(n);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left == null) {
                curr.left = new TreeNode(val);
                return;
            } else {
                q.add(curr.left);
            }

            if (curr.right == null) {
                curr.right = new TreeNode(val);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);

        insert(n, 2);
        insert(n, 3);
        insert(n, 4);
        insert(n, 5);
        insert(n, 6);

        System.out.print("Inorder Traversal: ");
        inorder(n);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        preorder(n);
        System.out.println();

        System.out.print("Postprder Traversal: ");
        postorder(n);
        System.out.println();

        System.out.print("Level order Traversal: ");
        levelorder(n);
        System.out.println();

        System.out.println("Height of tree: " + height(n));
        System.out.println("Minimum value: " + minnode(n));
        System.out.println("Maximum value: " + maxnode(n));

        int target = 4;
        System.out.println("Search " + target + ": " + search(n, target));

        System.out.println("Is Tree balanced? " + isBalanced(n));

        System.out.println("Mirror the tree >>");
        mirror(n);

        System.out.println("Level order after mirror: ");
        levelorder(n);
    }
}
