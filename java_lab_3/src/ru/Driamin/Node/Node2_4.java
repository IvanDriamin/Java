package ru.Driamin.Node;

public class Node2_4 {
    private int value;
    private Node2_4 parent, left, right;

    public Node2_4() {
        this.value = 0;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public Node2_4(int value, Node2_4 parent, Node2_4 left, Node2_4 right) {
        this.value = value;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public void add(int num) {
        if (value == 0) {
            if (this.left == null) {
                Node2_4 l = new Node2_4();
                this.left = l;
                l.parent = this;
            }
            if (this.right == null) {
                Node2_4 r = new Node2_4();
                this.right = r;
                r.parent = this;
            }
            this.value = num;
        } else {
            if (num > this.value) {
                this.right.value = num;
            } else {
                this.left.value = num;
            }
        }
    }

    public void delete() {

    }

//    public String toString() {
//
//    }
}
