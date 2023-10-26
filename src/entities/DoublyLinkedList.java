package entities;


public class DoublyLinkedList<T> {
    private Node start;
    private Node end;
    private int size;

    public DoublyLinkedList(){

    }

    private Node getStart() {
        return start;
    }

    private void setStart(Node start) {
        this.start = start;
    }

    private Node getEnd() {
        return end;
    }

    private void setEnd(Node end) {
        this.end = end;
    }

    public int getSize(){
        return size;
    }

    public boolean emptyList(){
        if(getStart() == null || getEnd() == null){
            return true;
        }
        return false;
    }

    public void insertStart(T element){
        Node node = new Node();
        node.setElement(element);
        node.setLeft(null);
        node.setRight(getStart());
        setStart(node);
        if(getStart() != null) {
            getStart().setLeft(node);
        }else if(emptyList()) {
            setEnd(getStart());
        }
        size++;
    }

    public void insertMid(int indice, T element){
        if(indice == 0) {
            insertStart(element);
        }else if(indice >= size){
            insertEnd(element);
        }else {
            Node local = getStart();
            for(int i = 0; i < indice - 1; i++){
                local =  local.getRight();
            }
            Node node = new Node();
            node.setElement(element);
            node.setLeft(local);
            node.setRight(local.getRight());
            local.setRight(node);
            node.getRight().setLeft(node);
            size++;
        }
    }

    public void insertEnd(T element){
        Node node = new Node();
        node.setElement(element);
        node.setRight(null);
        node.setLeft(getEnd());
        if(getEnd() != null) {
            getEnd().setRight(node);
        }
        setEnd(node);
        if(emptyList()) {
            setStart(getEnd());
        }
        size++;
    }

    public T removeStart(){
        if(emptyList()) {
            return null;
            //Handle exceptions
        }
        T out = (T)start.getElement();
        setStart(getStart().getRight());
        if(getStart() == null){
            setEnd(getStart());
        }
        size--;
        return out;
    }

    public void removeMid(int indice, T element){
        if(indice < 0 || indice >= getSize() || getStart() == null){
            System.out.println("Fail");
           // Handle exceptions
        }else if(indice == 0){
            removeStart();
        }else if(indice == size - 1){
            removeEnd();
        }
        Node local = getStart();
        for(int i = 0; i <indice; i++) {
            local =  local.getRight();
        }
        if(local.getLeft() != null) {
            local.getLeft().setRight(local.getRight());
        } 
        if(local.getRight() != null) {
            local.getRight().setLeft(local.getLeft());
        }
        size--;
    }

    public T removeEnd() {
        if(emptyList()){
            return null;
            // Handle exceptions
        }
        T out = (T) end.getElement();
        setEnd(getEnd().getLeft());
        if(end != null) {
            getEnd().setRight(null);
        }
        size --;
        return out;
    }



    public String toString(){
        if(emptyList()) {
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        Node<T> atual = getStart();
        str.append(atual.getElement()).append(", ");
        while(atual.getRight() != null) {
            atual = atual.getRight();
            str.append(atual.getElement()).append(", ");
        }
        return str.toString();
    }


    public String customToString() {
        StringBuilder str = new StringBuilder();
        Node<T> atual = getStart();
        str.append(atual.getElement()).append("\n");
        while(atual.getRight() != null) {
            atual = atual.getRight();
            str.append(atual.getElement()).append("\n");
        }
        return str.toString();
    }
}
