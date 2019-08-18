package SolutionsLeetCode.SymmetricTree;

import Structures.TreeNode;
import java.util.Arrays;
import java.util.Stack;

public class SymmetricTree {


	TreeNode generateTree(String tree) {

		int[] arr = Arrays.stream(tree.substring(1, tree.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();
		TreeNode root = new TreeNode(arr[0]);
		int i = 1;
		while (true) {
			if (root == null) {

			}

		}
	}

	Stack<TreeNode> stack;

	// Recursive Solution
	public void preorder(TreeNode root) {
		if (root != null) {
			//Visit the node-Printing the node data
			preorder(root.left);
			preorder(root.right);
		}
	}


}
