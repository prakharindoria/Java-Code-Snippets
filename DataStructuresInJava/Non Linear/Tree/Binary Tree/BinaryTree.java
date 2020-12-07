class Node{
int key;
Node left,right;

public Node(int item)
{
key=item;
left=right=null;
}


}

class BinaryTree{
Node root;

BinaryTree(int key){
root=new Node(key);
}

BinaryTree(){
root=null;
}

public void preOrder(Node node){
if(node != null){System.out.print(node.key+" ");
preOrder(node.left);
preOrder(node.right);
}
}



public static void main(String [] args){
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);

System.out.println("PreOrder Traversal is:");
tree.preOrder(tree.root);      


}



}