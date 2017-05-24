package com.mycompany;

/**
 * Created by kornel on 23.05.17.
 */
public class ListItem {
    private ListItem next;
    private Object data;
    private ListItem previous;


    public ListItem(Object data) {
        this.data = data;
    }

    public ListItem(ListItem next, Object data, ListItem previous) {
        this.next = next;
        this.data = data;
        this.previous = previous;
    }

    public ListItem getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public static void main(String[] args) {
        ListItem n1 = new ListItem("kota.");
        ListItem n2 = new ListItem("ma ");
        ListItem n3 = new ListItem("Ala ");

        n1.setNext(null);
        n1.setPrevious(n2);

        n2.setNext(n1);
        n2.setPrevious(n3);

        n3.setNext(n2);
        n3.setPrevious(null);




        ListItem current = n1;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
