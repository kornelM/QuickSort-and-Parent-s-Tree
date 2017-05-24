package com.mycompany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kornel on 23.05.17.
 */
public class Node {
    String name;
    HashSet<Node> setOfNode = new HashSet<Node>();

    public Node(String name) {
        this.name = name;
    }

    public void setChild(Node node){
        this.setOfNode.add(node);
    }

    public String getName() {
        return name;
    }

    public Set<Node> getSetOfNode() {
        return setOfNode;
    }

    public void printTree (){
        Node temp = new Node("");

        while (this.getSetOfNode() != null){
            if (this.hasChild())
            System.out.println(this.getName() + " is parent of: " + this.getSetOfNode().toString());
        }
    }

    private boolean hasChild() {
        if (this.setOfNode == null)
            return false;
        else
            return true;
    }

    public String toString (){

        return this.getName();
    }


    public static void main(String[] args) {
        Node n1 = new Node("Kornel");
        Node n2 = new Node("Piotr");
        Node n3 = new Node("Justyna");
        Node n4 = new Node("Franciszek");
        Node n5 = new Node("Aloizy");
        Node n6 = new Node("Halina");
        Node n7 = new Node("Kuba");
        Node n8 = new Node("Lucjan");

        n1.setChild(n2);
//        n1.setChild(n3);
//
//        n2.setChild(n4);
//        n2.setChild(n5);
//
//        n3.setChild(n6);
//
//        n4.setChild(n7);
//        n4.setChild(n8);

        System.out.println(n1.getName());
        n1.printTree();


    }
}

