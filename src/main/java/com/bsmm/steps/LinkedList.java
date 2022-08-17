package com.bsmm.steps;

public class LinkedList {
    private Node root;

    public void add(char d) {
        Node newNode = new Node(d);
        if (root == null) {
            root = newNode;
            root.previous = root;
            root.next = root;
        } else {
            Node tmp = root;
            while (tmp.next != root) {
                tmp = tmp.next;
            }

            tmp.next = newNode;
            newNode.previous = tmp;
            newNode.next = root;
            root.previous = newNode;
        }
    }

    public long countMinimumSteps(char c, Node current) {
        long asc = searchAscendingOrder(c, current);
        long des = searchDescendingOrder(c, current);
        return Math.min(asc, des);
    }

    private long searchAscendingOrder(char c, Node current) {
        long steps = 0;
        Node tmp = current;
        while (tmp.next != current && tmp.value != c) {
            steps += 1;
            tmp = tmp.next;
        }
        return steps;
    }

    private long searchDescendingOrder(char c, Node current) {
        long steps = 0;
        Node tmp = current;
        while (tmp.previous != current && tmp.value != c) {
            steps += 1;
            tmp = tmp.previous;
        }
        return steps;
    }

    public Node getRoot() {
        return this.root;
    }

    public Node getCurrent(char c) {
        Node tmp = root;
        while (tmp.next != root && tmp.value != c) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void print() {
        Node aux = root;
        do {
            System.out.print(aux.value + " ");
            aux = aux.next;
        } while (aux != root);
        System.out.println("\n\n******************************\n");
    }
}
