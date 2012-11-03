
package cz.pelantciz.strategy.search;

import cz.pelantciz.strategy.Tree.Node;
import cz.pelantciz.strategy.display.IDisplay;

public class DepthFirstSearch implements ISearch {
    @Override
    public void search(Node root, IDisplay display) {
        search(root, display, 0);
    }

    private void search(Node node, IDisplay display, int level) {
        if (node == null)
            return;
        display.print(node, level);
        search(node.getLeft(), display, level + 1);
        search(node.getRight(), display, level + 1);
    }

}
