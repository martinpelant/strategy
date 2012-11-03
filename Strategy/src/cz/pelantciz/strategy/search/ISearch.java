package cz.pelantciz.strategy.search;

import cz.pelantciz.strategy.Tree.Node;
import cz.pelantciz.strategy.display.IDisplay;

public interface ISearch {
    public void search(Node root, IDisplay display);
}
