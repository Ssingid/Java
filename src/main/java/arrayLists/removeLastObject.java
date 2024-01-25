package arrayLists;
import java.util.ArrayList;
public class removeLastObject {


    public static ArrayList<Object> removeLastObject(ArrayList<Object> list) {
        // Check if the list is not empty before removing
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        return list;
    }
}
