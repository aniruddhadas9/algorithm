package com.candifood.search;

/**
 * Created by adas008c on 9/11/2016.
 * <p>
 * <p>
 * These two terms differentiate between two different ways of walking a tree.
 * <p>
 * It is probably easiest just to exhibit the difference. Consider the tree:
 * <p>
 * A
 * / \
 * B   C
 * /   / \
 * D   E   F
 * A depth first traversal would visit the nodes in this order
 * <p>
 * A, B, D, C, E, F
 * Notice that you go all the way down one leg before moving on.
 * <p>
 * A breadth first traversal would visit the node in this order
 * <p>
 * A, B, C, D, E, F
 * Here we work all the way across each level before going down.
 * <p>
 * (Note that there is some ambiguity in the traversal orders, and I've cheated to maintain the "reading" order at each level of the tree. In either case I could get to B before or after C, and likewise I could get to E before or after F. This may or may not matter, depends on you application...)
 */

public class DepthFirstSearch {


}
