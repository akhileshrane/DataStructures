package com.dsa.binarytree;


public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(7);
        tree.add(4);
        tree.add(9);
        tree.add(100);
        tree.add(6);
        tree.add(9);
        tree.add(10);

        Tree tree1 = new Tree();
        tree1.add(1);
        tree1.add(7);
        tree1.add(4);
        tree1.add(9);
        tree1.add(100);
        tree1.add(6);
        tree1.add(91);
        tree1.add(10);

        System.out.println(tree.find(65));
        
        //tree.preOrderTraversal();
        //tree.inorderTraversal();
        //tree.postOrderTraversal();

        //System.out.println(tree.height());

        System.out.println(tree.minimum());
        System.out.println(tree.equals(tree1));
    }
}
