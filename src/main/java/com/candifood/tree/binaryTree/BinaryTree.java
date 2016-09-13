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

    private Node addDataToNode(int data, Node node) {
        node.setData(data);
        return node;
    }
}
