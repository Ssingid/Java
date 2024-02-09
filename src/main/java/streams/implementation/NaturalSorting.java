package streams;

import java.util.List;

public class NaturalSorting {
    public String getMaximumElement(List<String> stringList) {
        return stringList.stream()
                .max(String::compareTo)
                .orElse(null);
    }

}
