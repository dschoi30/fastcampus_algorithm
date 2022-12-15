package org.example;

public class SingleLinkedList<T> {

    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data) {
        if(head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void insertAfter(T newNode, T current) {
        Node<T> searchedNode = this.search(current);

        if(searchedNode == null) {
            this.addNode(newNode);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(newNode);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean remove(T data) {
        if(this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if(node.data == data) {
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null) {
                    if(node.next.data == data) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.insertAfter(9,2);
        sll.remove(1);
        sll.printAll();
    }
}