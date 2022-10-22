/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package büt;

/**
 *
 * @author fikre
 * @param <V>
 */
public class Stack<V> {

    private class Node {

        V v;
        Node next;

        public Node(V v) {
            this.v = v;
        }
    }
    private int size;
    private Node head;

    public Stack() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(V v) {
        Node newNode = new Node(v);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public V pop() {
        if (head == null) {
            return null;
        }

        Node n = head;
        head = head.next;
        size--;

        return n.v;
    }

}
