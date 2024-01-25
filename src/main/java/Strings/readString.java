package strings;

import java.util.*;

public class readString {
    public static String readingstring(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        return s;
    }
}
