class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {

        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) {
            return;
        }
        if (image[r][c] != originalColor) {
            return;
        }
        image[r][c] = newColor;
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r, c + 1, originalColor, newColor); // right
        dfs(image, r, c - 1, originalColor, newColor); // left
    }
    class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result);   // Left
        result.add(node.val);         // Root
        inorder(node.right, result);  // Right
    }
}
}



