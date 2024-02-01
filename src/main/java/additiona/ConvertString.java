package additiona;

public class ConvertString {
    public String convertString(String input) {
        String outputString = "";
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                outputString += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c))
                outputString += Character.toLowerCase(c);
            else
                outputString += c;

        }
        return outputString.toString();
    }
}
