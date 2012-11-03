package cz.pelantciz.strategy.generator;

import cz.pelantciz.strategy.Tree.Node;

public class SimpleTreeMaker implements IGenerator{
    private int count=0;
    private static final int MAX_LEVEL=2;
    @Override
    public Node generateTree() {
        Node root= new Node((count++)+"");
        generateNode(root, 0);
        return root;
    }

    
    private void generateNode(Node parent, int level) {
        Node left = new Node((count++)+"");
        Node right = new Node((count++)+"");
        parent.setLeft(left);
        parent.setRight(right);
        if(level<MAX_LEVEL) {
            generateNode(left, level+1);
            generateNode(right, level+1);
        }
        
    }
}
