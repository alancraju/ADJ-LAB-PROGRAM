//2. Write a java program for getting different colors through ArrayList interface and remove the 
// 2nd element and color "Blue" from the ArrayList (using remove by index and remove by 
// object)

import java.util.ArrayList;
import java.util.List;

public class pr2 {
    public static void main(String[] args){
        List<String> arrlist = new ArrayList<>();
        arrlist.add("Apple");
        arrlist.add("Banana");
        arrlist.add("Orange");
        arrlist.add("Mango");
        System.out.println("Orginal list"+arrlist);
        arrlist.remove(1);
        System.out.println(arrlist);
        arrlist.remove("Mango");
        System.out.println(arrlist);

    }
}
