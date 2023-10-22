package entities;

public class Node<T> {
    private T element;
    private Node left, right;

    public Node(){

    }

    public Node(T element){
        this.element =  element;
        left =  null;
        right = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }
    
    public void setRight(Node right) {
        this.right = right;
    } 
}


