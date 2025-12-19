import java.util.*;

class BST {
	int data;
	BST left;
	BST right;

	BST(int data) {
		this.data = data;
		left = right = null;
	}

	static void inorder(BST node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	static void preorder(BST node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	static void postorder(BST node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	static void levelorder(BST node) {
		if (node == null) {
			return;
		}
		Queue<BST> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			BST curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				q.offer(curr.left);
			}
			if (curr.right != null) {
				q.offer(curr.right);
			}
		}
	}

	static int countleafs(BST node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		return countleafs(node.left) + countleafs(node.right);
	}

	static int height(BST node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	static void insert(BST node, int val) {
		if (node == null) {
			node = new BST(val);
		}
		if (val < node.data) {
			if (node.left == null) {
				node.left = new BST(val);
			} else {
				insert(node.left, val);
			}
		} else if (val > node.data) {
			if (node.right == null) {
				node.right = new BST(val);
			} else {
				insert(node.right, val);
			}
		}
	}

	static boolean search(BST node, int key) {
		if (node == null) {
			return false;
		}
		if (node.data == key) {
			return true;
		} else if (key > node.data) {
			return search(node.right, key);
		} else {
			return search(node.left, key);
		}
	}

	static int minnode(BST node) {
		if (node == null) {
			return 0;
		}
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

	static int maxnode(BST node) {
		if (node == null) {
			return 0;
		}
		while (node.right != null) {
			node = node.right;
		}
		return node.data;
	}

	public static void main(String[] args) {
		BST node = new BST(5);

		// --------- insert nodes----------
		insert(node, 3);
		insert(node, 2);
		insert(node, 4);
		insert(node, 1);
		insert(node, 7);
		insert(node, 6);
		insert(node, 8);

		System.out.print("Inorder traversal: ");
		inorder(node);
		System.out.println();

		System.out.print("Preorder traversal: ");
		preorder(node);
		System.out.println();

		System.out.print("Postorder traversal: ");
		postorder(node);
		System.out.println();

		System.out.print("Level order traversal: ");
		levelorder(node);
		System.out.println();

		System.out.println("Leaf count: " + countleafs(node));

		System.out.println("Height of tree: " + height(node));

		System.out.println("Minimum node: " + minnode(node));

		System.out.println("Maximum node: " + maxnode(node));

		int key = 7;
		System.out.println("Key found: " + search(node, key));
	}

}
