package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {
    public List<String> getListWithA(List<String> stringList, Predicate<String> isStartsWithA) {
        return stringList.stream()
                .filter(isStartsWithA)
                .collect(Collectors.toList());
    }
}
