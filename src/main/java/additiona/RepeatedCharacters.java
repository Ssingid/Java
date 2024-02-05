package additiona;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatedCharacters {
    public ArrayList<Character> getRepeatedCharacters(String input) {
        ArrayList<Character> characterArrayList = new ArrayList<>();
        char[] charArray = input.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char c : charArray) {
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            } else characterIntegerHashMap.put(c, 1);
        }
        for(int i = 0; i < characterIntegerHashMap.size(); i++) {
            if(characterIntegerHashMap.get(charArray[i]) > 1)
                characterArrayList.add(charArray[i]);
        }
        return characterArrayList;
    }
}
