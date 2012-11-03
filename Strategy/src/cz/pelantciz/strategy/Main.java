package cz.pelantciz.strategy;

import cz.pelantciz.strategy.generator.SimpleTreeMaker;
import cz.pelantciz.strategy.search.BreadthFirstSearch;
import cz.pelantciz.strategy.search.DepthFirstSearch;

public class Main {
    public static final String TAG = "Main";
    public static void main(String[] args) {
        new Tree(new SimpleTreeMaker()).search(new BreadthFirstSearch());
    }

}
