package arrayList;
import java.util.ArrayList;

public class TraverseList {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Mazda");
        stringList.add("Benz");
        stringList.add("Toyota");
        stringList.add("Chevy");

        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}










