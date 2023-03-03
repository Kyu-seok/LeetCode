public class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        calculateDiameter(root);

        return diameter;

    }

    public int calculateDiameter(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;

        if (node.left != null) {
            leftHeight = calculateDiameter(node.left);
        }

        if (node.right != null) {
            rightHeight = calculateDiameter(node.right);
        }

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;

    }

}
