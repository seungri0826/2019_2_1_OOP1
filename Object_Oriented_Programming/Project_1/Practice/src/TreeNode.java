
import java.util.ArrayList;

public class TreeNode {

	public TreeNode parent;
	public String data;
	public ArrayList<TreeNode> childs;
	
	
	public TreeNode(String data) {
		this.data = data;
		this.childs = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode("1");
		TreeNode node2 = new TreeNode("2");
		TreeNode node3 = new TreeNode("3");
		TreeNode node4 = new TreeNode("4");
		TreeNode node5 = new TreeNode("5");
		
		node1.childs.add(node2);
		node1.childs.add(node3);
		node1.childs.add(node4);
		
		node2.parent = node1;
		node3.parent = node1;
		node4.parent = node1;
		
		node2.childs.add(node5);
		node5.parent = node2;
		
		printTree("start ", node1);
	}
	
	public static void printTree(String str, TreeNode node) {
		
		for(TreeNode child : node.childs) {
			String s = str + "->" + child.data;
			
			if(child.childs.size() != 0)
				printTree(s, child);
			else 
				System.out.println(s);
		}
	}
	
	
}