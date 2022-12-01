/**
 * @author Nathan Johnson, Bellarmine University
 * @author Jim Farese
 * 
 * @version 12/1/2022
 *
 */
public class DFS {

	//creates node named root, creates an integer called traversed nodes and sets it to 0, creates an integer called height and sets it to 0.
	Node root;
	int traversedNodes=0;
	int height=0;
	
	//DepthFirstSearch method
	public void DepthFirstSearch() {
		
		System.out.println("Call DFS with the root node to do a Depth First Search.");
	}//end DepthFirstSearch method
	
	/**
	 * 
	 * @param node used to get the data of the node that is current being traversed
	 * @param level used to get the level of the nodes being traversed
	 */
	public void DFS(Node node, int level) {
		
		//prints the data of the current node traversed
		System.out.println(node.getData());
		
		//prints the number of nodes traversed as they are being traversed
		if(node != null){
			height=level;
			traversedNodes++;
			System.out.println("The number of nodes traversed is: " + traversedNodes);
		}
		
		//gets the left child of the current node if there is one
		if(node.getlChild()!=null) {
			DFS(node.getlChild() ,level+1);
		}
		
		//gets the right child of the current node if there is one
		if(node.getrChild()!=null) {
			DFS(node.getrChild(), level+1);
		}
		
	
		
	}//end DFS method

}//end DFS class
