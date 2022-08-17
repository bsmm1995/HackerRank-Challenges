package com.bsmm.steps;

public class Node {
    char value;
    Node previous;
    Node next;

    public Node(char value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
}
