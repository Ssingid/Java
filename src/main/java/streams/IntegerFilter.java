package streams;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerFilter {
    public List<Integer> getFilteredIntegers(List<Integer> integerList) {
        return integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
    }
}
