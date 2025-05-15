// Write a Java program to display elements and their positions in a linked list ( using
// l_listobj.get(p) )


import java.util.Iterator;
import java.util.LinkedList;

public class pr9 {
 
    public static void main(String[] args) {
        LinkedList<Integer> listobj = new LinkedList<>();
        listobj.add(10);
        listobj.add(20);
        listobj.add(30);
        listobj.add(40);
        listobj.add(50);
        System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < listobj.size(); i++) {
            System.out.println("Position " + i + ": " + listobj.get(i));
        }
    }
}


