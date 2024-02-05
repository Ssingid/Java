package streams;

import java.util.List;

public class Squares {
    public int sumOfSquares(List<Integer> integerList) {
        return Math.toIntExact(integerList.stream()
                .filter(integer -> integer > 0)
                .mapToInt(integer -> integer * integer)
                .sum());
    }
}
