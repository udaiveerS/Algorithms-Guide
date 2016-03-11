package trees;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryTreeTest {
	static BinaryTree bt;
	
	public static void setUp() throws Exception {
		bt = new BinaryTree();
		Integer[] arr = {9,10,7,3,4,15,12};
		for(Integer i : arr)  {
			System.out.println(i);
			bt.addNodes(i, bt.root);
		}
	}

	@Test
	public void test() {
		bt.preOrder(bt.root);
	}

}
