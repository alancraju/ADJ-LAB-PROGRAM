
// Write a Java program to iterate through all elements in a linked list starting at the 
// specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class pr6 {
    public static void main(String[] args) {
        
        List<String> arrlist = new LinkedList<>();
        arrlist.add("Apple");
        arrlist.add("Banana");
        arrlist.add("Orange");
        arrlist.add("Mango");
        System.out.println("Orginal list"+arrlist);
        Iterator<String> iterator = arrlist.listIterator(1);
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        
    }
    
}
}
