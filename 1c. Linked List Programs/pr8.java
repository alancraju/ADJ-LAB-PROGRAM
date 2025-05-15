// Write a Java program to insert the specified element at the end of a linked list.( using 
// l_listobj.offerLast("Pink"))

import java.util.Iterator;
import java.util.LinkedList;

public class pr8 {

        public static void main(String[] args) {
            LinkedList<String> objlist = new LinkedList<>();
            objlist.add("Apple");
            objlist.add("Banana");
            objlist.add("Cherry");
            objlist.add("Date");
            objlist.add("Mango");
            System.out.println(objlist);
            objlist.offerLast("Pink");
            System.out.println("LinkedList elements:");
            for (String item : objlist) {
                System.out.println(item);
            }
        }
    }
    

