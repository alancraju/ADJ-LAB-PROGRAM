//10. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
// Collections.swap(l_list, 0, 2))


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class pr10 {
    public static void main(String[] args) {
        List<String> arrlist = new LinkedList<>();
        arrlist.add("Apple");
        arrlist.add("Banana");
        arrlist.add("Orange");
        arrlist.add("Mango");
        System.out.println("Orginal List"+arrlist);
        Collections.swap(arrlist,0,2);
        System.out.println(arrlist);
    }
    
}
