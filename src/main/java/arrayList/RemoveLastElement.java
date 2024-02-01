package arrayList;
import java.util.ArrayList;

public class RemoveLastElement {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");


        System.out.println("ArrayList before removal: " + stringList);

        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Removed the last object.");
        } else {
            System.out.println("ArrayList is already empty. Nothing to remove.");
        }

        System.out.println("ArrayList after removal: " + stringList);
    }
}