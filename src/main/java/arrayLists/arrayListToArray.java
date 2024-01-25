package arrayLists;
import java.util.ArrayList;
public class arrayListToArray {
    /*public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Convert ArrayList to an array of Strings
        String[] stringArray = convertArrayListToArray(stringList);

        System.out.println("Elements in the Array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }*/

    public static String[] convertArrayListToArray(ArrayList<String> list) {
        // Create a new array of Strings with the same size as the ArrayList
        String[] array = new String[list.size()];
        // Copy elements from ArrayList to the array
        list.toArray(array);

        return array;
    }
}
