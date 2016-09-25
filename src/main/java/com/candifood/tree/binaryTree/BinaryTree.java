package com.candifood.tree.binaryTree;

/**
 * Created by Aniruddha Das on 2/6/2016.
 *
 * @desc: this program is designed to show the binary tree in action.
 */
public class BinaryTree {


    public Node addNode(int data, Node node) {
        System.out.println("addNode|data: "+data+", node.data: "+node); //

        if(node == null) {
            node.setData(data);
        }
        if(node.getData()==0) {
            System.out.println("null|data: "+node.getData());
            node.setData(data);
            return node;
        }
        if(data == node.getData()) {
            return node;
            //TODO it will go to infinite loop incase same value
        }
        if(data < node.getData()) {
            System.out.println("leftnode|data: "+node.getData());
            if(node.getLeft()!=null) {
                this.addNode(data, node.getLeft());
            } else  {
                node.setLeft(addDataToNode(data, new Node()));

            }

        }
        if(data > node.getData()) {
            System.out.println("rightnode|data: "+node.getData());
            if(node.getRight()!=null) {
                this.addNode(data, node.getRight());
            } else  {
                node.setRight(addDataToNode(data, new Node()));

            }

        }

        return node;
    }

    /**
     *
     * @param nodeToBeDeleted
     * @param BTree
     * The important thing is to reagange the elements in the
     * tree after deleting one element to make a perfrect tree again
     * @return 0 or 1 as true or false
     */
    public int deleteNode(Node nodeToBeDeleted, Node BTree) {
        int returnValue = 0;



        return 1;
    }

    /**
     * there are normally three types of travere
     * 1. pre order traverse
     * 2. in order traverse
     * 3. post order traverse
     *
     */
    public void traverse() {


    }

    private Node addDataToNode(int data, Node node) {
        node.setData(data);
        return node;
    }
}
