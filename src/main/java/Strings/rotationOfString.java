package strings;

public class rotationOfString {
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are different, return false if so
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        String string1 = readString.readingstring();
        String string2 = readString.readingstring();

        if (isRotation(string1, string2)) {
            System.out.println(string2 + " is a rotation of " + string1);
        } else {
            System.out.println(string2 + " is not a rotation of " + string1);
        }
    }
}
