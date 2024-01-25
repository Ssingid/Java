package strings;

public class vowelCount {
    public static void main(String[] args) {

        String inputString = readString.readingstring();

        int vowelCount = vowelsCounting(inputString);
        System.out.println("The number of vowels in the given string is: " + vowelCount);
    }

    public static int vowelsCounting(String inputString) {
        String vowels = "AEIOUaeiou";
        int count = 0;

        for (char c : inputString.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

}
