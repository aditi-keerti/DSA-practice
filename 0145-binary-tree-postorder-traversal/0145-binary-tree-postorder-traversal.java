class Solution {

    private void postorderTraversalHelper(
        TreeNode currentNode,
        List<Integer> result
    ) {
        // Base case: if the node is null, return
        if (currentNode == null) {
            return;
        }
        // Traverse left subtree
        postorderTraversalHelper(currentNode.left, result);
        // Traverse right subtree
        postorderTraversalHelper(currentNode.right, result);
        // Add the current node's value to the result list
        result.add(currentNode.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // Start traversal from root
        postorderTraversalHelper(root, result);
        return result;
    }
}