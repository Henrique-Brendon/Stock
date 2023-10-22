package entities;

public class Node<T> {
    private T element;
    private Node left, righit;

    public Node(){

    }

    public Node(T element){
        this.element =  element;
        left =  null;
        righit = null;
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

    public Node getRighit() {
        return righit;
    }
    
    public void setRighit(Node righit) {
        this.righit = righit;
    } 
}


