
import entities.DoublyLinkedList;
import entities.Items;

public class App {
    public static void main(String args[]){


        Items items = new Items();

        DoublyLinkedList list = new DoublyLinkedList<>();

        for(int i = 0; i<10; i++){
            list.insertStart(items.generateList());
        }
        list.insertEnd("list");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("            	            ~~~~List Items~~~~");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(list.customToString());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(list.getSize());
    }

    
}

