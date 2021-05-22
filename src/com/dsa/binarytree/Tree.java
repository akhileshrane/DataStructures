package com.dsa.binarytree;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[ value=" + value + "]";
        }

        
    }

    private Node root;


    public void add(int insertedElement){
        Node node = new Node(insertedElement);

        var current = root;
        if(root==null){
            root = node;
            return;
        }

      while(true){
          if(current.value < insertedElement){
            if(current.rightChild == null){
                current.rightChild = node;
                break;
            } 
            current = current.rightChild;
          }
          else {
            if(current.leftChild == null){
                current.leftChild = node;
                break;
            } 
            current = current.leftChild;
          }
      }
                
    
    }

    public boolean find (int value){
        if(root == null){
            throw new IllegalAccessError();
        }
        Node current = root;

        if(current.value==value)
            return true;
        else {
            while(true){
                if(value > current.value){
                    if(current.rightChild==null){
                        return false;
                    } else{
                        current = current.rightChild;
                    }
                } else {
                    if(current.leftChild==null){
                        return false;
                    } else{
                        current = current.leftChild;
                    }
                }
                if(current.value==value)
                    return true;
            }
        }
        
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root){
        if(root==null)
            return;

        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root){
        if(root==null)
            return;
        
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);
        
    }

    public void inorderTraversal(){
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root){
        if(root==null)
            return;

        
        inorderTraversal(root.leftChild);
        System.out.println(root.value);
        inorderTraversal(root.rightChild);
    }

    public int height(){
        if(root==null){
            return -1;
        }
        return height(root);
    }

    private int height(Node root){
        if(root.leftChild==null && root.rightChild==null){
            return 0;
        }

        return 1 + Math.max(height(root.leftChild), height(root.leftChild));
    }


    public int minimum() {
        return minimum(root);
    }

    private int minimum(Node root) {

        if(root.leftChild==null){
            return root.value;
        }
        
        return minimum(root.leftChild);
        

    }


    public boolean equals(Tree tree1){
        return equals(root, tree1.root);
    }

    private boolean equals(Node root, Node tree1) {
        if(root==null && tree1==null)
            return true;

        if(root!=null && tree1!=null)
            return root.value==tree1.value 
                && equals(root.leftChild, tree1.leftChild)
                && equals(root.rightChild, tree1.rightChild);

        return false;

    }
}
