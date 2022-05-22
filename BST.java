/**
 * A Simple implementation of a BST
 * TODO: Implement 
 * 1. size method ^
 * 2. min/max methods ^
 * 3. height methods (both for the tree and any given branch) ^ havent made one of a individual branch
 * 3. contains/search method that return a reference to the node in the BST (null if not found)^
 * 4. remove method (Naive option: if the node to be removed is not the leaf node ==> re-insert its children into the BST
 *  (Should replace by max of left branch or min or right branch)^
 * 5. implement findKth method 
 *  
 *   
 * @author Kairee Gay
 *
 */
public class BST
 {
  //attributes
  private Node root;// the BST root itself
  static int count = 0;
  
  
  //a nested Node class used in BST 
  class Node
  {
    //constructor
    private Node(int data)
    {
      this.data = data; 
    }
    
    // toString method to show the objects data 
    public String toString()
    {
      return "data " + this.data;      
    }
    //attributes
    private int data;
    private Node left;
    private Node right;
  }  //=== END of INNER NODE CLASS =====
 


 //constructor
  public BST()
  {
	  this.root = null;
  }
  
  /*
    - Insert method for user 
    - the data will be inserted starting from the BST root
    - @param data - int value to insert put into new node 
   */
  public void insert(int data)
  {
    if(this.root == null)     //handle empty tree
    {
      this.root = new Node(data);
    }
    
    else //tree has nodes, then start at the root
    {
      insert(this.root, data);
    }
  }
  
  
  /**
   Helper method that inserts the nodes with BST properties
   @param v - node/root to start with
   @param data - data to be inserted
   */
  private void insert(Node v, int data)
  {
   
    if(v == null)
      return;
    
    
    //insert to the right branch
    if(v.data < data) 
    { 
      if(v.right != null)
      {
	      insert(v.right, data);
      }
      else
      {
	      v.right = new Node (data);
      }  
    }
    //insert to the left branch
    else if (v.data > data)
    { 
          if(v.left != null)
      {
	      insert(v.left, data);
      }
      else
      {
	      v.left = new Node(data);
      }
    }
  }
  
  
   //traverse the tree pre-order fashion - this is the interface for the user
   public String preOrder(){
     return doPreOrder(this.root); //start at the root
   }
	
   /*this is the actual code handling the pre-order traversal
   @parm */
   private String doPreOrder(Node v){
     if(v != null){
       return v.data + " " +
       doPreOrder(v.left) +
       doPreOrder(v.right);
			
     }else{ //nothing to do ==> extends out of the leaf
	return "";
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
      return "";
    }
  }


  /**
   method to get the number of nodes in the BST
  */
  
  public int size(){
    if(this.root == null)
      return 0;
    return size(this.root);
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

     //The rank of a node value in a tree 
   public int rank(Node r)
   {
      return 1 + size(r.left);
   }
 
   /* contains/search method that return a reference
    to the node in the BST (null if not found)
    @pram root - the root of the BST tree
    @pram x - int value to be found 
    @return - node that call toString 
    */


       public static Node contains(Node root, int x)
    {
        // Base case
        if (root == null)
            return null;
 
        if (root.data == x)
            return root;
 
       
         if(root.data < x)
         return contains(root.right, x);
         
            return contains(root.left, x);
      
   }
  
     /* find the max value of a binary tree
     -@parm root - 
     @return int
     */
      public static int max(Node root) 
      {
        if(root == null) {
         return -1;
        }
        
        if(root.right == null) {
         return root.data;
        }
        return max(root.right);
       }
      
      
       /* find the min value of a binary tree
     -@parm root - root of BST tree
      @return int
     */

      public static int min(Node root) {
        if(null == root) {
         System.out.println("Tree is empty");
         return -1;
        }

        if(root.left == null) {
         return root.data;
        }
        return min(root.left);
       }
      
      
   /*remove method (Naive option: if the node to be removed is not the leaf node ==> 
    re-insert its children into the BST
    @parm root- root of BST tree
    @parm key - 
    @return node 
    */ 

   public static Node deleteNode(Node root, int key)
    {
        if(root == null)   
         return root;
        if(key > root.data)
        { 
            root.right = deleteNode(root.right, key);
        }
        else if(key < root.data)
        { 
            root.left = deleteNode(root.left, key);
        }
        else
        { 
            if(root.left == null && root.right == null)
            { 
                root = null;
            }
            else if(root.right != null)
            { 
                root.data = nodeBefore(root); 
                root.right = deleteNode(root.right, root.data);
            }else
            {
                root.data = nodeAfter(root);
                root.left = deleteNode(root.left, root.data);
               
            }
        }
       return root;
    }
    /**
     -Return node's successor value 
     -@param root - root of BST tree
      -@return int
     */
    private static int nodeBefore(Node root)
    {
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    /**
     -Return node's predecessor value 
     -@param root -root of BST tree
      -@return int 
     */
    private static int nodeAfter(Node root)
    {
        root = root.left;
        while(root.right != null)
        {
            root = root.right;
        }
        return root.data;
      
    }  
   
  
       
  //=========== END OF BST ==============
  
  //=========== DRIVER ================
  public static void main(String[] args){
	  BST t = new BST(); //create a BST
	  
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
      System.out.println(t.preOrder()); //expected 5 2 1 3 7
	   System.out.println(t.inOrder()); //expected 1 2 3 5 7
	   System.out.println("Tree size: " + t.size());
	   System.out.println("Tree height: " + treeHeight(t.root));
      System.out.println("Tree max: " + max(t.root));
      System.out.println("Tree min: " + min(t.root));
      System.out.println("contains: " + contains(t.root, 34));
      System.out.println("contains: " + contains(t.root, 7));
      System.out.println("rank: " + t.rank(t.root));
      System.out.println(" " + deleteNode( t.root,  56));
      System.out.println(t.preOrder());
      System.out.println("delete node head is: " + deleteNode( t.root,  4));
      System.out.println(t.preOrder());
      System.out.println("delete node head is: " + deleteNode( t.root,  14));
      
      
      //System.out.println(" -12 is the " + findKth( t.root,  -12) + " node in the BST ");
  }
}


















 /* implement findKth method 
   -finding the Kth element in the tree
   -Node node, int n
   
    public static int findKth( Node node, int n)
	    { 
	       if (node == null)
	         return count;
	      
	      if (node.data == n)
	         {
	            count = node.data;
	            return count;
	         }
	         
	   
	      if (node.data < n) 
	         {  
	            count = node.data;
	            findKth(node.right, n);
	         }
	   
	         else if (node.data > n);
	         {
	            count = node.data; 
	            findKth(node.left, n);
	         }
	   return count;
	   }  
      */ 