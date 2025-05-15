// Write a Java program to iterate a linked list in reverse order (using 
// objlist.descendingIterator())

import java.util.Iterator;
import java.util.LinkedList;

public class pr7 {


    public static void main(String[] args) {
        LinkedList<String> objlist = new LinkedList<>();
        objlist.add("Apple");
        objlist.add("Banana");
        objlist.add("Cherry");
        objlist.add("Orange");
        objlist.add("Mango");
        Iterator<String> iterator = objlist.descendingIterator();
        System.out.println("LinkedList in reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



