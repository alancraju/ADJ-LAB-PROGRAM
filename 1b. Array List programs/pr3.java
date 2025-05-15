// Write a java program for getting different colors through ArrayList interface and sort them 
// using Collections.sort( ArrayListObj)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class pr3 {
    public static void main(String[] args) {
 

 List<String> arrayList = new ArrayList<>();
 arrayList.add("Apple");
 arrayList.add("Orange");
 arrayList.add("Banana");
 System.out.println("After adding elements: " + arrayList);
 Collections.sort(arrayList);
 System.out.println("After sorting: " + arrayList);
    }

    
}
