public class BST1 {
  //====================================
  //a nested Node class used in BST 
  class Node {
    //constructor
    private Node(int data){
      this.data = data;
      
      
    }
    public String toString(){
      return "the data " + this.data;      
      }
    //attributes
    private int data;
    private Node left;
    private Node right;
  }  //=== END of INNER NODE CLASS =====
  //====================================

  public BST1(){ //constructor
	  this.root = null;
  }
  
  /*
   * Insert interface for user - the data will be inserted starting from the BST root
   * @param data
   */
  public void insert(int data){
    if(this.root == null){//handle empty tree
      this.root = new Node(data);
    }else { //tree has nodes, then start at the root
      insert(this.root, data);
    }
  }
  /**
   * Helper method that inserts the nodes with BST properties
   * @param v - node/root to start with
   * @param data - data to be inserted
   */
  private void insert(Node v, int data){
    //====handle exception here
    if(v == null)
      return;
    //==============================
    if(v.data < data) { //insert to the right branch
      if(v.right != null){
	insert(v.right, data);
      }else{
	v.right = new Node (data);
      }  
    }else if (v.data > data){ //insert to the left branch
      if(v.left != null){
	 insert(v.left, data);
      }else{
	 v.left = new Node(data);
      }
    }
  }
  
  
   //traverse the tree pre-order fashion - this is the interface for the user
   public String preOrder(){
     return doPreOrder(this.root); //start at the root
   }
	
   //this is the actual code handling the pre-order traversal
   private String doPreOrder(Node v){
     if(v != null){
       return v.data + " " +
       doPreOrder(v.left) +
       doPreOrder(v.right);
			
     }else{ //nothing to do ==> extends out of the leaf
	return " ";
     }
   }
	
  //traverse the tree in-order fashion - this is the interface for the user
  public String inOrder(){
    return doInOrder(this.root); //start at the root
  }
	
  //this is the actual code handling the in-order traversal
  private String doInOrder(Node v){
    if(v != null){
      return doInOrder(v.left) +
             v.data + " " +
	     doInOrder(v.right);
				
    }else{ //nothing to do ==> extends out of the leaf
      return " ";
    }
  }

  /**
  public method to get the number of nodes in the BST
  */
  public int size(){
    if(this.root == null)
      return 0;
    return size(this.root);
  }

   //rank 
   public int rank(Node r){
      return 1 + size(r.left);
      }

  /** private method that actually find the number of nodes in the BST */
  private int size(Node v){
    if(v == null)
      return 0;
    return 1 + size(v.left) + size(v.right);
  }
   
// height method (for the tree)
   public static int treeHeight(Node root) 
   {
     if(root == null)
     	return 0;
     if(root.left==null && root.right == null)
     	return 0;
     return  1 + Math.max(treeHeight(root.left),treeHeight(root.right));
   }

     
// contains/search method that return a reference to the node in the BST (null if not found)

       public static Node contains(Node root, int x)
    {
        // Base case
        if (root == null)
            return null;
 
        // If key is present in current node,
        // return root
        if (root.data == x)
            return root;
 
        // Recur for remaining list
         if(root.data < x)
         return contains(root.right, x);
         
            return contains(root.left, x);
      
   
   }
   
   
   
     // find the max value of a binary tree 
      public static int max(Node root) {
        if(root == null) {
         System.out.println("Tree is empty");
         return -1;
        }
        //
        if(root.right == null) {
         return root.data;
        }
        return max(root.right);
       }
      
      
       // find the max value of a binary tree 
      public static int min(Node root) {
        if(null == root) {
         System.out.println("Tree is empty");
         return -1;
        }
        //we found the max value
        if(root.left == null) {
         return root.data;
        }
        return min(root.left);
       }
      
      
 // remove method (Naive option: if the node to be removed is not the leaf node ==> 
 //re-insert its children into the BST

 
   public static Node deleteNode(Node root, int key) {
        if(root == null) return root;
        if(key > root.data){ //move right
            root.right = deleteNode(root.right, key);
        }else if(key < root.data){ //move left
            root.left = deleteNode(root.left, key);
        }else{ //oh yes, we finally found the target
            if(root.left == null && root.right == null){ //hmm, its a leaf node; easy peasy
                root = null;
            }else if(root.right != null){ // oh, it has a right child, don't make it an orphan or is it old enough to become a parent ? lets find out
                root.data = successor(root); // my worthy successor
                root.right = deleteNode(root.right, root.data);
            }else{ //oh it seems that I do not have a worthy successor, fallback, fallback ...
                root.data = predecessor(root);
                root.left = deleteNode(root.left, root.data);
            }
        }
        return root;
    }
    /**
     * Return node's successor value
     * @param root
     * @return
     */
    private static int successor(Node root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    /**
     * Return node's predecessor value
     * @param root
     * @return
     */
    private static int predecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
      
   }
   // implement findKth method - finding the Kth element in the tree

 
 
 
 
 
 
       //attributes
  private Node root;// the BST root itself
  
  //=========== END OF BST ==============
  
  //=========== DRIVER ================
  public static void main(String[] args){
	  BST1 t = new BST1(); //create a BST
	  
	  //insert some data into the tree
	 
	  t.insert(2);
	  t.insert(1);
	  t.insert(3);
     t.insert(7);
     t.insert(14);
     t.insert(56);
     t.insert(-12);
     t.insert(4);
     
    
	  //print out the tree
	 /* System.out.println(t.preOrder()); //expected 5 2 1 3 7
	  System.out.println(t.inOrder()); //expected 1 2 3 5 7
	  
	  System.out.println("Tree size: " + t.size());
	  System.out.println("Tree height: " + treeHeight(t.root));
      System.out.println("Tree max: " + max(t.root));
      System.out.println("Tree min: " + min(t.root));
      System.out.println("contains: " + contains(t.root, 34));
      System.out.println("contains: " + contains(t.root, 7));
      System.out.println("rank: " + t.rank(t.root));*/
      System.out.println("delete node " + deleteNode( t.root,  56));
      System.out.println("delete node " + deleteNode( t.root,  4));
      System.out.println("delete node " + deleteNode( t.root,  14));
  }
}
