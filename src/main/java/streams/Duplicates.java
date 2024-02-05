package streams;


import java.util.List;
import java.util.stream.Collectors;

    public class Duplicates {
        public List<Integer> removeDuplicates(List<Integer> integerList) {
            return integerList.stream()
                    .distinct()
                    .collect(Collectors.toList());
        }
    }
