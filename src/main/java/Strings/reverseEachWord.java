package strings;

public class reverseEachWord {
    public static String reverseEachWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);

        }

        // Join the reversed words back into a sentence
        return String.join(" ", words);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int x = 0;
        int j = charArray.length - 1;

        while (x < j) {
            char temp = charArray[x];
            charArray[x] = charArray[j];
            charArray[j] = temp;

            x++;
            j--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String sentence = readString.readingstring();

        String reversedSentence = reverseEachWord(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
