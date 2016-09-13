package com.candifood.test.tree.binaryTree;

import com.candifood.tree.binaryTree.BinaryTree;
import com.candifood.tree.binaryTree.Node;
import org.junit.Test;

/**
 * Created by adas008c on 9/12/2016.
 */
public class BinaryTreeTest {

    @Test
    public void BinaryTreeOperation() {
        Node node = new BinaryTree().addNode(50, new Node());
        new BinaryTree().addNode(50, node);
        new BinaryTree().addNode(34, node);
        new BinaryTree().addNode(100, node);
        new BinaryTree().addNode(23, node);
        new BinaryTree().addNode(11, node);
        new BinaryTree().addNode(2, node);
        new BinaryTree().addNode(113, node);



    }
}
