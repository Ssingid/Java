package streams;

import streams.implementation.StringVowel;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowels implements StringVowel {


    @Override
    public boolean isVowel(char character) {
        return character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' ||
                character == 'u';
    }

    public Map<String, Integer> getVowelCount(String[] stringArray) {
        return Arrays.stream(stringArray)
                .collect(Collectors.toMap(stringKey -> stringKey,
                        countValue -> Math.toIntExact(countValue.chars()
                                .mapToObj(character -> (char) character)
                                .filter(this::isVowel)
                                .count())));

    }

}
