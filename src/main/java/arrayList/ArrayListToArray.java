package arrayList;
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        System.out.println("ArrayList: " + stringList);

        System.out.println("Array after conversion:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

