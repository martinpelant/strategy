package cz.pelantciz.strategy.display;

import cz.pelantciz.strategy.Tree.Node;

public class SimpleDisplay implements IDisplay{

    @Override
    public void print(Node node, int level) {
       System.out.println(node.getName()+", ");
    }
    
}
