
package cz.pelantciz.strategy.search;

import java.util.ArrayList;
import java.util.List;

import cz.pelantciz.strategy.Tree.Node;
import cz.pelantciz.strategy.display.IDisplay;

public class BreadthFirstSearch implements ISearch {

    @Override
    public void search(Node root, IDisplay display) {
        List<Node> rootLevel = new ArrayList<Node>();
        if (root != null)
            rootLevel.add(root);
        search(rootLevel, display, 0);
    }

    private void search(List<Node> levelNodes, IDisplay display, int level) {
        if (levelNodes.size() == 0)
            return;
        List<Node> nextLevel = new ArrayList<Node>();
        for (Node node : levelNodes) {
            display.print(node, level);
            Node leftChild = node.getLeft();
            Node rightChild = node.getRight();
            if (leftChild != null)
                nextLevel.add(leftChild);
            if (rightChild != null)
                nextLevel.add(rightChild);
        }
        search(nextLevel, display, level + 1);

    }

}
