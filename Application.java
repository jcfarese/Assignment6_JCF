/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DFS aSearch=new DFS();
		int level=0;
		aSearch.DFS(root, level);
		
		//sets height to the height of the tree
		int height = aSearch.height;
		int treeHeight = height+1;
		
		System.out.println("The height of the tree is: " + treeHeight);
		
	}

}