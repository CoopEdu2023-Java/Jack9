import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;



class TreeNode<T> {
    T value;
    TreeNode left;
    TreeNode right;

    public TreeNode(T x) {
        this.value = x;
        this.left = null;
        this.right = null;
    }
}
private void preorderTraversal(TreeNode root) {
    if (root != null) {
        System.out.println(root.value);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
private void inorderTraversal(TreeNode root) {
    if (root != null) {
        inorderTraversal(root.left);
        System.out.println(root.value);
        inorderTraversal(root.right);
    }
}
private void postorderTraversal(TreeNode root) {
    if (root != null) {
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.value);
    }
}
public void levelOrderTraversal(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>(Arrays.asList(root));
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}