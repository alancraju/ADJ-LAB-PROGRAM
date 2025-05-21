// Write a java program for getting different colors through ArrayList interface and extract the 
// elements 1st and 2nd from the ArrayList object by using SubList()

import java.util.ArrayList;
import java.util.List;

public class pr4 {
    
    public static void main(String[] args) {
 List<String> arrayList = new ArrayList<>();
 
 System.out.println("=== ArrayList Demonstrations ===");
 arrayList.add("Apple");
 arrayList.add("Banana");
 arrayList.add("Orange");
 System.out.println("After adding elements: " + arrayList);
 List<String> subList = arrayList.subList(0, 2);
 System.out.println("Sublist 0 to 2" + subList);
}
}
