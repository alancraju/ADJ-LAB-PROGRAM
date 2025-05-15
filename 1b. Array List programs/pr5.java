// Write a java program for getting different colors through ArrayList interface and delete nth 
// element from the ArrayList object by using remove by index

import java.util.ArrayList;
import java.util.List;

public class pr5 {
    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<>();
        arrlist.add("Apple");
        arrlist.add("Banana");
        arrlist.add("Orange");
        arrlist.add("Mango");
        System.out.println("Orginal list"+arrlist);
        arrlist.remove(1);
        System.out.println("After removing through index"+arrlist);
        arrlist.remove("Orange");
        System.out.println("After removing object"+arrlist);
        
    }
}
