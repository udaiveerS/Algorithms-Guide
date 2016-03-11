package trees;

import java.util.Stack;

public class BinaryTree {

	public Node root; 
	public static Stack<Node> st = new Stack<Node>();
	
	public BinaryTree() {
		this.root = new Node();
	}
	
	public void addNodes(Integer data, Node node) {
		if(node.data == null) {
			node = new Node();
			node.data = data;
			return; 
		}
		
		if(node.data > data) {
			if(node.right == null) {
				node.right = new Node(data);
				return; 
			} else {
				addNodes(data, node.left);
			}		
		}
		
		if(node.data < data) {
			if(node.left == null) {
				node.left = new Node(data);
				return; 
			} else {
				addNodes(data, node.right);
			}
		}
	}
	
	public void preOrder(Node node) {
		if(node == null || node.data == null) {
			return; 
		} else {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public static void dfs(Node node) {
		st.push(node); 
		
		while(!st.isEmpty()) {
			Node n = st.peek();
			
			Node left;
			if(n.left != null) {
				System.out.println(n.data);
				left = n.left;
				left.visited = true; 
				st.push(left); 
			} 
			
			System.out.println(n.data);

			Node right = n.right;
			if(n.right != null) {
				left = n.right;
				left.visited = true; 
				st.push(right); 
			}
			
			st.pop();
		}
	}
	
	private class Node {
		public Node left; 
		public Node right; 
		public Integer data; 
		public boolean visited = false; 
		
		public Node() {
			this.left = null;
			this.right = null;
			this.data = null;
		}
		
		public Node(Integer x) {
			this.left = null;
			this.right = null;
			this.data = x;
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Integer[] arr = {9,10,7,3,4,15,12};
		for(Integer i : arr)  {
			System.out.println(i);
			bt.addNodes(i, bt.root);
		}
		
//		bt.preOrder(bt.root);
		BinaryTree.dfs(bt.root);
	}
}
