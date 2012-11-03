
package cz.pelantciz.strategy;

import cz.pelantciz.strategy.display.IDisplay;
import cz.pelantciz.strategy.display.SimpleDisplay;
import cz.pelantciz.strategy.generator.IGenerator;
import cz.pelantciz.strategy.search.ISearch;

public class Tree {

    public static class Node {
        private Node left;
        private Node right;
        private String name;

        public Node(String name) {
            this.name = name;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public String getName() {
            return name;
        }

    }

    private Node root;

    public Tree(IGenerator generator) {
        root = generator.generateTree();
    }

    public void search(ISearch search) {
        search.search(root, new SimpleDisplay());
    }

    public void search(ISearch search, IDisplay display) {
        search.search(root, display);
    }

}
