package additiona;

import java.util.HashMap;

public class CountUniqueWords {

    public int getCountUniqueWords(String input) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        if(input.isEmpty())
            return 0;
        String[] stringArray = input.split(" ");
        for(int i = 0; i < stringArray.length; i++) {
            if(stringIntegerHashMap.containsKey(stringArray[i])) {
                stringIntegerHashMap.put(stringArray[i], stringIntegerHashMap.get(stringArray[i]) + 1);
            }
            else stringIntegerHashMap.put(stringArray[i], 1);
        }
        int count = 0;
        for(int i = 0; i < stringIntegerHashMap.size(); i++) {
            if(stringIntegerHashMap.get(stringArray[i]) == 1)
                count++;
        }
        return count;
    }
}
